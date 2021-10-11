package solitaire;

/**
 * Deck of cards
 *
 * @author  Group 5 CST8334
 * @date Fall 2021
 */

public class Deck {

	private ArrayList<Card> deck;
	private int xAxis;
	private int yAxis;
	
	public Deck() {
		deck = new ArrayList<Card>();
		
		shuffle();
		
	}
	
	private void shuffle() { //shuffles deck of cards
		for (int i = 0; i < deck.size(); i++) {
		      int index = (int)(Math.random() * deck.size());
		      Card t = this.getCard(i);
		      this.setCard(i, this.getCard(index));
		      this.setCard(index, t);
		    }
	}
	
	public Card getCard(int index) { //Card getter
	    if (withinBounds(index)) {
	      return deck.get(index);
	    }
	    return null;
	}
	
	private void setCard(int index, Card c) { //Card setter
	    if (withinBounds(index)) {
	      deck.set(index, c);
	    }
	  }
}
