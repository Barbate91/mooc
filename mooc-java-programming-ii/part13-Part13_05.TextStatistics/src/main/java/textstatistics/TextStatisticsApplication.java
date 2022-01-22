package textstatistics;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label textComponent1 = new Label("Letters: 0");
        Label textComponent2 = new Label("Words: 0");
        Label textComponent3 = new Label("The longest word is:");

        HBox hbox = new HBox();
        hbox.setSpacing(10);

        hbox.getChildren().add(textComponent1);
        hbox.getChildren().add(textComponent2);
        hbox.getChildren().add(textComponent3);

        BorderPane layout = new BorderPane();

        layout.setCenter(new TextArea());
        layout.setBottom(hbox);

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }
}
