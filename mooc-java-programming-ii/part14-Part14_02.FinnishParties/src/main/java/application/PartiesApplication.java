package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        DataIngester dataIngester = new DataIngester("F:\\IdeaProjects\\TMCProjects\\mooc-java-programming-ii\\part14-Part14_02.FinnishParties\\partiesdata.tsv");
        List<Integer> years = dataIngester.getYears();
        Map<String, ArrayList<Double>> partyData = dataIngester.getPartyData();

        NumberAxis xAxis = new NumberAxis(years.get(0),years.get(years.size()-1),4);
        NumberAxis yAxis = new NumberAxis(0,30,4);

        LineChart<Number,Number> lineChart = new LineChart<>(xAxis,yAxis);
        lineChart.setTitle("Relative support of the parties");

        LineChart<Number,Number> populatedChart = populateChartWithData(years,partyData,lineChart);

        Scene view = new Scene(populatedChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public LineChart<Number,Number> populateChartWithData(List<Integer> years, Map<String,ArrayList<Double>> partyData, LineChart<Number,Number> lineChart) {
        for (String party :
                partyData.keySet()) {
            XYChart.Series partySeries = new XYChart.Series();
            partySeries.setName(party);
            for (int i = 0; i < years.size(); i++) {
                if (!partyData.get(party).get(i).toString().equals("-1.0")) {
                    partySeries.getData().add(new XYChart.Data(years.get(i),partyData.get(party).get(i)));
                }
            }
            lineChart.getData().add(partySeries);
        }
        return lineChart;
    }
}
