package cardGame;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player("Tonya", 0);
		Player player2 = new Player("Ericka", 0);
		
		deck.shuffle();
		for(int i = 1; i < 53; i++) {
			if(i % 2 == 0) {
				player1.draw(deck);
			}else if(i % 2 == 1) {
				player2.draw(deck);
			}
		}
		
		for(int i = 0; i < 26; i++) {			
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();

			int player1Value = player1Card.getValue();
			int player2Value = player2Card.getValue();
			
			System.out.println(player1.getName() + " " + player1Card.getName());
					
			
			System.out.println(player2.getName() + " " + player2Card.getName());
			
			if(player1Value > player2Value) {
				System.out.println(player1.getName()+ " receives one point!");
				player1.incrementScore();				
			}else if(player1Value < player2Value) {			
				System.out.println(player2.getName() + " receives one point!");
				player2.incrementScore();
			}else if(player1Value == player2Value) {
				System.out.println("Tie! No point awarded!");
			}
			System.out.println("After round " + (i + 1) + " " + player1.getName() + " " + player1.getScore() + " " + player2.getName() + " " + player2.getScore());
		}
		System.out.println("FINAL SCORE!" + " " + player1.getName() + " " + player1.getScore() + " " + player2.getName() + " " + player2.getScore());
		
		if(player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName().toUpperCase() + " WINS!");
		}else if(player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName().toUpperCase() + " WINS!");
		}else {
			System.out.println("DRAW!");
		}
		
	}//end of main

}//end of class