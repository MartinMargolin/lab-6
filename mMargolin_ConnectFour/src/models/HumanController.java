package models;

import interfaces.Player;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HumanController implements Player
{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String name;
    @Override
    public void setName(String in)
    {
    name = in;
    }
    @Override
    public String getName()
    {
        return name;
    }

}
