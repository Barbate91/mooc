package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.*;
import java.util.Map;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        DataIngester dataIngester = new DataIngester("F:\\IdeaProjects\\TMCProjects\\mooc-java-programming-ii\\part14-Part14_01.Shanghai\\src\\data.txt");
        Map<Integer,Integer> dataMap = dataIngester.getData();

        NumberAxis xAxis = new NumberAxis(2006,2018,4);
        NumberAxis yAxis = new NumberAxis(50,80,4);

        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        LineChart<Number,Number> lineChart = new LineChart<>(xAxis,yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");

        XYChart.Series data = new XYChart.Series();

        for (Integer key :
                dataMap.keySet()) {
            data.getData().add(new XYChart.Data(key,dataMap.get(key)));
        }

        lineChart.getData().add(data);

        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }
}
