package game;

public class Card {

	private String type;
	private String suit;
	
	public Card(String type, String suit) {
		this.type = type;
		this.suit = suit;
	}
	
	public String getType() {
		return type;
	}

	public String getSuit() {
		return suit;
	}
	
}
