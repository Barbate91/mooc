package ticTacToe;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class GameTracker {
    private static boolean isXTurn = true;
    private static Label turnTitle;
    private static GridPane gameGrid;
    private static Button[][] gridPaneArray = null;
    private static boolean gameEnded = false;


    public static void checkEndOfGame() {
        if (isGameOver()) {
            turnTitle.setText("The end!");
            gameEnded = true;
        }
    }

    public static boolean isGameOver() {
        return checkWinHorizontal() || checkWinVertical() || checkWinDiagonal() || checkTie();
    }

    private static boolean checkWinHorizontal() {
        for (int i = 0; i < 3; i++) {
            int winCounterX = 0;
            int winCounterO = 0;
            for (int j = 0; j < 3; j++) {
                String cellValue = gridPaneArray[i][j].getText();
                if (cellValue.equals("X"))
                    winCounterX++;
                else if (cellValue.equals("O"))
                    winCounterO++;
            }
            if (winCounterX == 3 || winCounterO == 3)
                return true;
        }
        return false;
    }

    private static boolean checkWinVertical() {
        for (int i = 0; i < 3; i++) {
            int winCounterX = 0;
            int winCounterO = 0;
            for (int j = 0; j < 3; j++) {
                String cellValue = gridPaneArray[j][i].getText();
                if (cellValue.equals("X"))
                    winCounterX++;
                else if (cellValue.equals("O"))
                    winCounterO++;
            }
            if (winCounterX == 3 || winCounterO == 3)
                return true;
        }
        return false;
    }

    private static boolean checkWinDiagonal() {
        int winCounterX = 0;
        int winCounterO = 0;
        for (int i = 0; i < 3; i++) {
                String cellValue = gridPaneArray[i][i].getText();

                if (cellValue.equals("X"))
                    winCounterX++;
                else if (cellValue.equals("O"))
                    winCounterO++;

        }
        if (winCounterX == 3 || winCounterO == 3)
            return true;

        // Check other direction
        winCounterX = 0;
        winCounterO = 0;
        for (int i = 0; i < 3; i++) {
            String cellValue = gridPaneArray[i][gridPaneArray.length-i-1].getText();

            if (cellValue.equals("X"))
                winCounterX++;
            else if (cellValue.equals("O"))
                winCounterO++;
        }
        if (winCounterX == 3 || winCounterO == 3)
            return true;

        return false;
    }

    public static boolean checkTie() {
        for (Button[] gridRow : gridPaneArray) {
            for (Button gridCell : gridRow) {
                if (gridCell.getText().equals(" "))
                    return false;
            }
        }
        return true;
    }

    private static void initializeGridPaneArray() {
        gridPaneArray = new Button[3][3];
        for (Node node :
                gameGrid.getChildren()) {
            gridPaneArray[GridPane.getRowIndex(node)][GridPane.getColumnIndex(node)] = (Button) node;
        }
    }

    public static String takeTurn() {
        String symbol = getSymbol();
        
        isXTurn = !isXTurn;
        
        updateTurnTitle(getSymbol());
        
        return symbol;
    }
    
    public static String getSymbol() {
        String turnSymbol;
        if (isXTurn)
            turnSymbol = "X";
        else
            turnSymbol = "O";
        return turnSymbol;
    }
    
    private static void updateTurnTitle(String symbol) {
        turnTitle.setText("Turn: " + symbol);
    }

    public static boolean getGameEnded() {
        return gameEnded;
    }

    public static void setTurnTitle(Label title) {
        turnTitle = title;
    }
    
    public static void setGameGrid(GridPane grid) {
        gameGrid = grid;
        initializeGridPaneArray();
    }

}
