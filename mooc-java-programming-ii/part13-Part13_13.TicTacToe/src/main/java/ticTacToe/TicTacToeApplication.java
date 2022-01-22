package ticTacToe;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label turn = new Label("Turn: X");
        GameTracker.setTurnTitle(turn);

        GridPane grid = new GridPane();
        populateGridWithButtonsAndHandlers(grid);
        GameTracker.setGameGrid(grid);

        BorderPane layout = new BorderPane();
        layout.setTop(turn);
        layout.setCenter(grid);

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();

    }

    private Button createButton() {
        Button newBtn = new Button(" ");
        newBtn.setFont(Font.font("Monospaced",40));
        return newBtn;
    }

    private void populateGridWithButtonsAndHandlers(GridPane grid) {
        grid.setPadding(new Insets(20,20,20,20));
        grid.setHgap(10);
        grid.setVgap(10);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button btn = createButton();
                addTTTHandler(btn);
                grid.add(btn,i,j);
            }
        }
    }

    private void addTTTHandler(Button btn) {
        btn.setOnMouseClicked((event) -> {
            if (!isToeTickOrTacced(btn)) {
                if (!GameTracker.getGameEnded()) {
                    btn.setText(GameTracker.takeTurn());
                    GameTracker.checkEndOfGame();
                }
            }
        });
    }

    private boolean isToeTickOrTacced(Button btn) {
        return !btn.getText().equals(" ");
    }
}
