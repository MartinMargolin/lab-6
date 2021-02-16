package models;

import interfaces.Player;

public class AIController implements Player
{
    String name = "AI";  // AI Name is "AI" on Default unless changed
    String color;

    @Override
    public void setName(String in)
    {
        System.out.println("Your AI name is: " + in);
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

    @Override
    public String getColor(){
        return color;
    }

    public int takeTurn()
    {
        return 0;
    }


}
