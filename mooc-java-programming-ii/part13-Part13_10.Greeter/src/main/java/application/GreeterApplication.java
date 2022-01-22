package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label instructionText = new Label("Enter your name and start.");
        TextField enterName = new TextField();
        Button startButton = new Button("Start");

        GridPane layout = new GridPane();
        layout.add(instructionText,0,0);
        layout.add(enterName,0,1);
        layout.add(startButton,0,2);

        layout.setPrefSize(300,180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20,20,20,20));

        Scene first = new Scene(layout);

        GridPane secondLayout = new GridPane();
        secondLayout.setPrefSize(300,180);
        secondLayout.setAlignment(Pos.CENTER);
        secondLayout.setVgap(10);
        secondLayout.setHgap(10);
        secondLayout.setPadding(new Insets(20,20,20,20));

        Scene second = new Scene((secondLayout));

        startButton.setOnAction((event) -> {
            secondLayout.add(new Label("Welcome " + enterName.getText() + "!"),0,0);
            stage.setScene(second);
        });

        stage.setScene(first);
        stage.show();
    }
}
