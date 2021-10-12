package solitaire;

import java.awt.image.BufferedImage;

public class Card {

    private Suit suit;
    private Face face;
    private boolean faceUp;



    public Card(Face face, Suit suit){
        this.face = face;
        this.suit = suit;
        faceUp = true;
    }

    public Suit getSuit(){
        return suit;
    }

    public void flipCard() {
        faceUp = !faceUp;
    }

}