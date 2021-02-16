package com.company;

import models.Board;

public class GameController
{
    public void run()
    {
        Board testBoard = new Board();
        testBoard.placePiece("R", 3,6);
        testBoard.printBoard("A", "B");

    }

}
