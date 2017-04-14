package edu.lifeGame.logic;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class SquareFactory implements Serializable {

    private SquareType green = new Green();
    private SquareType orange = new Orange();

    private static List<Integer> GREEN_SQUARES = Arrays.asList(1, 4, 12, 17, 21, 26, 32, 35, 39, 42, 46);

    public Square create(int index) {
        if (GREEN_SQUARES.contains(index)) {
            //mainView.getGrid().getChildren().get(index).setStyle("-fx-background-color:#90ee90");
            return green.create(index);
        } else {
            //mainView.getGrid().getChildren().get(index).setStyle("-fx-background-color:#ffa500");
            return orange.create(index);
        }
    }

    public Player event(int index, Player player) {
        if (GREEN_SQUARES.contains(index)) {
            //mainView.getGrid().getChildren().get(index).setStyle("-fx-background-color:#90ee90");
            return green.event(index, player);
        } else {
            //mainView.getGrid().getChildren().get(index).setStyle("-fx-background-color:#ffa500");
            return orange.event(index, player);
        }

    }
}
