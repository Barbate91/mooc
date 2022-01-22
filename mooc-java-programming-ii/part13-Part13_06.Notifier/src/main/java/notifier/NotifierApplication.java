package notifier;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        TextField textField = new TextField();
        Button button = new Button("Update");
        Label label = new Label();

        button.setOnAction((event) -> {
            label.setText(textField.getText());
        });

        VBox componentGroup = new VBox();
        componentGroup.setSpacing(10);
        componentGroup.getChildren().addAll(textField,button,label);

        Scene scene = new Scene(componentGroup);

        stage.setScene(scene);
        stage.show();
    }
}
