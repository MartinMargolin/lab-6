package models;

import interfaces.Player;

public class AIController implements Player
{
    String name = "AI";  // AI Name is "AI" on Default unless changed
    String color;

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

    @Override
    public void setColor(String in)
    {
        System.out.println("You have chosen color: " + in );
        color = in;
    }

    public int takeTurn(char[][] in)
    {
        return 0;
    }


}
