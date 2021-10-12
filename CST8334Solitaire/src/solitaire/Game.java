package solitaire;
/**
 * Main method & game board setup
 *
 * @author  Group 5 CST8334
 * @date Fall 2021
 */

public class Game {
	public static void main(String[] args) {
		//start game
		Deck d1 = new Deck();
		d1.populate();
		System.out.println("This is a new deck" +  "/n" + d1.showDeck());
		d1.shuffle();
		System.out.println("The deck has now been shuffled" + "/n" + d1.showDeck());


		Tableau newGame = new Tableau();

		//load game board test

	  }
	

}