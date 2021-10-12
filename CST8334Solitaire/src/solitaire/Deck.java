package solitaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

	public Deck() { //default constructor
		deck = new ArrayList<Card>();
	}

	public void populate() { // populates the deck by looping through the suits then the face values
		for (Suit suit : Suit.values()) {
			for (Face face : Face.values()) {
				Card card = new Card(face, suit);
				this.add(card);
			}
		}
	}

	private void clear() { //clear the deck (not sure if we will need this)
		deck.clear();
	}

	private void add(Card card) { //adds are card to the deck (this is called in the populate method
		deck.add(card);
	}

	public String showDeck() {
		String showDeck = "";
		for (Card c: deck) {
			showDeck += c.toString() + "\n";
		}
		return showDeck;
	}

	public void shuffle() { //shuffles deck of cards
		for (int i = this.deck.size(); i > 1; i--) {
			Random r = new Random();
			int index = r.nextInt(i-1);

			Card topCard = this.deck.remove(i-1);
			Card randomCard = this.deck.remove(index);

			this.deck.add(index, topCard);
			this.deck.add(randomCard);

		}
	}
/**

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
**/

}
