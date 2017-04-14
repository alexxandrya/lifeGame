package edu.lifeGame.logic;


import java.io.Serializable;

public class Square implements Serializable{
	private String name;
	private Square nextSquare;
	private int index;
	
	public Square(String name, int index) {
		this.name = name;
		this.index = index;
	}
	
	public void setNextSquare(Square s) {
		nextSquare = s;
	}
	
	public Square getNextSquare() {
		System.out.println("+++++"+nextSquare);
		return nextSquare;
	}
	
	public String getName() {
		return name;
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int x){
		index = x;
	}
}