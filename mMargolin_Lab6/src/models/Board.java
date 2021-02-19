package models;

public class Board {

    int lastIndexH;
    int lastIndexV;

    String[][] board = new String[][]
            {
                    {"0", "0", "0", "0", "0", "0", "0"},
                    {"0", "0", "0", "0", "0", "0", "0"},
                    {"0", "0", "0", "0", "0", "0", "0"},
                    {"0", "0", "0", "0", "0", "0", "0"},
                    {"0", "0", "0", "0", "0", "0", "0"},
                    {"0", "0", "0", "0", "0", "0", "0"}
            };

    public void placePiece(String in, int column) {
        boolean placed = false;
        int i = 5;
        do {
            if (board[i][column - 1] != "0") {
                i--;
            } else if (board[i][column - 1] == "0") {
                board[i][column - 1] = in;
                placed = true;
            }
        } while (placed == false);
        lastIndexH = column;
        lastIndexV = i;

        System.out.println(lastIndexH + ", " + lastIndexV);


    }

    public void printBoard(String p1, String p2) {
        System.out.println("---------------");
        System.out.println("[ " + p1 + " ]" + " -- " + "[ " + p2 + " ]");
        for (int a = 0; a < 6; a++) {
            System.out.println();
            for (int i = 0; i < 7; i++) {
                System.out.print("[" + board[a][i] + "] ");
            }
        }

    }

    public boolean checkWinner(String color) {
        boolean winState = false;

        try {
            for (int i = 0; i < board.length; i++)  // HORIZONTAL CHECK
            {
                for (int j = 0; j < board[i].length - 3; j++) {
                    if (board[i][j] == color && board[i][j + 1] == color && board[i][j + 2] == color && board[i][j + 3] == color) {
                        winState = true;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException AIOB) {

        }

        try {
            for (int i = 0; i < board.length; i++)  // VERTICAL CHECK
            {
                for (int j = 0; j < board[i].length - 3; j++) {
                    if (board[i][j] == color && board[i + 1][j] == color && board[i + 2][j] == color && board[i + 3][j] == color) {
                        winState = true;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException AIOB) {

        }

        try {
            for (int i = 0; i < board.length; i++)  // DIAGONAL LEFT CHECK
            {
                for (int j = 0; j < board[i].length - 3; j++) {
                    if (board[i][j] == color && board[i + 1][j - 1] == color && board[i + 2][j - 2] == color && board[i + 3][j - 3] == color) {
                        winState = true;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException AIOB) {

        }

        try {
            for (int i = 0; i < board.length; i++)  // DIAGONAL RIGHT CHECK
            {
                for (int j = 0; j < board[i].length - 3; j++) {
                    if (board[i][j] == color && board[i + 1][j + 1] == color && board[i + 2][j + 2] == color && board[i + 3][j + 3] == color) {
                        winState = true;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException AIOB) {

        }


        return winState;
    }


}


   /*
   private static boolean checkHorizontal(Piece piece) {
        for (int i = 0; i < b.getGrid().length ; i++) {
            for (int j = 0; j < b.getGrid()[i].length-3 ; j++)
                if (b.getGrid()[i][j] == (piece) && b.getGrid()[i][j+1] == piece && b.getGrid()[i][j+2] == piece && b.getGrid()[i][j+3] == piece) {
                    return true;
                }
        }
        return false;
    }
*/