package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ListIterator;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        // CORE UI
        BorderPane mainLayout = new BorderPane();
        VBox sliderLayout = new VBox();

        NumberAxis xAxis = new NumberAxis(0,30,1);
        NumberAxis yAxis = new NumberAxis();
        LineChart<Number,Number> savingsChart = new LineChart<>(xAxis,yAxis);
        savingsChart.setTitle("Savings");

        // SLIDERS LOGIC
        Label savingsLabel = new Label("25");
        Label interestLabel = new Label("0");

        Slider savingsSlider = createSlider(25,250,25, savingsLabel);
        savingsSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                double interestRounded =  round(Double.parseDouble(interestLabel.textProperty().getValue()),1);
                double savingsRounded = round(t1.doubleValue(),1);
                savingsLabel.textProperty().setValue(
                        String.valueOf(savingsRounded)
                );
                updateGraphs(savingsChart,savingsRounded,interestRounded);
            }
        });

        Slider interestSlider = createSlider(0,10,0, interestLabel);
        interestSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                double interestRounded = round(t1.doubleValue(),1);
                double savingsRounded = round(Double.parseDouble(savingsLabel.textProperty().getValue()),1);
                interestLabel.textProperty().setValue(
                        String.valueOf(interestRounded)
                );
                updateGraphs(savingsChart,savingsRounded,interestRounded);
            }
        });

        // CREATE INITIAL GRAPH
        updateGraphs(savingsChart,25,0);

        // RENDER UI
        BorderPane savingsSliderLayout = createBorderPane(new Label("Monthly savings"),savingsSlider,savingsLabel);
        BorderPane interestSliderLayout = createBorderPane(new Label("Yearly interest rate"),interestSlider,interestLabel);
        sliderLayout.getChildren().addAll(savingsSliderLayout,interestSliderLayout);

        mainLayout.setTop(sliderLayout);
        mainLayout.setCenter(savingsChart);

        Scene scene = new Scene(mainLayout,640,480);
        stage.setScene(scene);
        stage.show();
    }

    private void updateGraphs(LineChart<Number,Number> chart, double savings, double interest) {
        chart.getData().clear();

        XYChart.Series savingsSeries = new XYChart.Series();
        XYChart.Series<Number,Number> interestSeries = new XYChart.Series();

        double yearlySavings = 0;
        double totalSavings = 0;
        double interestRate = (interest > 0) ? interest/100 : 0;
        for (int i = 0; i < 30; i++) {
            yearlySavings = savings*12;

            savingsSeries.getData().add(new XYChart.Data<>(i,yearlySavings*i));
            interestSeries.getData().add(new XYChart.Data<>(i,(yearlySavings+totalSavings) + (yearlySavings+totalSavings)*interestRate));

            totalSavings += (yearlySavings) + (yearlySavings+totalSavings)*(interestRate);
        }
        chart.getData().add(savingsSeries);
        chart.getData().add(interestSeries);
    }

    private BorderPane createBorderPane(Node left, Node center, Node right) {
        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(left);
        borderPane.setCenter(center);
        borderPane.setRight(right);

        return borderPane;
    }

    private Slider createSlider(double min, double max, double val, Label label) {
        Slider slider = new Slider(min,max,val);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        slider.setMajorTickUnit(max/10);
        slider.setBlockIncrement(max/10/5);

        return slider;
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
