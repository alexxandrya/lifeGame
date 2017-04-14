package edu.lifeGame.logic;

import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Board implements Serializable {

    private static final Logger LOG = Logger.getLogger(Board.class);

    private static final int SIZE = 50;
    private List squares = new ArrayList(SIZE);
    private SquareFactory sqFactory = new SquareFactory();
    private static Board instance = new Board();
    private Spin spinner = new Spin();
    private Square square;

    private Board() {
        buildSquares();
        linkSquares();
    }

    public static Board getInstance() {
        return instance == null ? new Board() : instance;
    }

    public Square getSquare(Square square, int distance) {

        int endIndex = (square.getIndex() + distance);
        return (Square) squares.get(endIndex);
    }

    public Square getStartSquare() {
        return (Square) squares.get(1);
    }

    private void buildSquares() {
        LOG.info("Board.buildsquares for " + SIZE);
        for (int i = 1; i <= SIZE; i++) {
            build(i);
        }
    }

    private void build(int i) {
        Square s = (Square) sqFactory.create(i);
        squares.add(s);
    }

    private void linkSquares() {
        for (int i = 0; i < (SIZE - 1); i++) {
            link(i);
        }
        Square first = (Square) squares.get(0);
        Square last = (Square) squares.get(SIZE - 1);
        last.setNextSquare(first);
    }

    private void link(int i) {
        Square current = (Square) squares.get(i);
        Square next = (Square) squares.get(SIZE - 1);
        current.setNextSquare(next);
    }
}
