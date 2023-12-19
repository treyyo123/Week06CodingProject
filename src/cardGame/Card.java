package cardGame;

public class Card {

	private int value;
	private String name;
	
	public Card() {}
	public Card(String name, int value) {
		this.value = value;
		this.name = name;
	}
	
	public String toString() {
		return "Card Name: " + name +" Card Value: " + value;
	}
	public void describe() {
		System.out.println("Card Name: " + name +" Card Value: " + value);
	}
	
	//Getters and Setters
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}//end of class
