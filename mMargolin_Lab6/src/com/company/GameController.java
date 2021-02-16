package com.company;

import models.Board;

public class GameController
{
    public void run()
    {
        char[][] test = new char[7][6];
        new Board().printBoard(test, "James", "Cunt");

        new Board().printBoard(test, "A", "B");
    }

}
