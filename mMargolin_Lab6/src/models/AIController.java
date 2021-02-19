package models;

import interfaces.Player;

import java.util.Random;

public class AIController implements Player {
    String name = "AI";  // AI Name is "AI" on Default unless changed
    String color;

    @Override
    public void setName(String in) {
        System.out.println("Your AI name is: " + in);
        name = in;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setColor(String in) {
        System.out.println(this.name + " has been given the color: " + in);
        color = in;
    }

    @Override
    public String getColor() {
        return color;
    }


    public int takeTurn() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

}
