package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        Button firstToSecondButton = new Button("To the second view!");
        Button secondToThirdButton = new Button("To the third view!");
        Button thirdToFirstButton = new Button("To the first view!");

        BorderPane firstLayout = new BorderPane();
        firstLayout.setTop(new Label("First view!"));
        firstLayout.setCenter(firstToSecondButton);

        VBox secondLayout = new VBox();
        secondLayout.getChildren().addAll(secondToThirdButton,new Label("Second view!"));

        GridPane thirdLayout = new GridPane();
        thirdLayout.add(new Label("Third view!"),0,0);
        thirdLayout.add(thirdToFirstButton,1,1);

        Scene first = new Scene(firstLayout);
        Scene second = new Scene(secondLayout);
        Scene third = new Scene(thirdLayout);

        firstToSecondButton.setOnAction((event) -> {
            stage.setScene(second);
        });

        secondToThirdButton.setOnAction((event) -> {
            stage.setScene(third);
        });

        thirdToFirstButton.setOnAction((event) -> {
            stage.setScene(first);
        });

        stage.setScene(first);
        stage.show();
    }
}
