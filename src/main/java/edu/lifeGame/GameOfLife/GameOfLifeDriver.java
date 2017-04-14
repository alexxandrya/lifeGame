package edu.lifeGame.GameOfLife;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.lifeGame.logic.*;
import org.apache.log4j.Logger;

public class GameOfLifeDriver {
    private static final Logger LOG = Logger.getLogger(GameOfLifeDriver.class);

    private static TakeTurnObserver turnObserver = null;
   // private static SpinObserver spinObserver = new SpinObserver();
    private static final LifeGame game = new LifeGame();

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        try {
            StringBuilder menuOutput = new StringBuilder();
            menuOutput.append("\nWelcome to Game of life Simulator!\n");
            menuOutput.append("\nEnter: \n1 New game");
            menuOutput.append("\n0 Exit\n\n");
            boolean gameFlag = true;
            while (gameFlag) {
                System.out.print(menuOutput.toString());
                int input = console.nextInt();
                switch (input) {
                    case 1:
                        game.playGame();
                        break;

                    case 0:
                        gameFlag = false;
                        break;

                    default:
                        System.out.println("Invalid Input. Please try again!");
                }
            }
            System.out.println("Thank you for using the Game of Life Simulator!");
        }catch (Exception e){
            Thread.sleep(100L);
            e.printStackTrace();
        }
    }


}
