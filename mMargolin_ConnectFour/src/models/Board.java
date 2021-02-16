package models;

public class Board {

    public void placePiece(char in) {

    }

    public void printBoard(char[][] in, String p1, String p2) {
        System.out.println("---------------");
        System.out.println("[ " + p1 + " ]" + " -- " + "[ " + p2 + " ]");
        for (int a = 0; a < 6; a++) {
            System.out.println();
            for (int i = 0; i < 7; i++) {
                System.out.print("[" + in[i][a] + "] ");
            }
        }
    }
}
