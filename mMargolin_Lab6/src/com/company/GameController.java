package com.company;

import models.AIController;
import models.Board;
import models.HumanController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameController {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));




    public void run() {

  /*
        Board test = new Board();
        test.placePiece("R",3);
        test.placePiece("Y", 3);
        test.printBoard("a", "b");
 */

        mainMenu();

    }

    public void humanVHuman() {
        String in;
        HumanController P1 = new HumanController();
        HumanController P2 = new HumanController();

        System.out.println("Player one enter name: ");

        in =  input();
        if (in != "")
        {
            P1.setName(in);
        } else { P1.setName("Human1"); }

        System.out.println("Player two enter name");

        in = input();
        if (in != "")
        {
            P2.setName(in);
        } else { P2.setName("Human2"); }

    }

    public void humanVComp() {
        String in;
        HumanController P1 = new HumanController();
        AIController P2 = new AIController();

        System.out.println("Player one enter name: ");

        in =  input();
        if (in != "")
        {
            P1.setName(in);
        } else { P1.setName("Human1"); }


    }

    public void compVComp() {

    }

    public void mainMenu() {
        System.out.println("\n\n");
        String mainMenu = new StringBuilder("Main Menu\n\n").
                append("1) Human vs. Human\n").
                append("2) Human vs. Comp\n").
                append("3) Comp vs. Comp\n").
                append("0) Exit\n\n").append("Enter the number of your selection: ").toString();
        int minOption = 0;
        int maxOption = 3;
        int userChoice = promptForInt(mainMenu, minOption, maxOption);


        do {

            switch (userChoice)
            {
                case 1:
                    humanVHuman();
                    break;
                case 2:
                    humanVComp();
                    break;
                case 3:
                    compVComp();
                    break;
            }

        } while (userChoice > 0);
    }

    private int promptForInt(String prompt, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("The min cannot be greater than the max. min: " + min + ", max: " + max);
        }

        int userNum = -1;
        String input = null;
        boolean isInvalid = true;

        do {
            System.out.print(prompt);
            try {
                input = bufferedReader.readLine();
                userNum = Integer.parseInt(input);
                isInvalid = userNum < min || userNum > max;
            } catch (IOException ioe) {
                System.out.println("Whoa! Something technical went wrong. Let's try that again.");
            } catch (NumberFormatException nfe) {

            }

            if (isInvalid) {
                System.out.println("You entered an invalid value. Please, try again.");
            }
        } while (isInvalid);

        return userNum;
    }

    public String input()
    {
        System.out.print("Input: ");
        String input = "";
        try
        {
            input = bufferedReader.readLine();
        } catch(Exception e){
            System.out.println("Slow down there pal lets try that again...");
        }

        System.out.println(input);
        return input;
    }

    //I think it's fine
}
