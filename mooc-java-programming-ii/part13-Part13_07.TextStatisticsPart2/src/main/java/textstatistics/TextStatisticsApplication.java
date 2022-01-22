package textstatistics;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label letterCount = new Label("Letters: 0");
        Label wordCount = new Label("Words: 0");
        Label longestWord = new Label("The longest word is:");

        TextArea textArea = new TextArea();
        textArea.textProperty().addListener((change,oldValue,newValue) -> {
            int letters = newValue.length();
            letterCount.setText("Letters: " + letters);

            String[] parts = newValue.split(" ");
            int words = parts.length;
            wordCount.setText("Words: " + words);

            String longest = Arrays.stream(parts)
                    .sorted((s1,s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            longestWord.setText("The longest word is: " + longest);
        });


        HBox hbox = new HBox();
        hbox.setSpacing(10);

        hbox.getChildren().add(letterCount);
        hbox.getChildren().add(wordCount);
        hbox.getChildren().add(longestWord);

        BorderPane layout = new BorderPane();

        layout.setCenter(textArea);
        layout.setBottom(hbox);

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }
}
