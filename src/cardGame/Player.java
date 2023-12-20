package cardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	public Player(String name, int score) {
		this.name = name;
		this.score = score;
		this.hand = new ArrayList<Card>();
	}
	
	public void describe() {
		System.out.println(name + " " + score);
		for(Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		
		Card x = hand.remove(0);
		return x;
		//return x.getValue();
		//System.out.println(x);		
		}
	 
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score = score + 1;
		//System.out.println(name + " " + score);
	}
	//Getters and Setters
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}//end of class
