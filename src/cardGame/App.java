package cardGame;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println(deck.draw());
		//deck.describe();
	}//end of main

}//end of class