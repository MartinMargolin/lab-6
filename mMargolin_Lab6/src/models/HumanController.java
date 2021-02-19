package models;

import interfaces.Player;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HumanController implements Player
{

    String name = "Human"; // default
    String color;

    @Override
    public void setName(String in)
    {
        System.out.println("Your player name is: "  + in);
        name = in;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setColor(String in)
    {
        System.out.println(this.name + " has been given the color: " + in );
        color = in;
    }

    @Override
    public String getColor()
    {
        return color;
    }



}
