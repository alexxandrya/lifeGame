package edu.lifeGame.GameOfLife;

import edu.lifeGame.logic.*;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class LifeGame extends Observable {

    private final List<Player> players = new ArrayList();
    private final Board board = Board.getInstance();
    private final Spin spinner = new Spin();

    private final int ROUNDS_TOTAL = 20;
    private int round = 1;
    private boolean gameFlag = true;

    public LifeGame() {
        players.add(new Player("Player1", board, spinner));
        players.add(new Player("Player2", board, spinner));
    }

    public void playGame() throws Exception{
        //spin = new Spin();

        for (Player player : players) {
            player.setSalary(Salary.returnSalary(spinner.spin()));
            System.out.println("Your new salary is" + player.getSalary());

            player.setCareer(Career.getCareer(spinner.spin()));
            System.out.println("Your new Career is:" + player.getCareer());
        }

        while (round <= ROUNDS_TOTAL) {
            Thread.sleep(1000L);
            System.out.println("########################################################################");
            System.out.println("Playing Round " + round);
            playRound();
            round++;
        }
    }

    public List getPlayers() {
        return players;
    }

    private void playRound() {
        for (Player player : players) {
            player.takeTurn();
        }
    }

    public void setGameFlag(boolean flag) {
        gameFlag = flag;
    }

    public int getRound() {
        return round;
    }

    public Spin getVaule() {
        return spinner;
    }

}