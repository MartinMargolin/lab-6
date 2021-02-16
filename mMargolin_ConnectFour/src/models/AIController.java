package models;

import interfaces.Player;

public class AIController implements Player
{
    String name = "AI";  // AI Name is "AI" on Default unless changed

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

    public int takeTurn(char[][] in)
    {
        return 0;
    }
}
