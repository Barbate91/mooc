
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int number = 1;
        int row = 0;
        int column = size/2;

        while (number <= size*size) {
            square.placeValue(row,column,number);
            number++;
            int currentRow = row;
            int currentCol = column;
            row--;
            column++;

            if (row < 0)
                row = size-1;

            if (column > size-1)
                column = 0;

            if (square.readValue(row,column) > 0) {
                row = currentRow + 1;
                column = currentCol;
                if (row < 0) {
                    row = size-1;
                }
            }

        }
        return square;
    }

}
