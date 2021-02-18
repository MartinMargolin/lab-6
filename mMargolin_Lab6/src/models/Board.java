package models;

public class Board {

    String[][] board = new String[][]
            {
                    {"0","0","0","0","0","0","0"},
                    {"0","0","0","0","0","0","0"},
                    {"0","0","0","0","0","0","0"},
                    {"0","0","0","0","0","0","0"},
                    {"0","0","0","0","0","0","0"},
                    {"0","0","0","0","0","0","0"}
            };

    public void placePiece(String in, int column)
    {
        boolean placed = false;
        int i = 5;
        do {
            if (board[i][column-1] != "0")
            {
                i--;
            } else if (board[i][column-1] == "0")
            {
                board[i][column-1] = in;
                placed = true;
            }
        } while(placed == false);

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

    public boolean checkWinner(int player)
    {

        return false;
    }



}
