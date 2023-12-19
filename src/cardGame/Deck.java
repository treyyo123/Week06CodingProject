package cardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>();
	
	
	public Deck() {
	List<String> suits = new ArrayList<String>();
	suits.add("Hearts");
	suits.add("Clubs");
	suits.add("Spades");
	suits.add("Diamonds");
	
	List<Integer> values = new ArrayList<Integer>();
	values.add(2);
	values.add(3);
	values.add(4);
	values.add(5);
	values.add(6);
	values.add(7);
	values.add(8);
	values.add(9);
	values.add(10);
	values.add(11);
	values.add(12);
	values.add(13);
	values.add(14);
	
	for(int i = 0; i < suits.size();i++) {
		for(int value = 0; value < values.size(); value++) {
			if(value == 9) {
				cards.add(new Card("Jack " + suits.get(i), values.get(value)));
			}else if(value == 10) {
				cards.add(new Card("Queen " + suits.get(i), values.get(value)));
			}else if(value == 11) {
				cards.add(new Card("King " + suits.get(i), values.get(value)));
			}else if(value == 12) {
				cards.add(new Card("Ace " + suits.get(i), values.get(value)));
			}else {
				cards.add(new Card(values.get(value) + " " + suits.get(i), values.get(value)));
			}
			
		}
	}
	
	}//end of constructor
	
	public void describe() {
		Card x;
		for(int i = 0; i < cards.size();i++) {
			x = cards.get(i);
			System.out.println(x.toString());
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card x = cards.remove(0);
		return x;
		
	}
	
}//end of class
