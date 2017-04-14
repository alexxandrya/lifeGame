package edu.lifeGame.logic;


import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private double salary;
    private String career;
    private Board board;//
    private Square location; //
    private Spin spin;
    private double income;


    public Player(String name, Board board, Spin spin) {
        this.name = name;
        this.board = board;
        this.spin = spin;
        this.location = board.getStartSquare();
    }

    public Square getLocation() {
        return location;
    }

    public void takeTurn() {
        int spinValue = spin.spin();
        System.out.println("------" + location);
        if (spinValue + location.getIndex() < 50) {
            location = board.getSquare(getLocation(), spin.spin());
        } else
            location = board.getSquare(getLocation(), 49 - location.getIndex());

        printStatus();

    }

    private void printStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append("=");
        for (int i = 0; i < 50; i++) {
            if (i == location.getIndex()) {
                sb.append("[X]");
            }else
                sb.append("[ ]");
        }
        System.out.println(sb.toString());
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getCareer() {
        return career;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", career='" + career + '\'' +
                ", board=" + board +
                ", location=" + location +
                ", spin=" + spin +
                ", income=" + income +
                '}';
    }
}