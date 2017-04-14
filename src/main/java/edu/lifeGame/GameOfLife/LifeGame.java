package edu.lifeGame.GameOfLife;

import edu.lifeGame.logic.*;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

public class LifeGame extends Observable {

    private static final Logger LOG = Logger.getLogger(LifeGame.class);

    private final int ROUNDS_TOTAL = 20;
    private final List<Player> players = new ArrayList();
    private final Board board = Board.getInstance();
    private final Spin spinner = new Spin();
    private int round = 0;
    private boolean gameFlag = true;


    public LifeGame() {
        players.add(new Player("Player1", board, spinner));
        players.add(new Player("Player2", board, spinner));
        LOG.info("LifeGame created");
    }

    public void playGame() {
        //spin = new Spin();

        for (Player player : players) {
            player.setSalary(Salary.returnSalary(spinner.spin()));
            System.out.println("Your new salary is" + player.getSalary());

            player.setCareer(Career.getCareer(spinner.spin()));
            System.out.println("Your new Career is:" + player.getCareer());
        }


        for (; round < ROUNDS_TOTAL; round++) {

            System.out.println(round);
            playRound();
            setChanged();
            notifyObservers(this);
            if (!gameFlag) {
                round++;
                gameFlag = true;
                break;
            }
        }
    }

    public List getPlayers() {
        return players;
    }

    private void playRound() {
        for (Iterator iter = players.iterator(); iter.hasNext(); ) {
            Player player = (Player) iter.next();
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