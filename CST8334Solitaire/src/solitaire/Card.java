package solitaire;

import java.awt.image.BufferedImage;

public class Card {

    private Suit suit;
    private Face face;
    private int value;
    private BufferedImage frontImage, backImage;
    private boolean faceUp = false;



    public Card(Face face, Suit suit, int value, BufferedImage frontImage, BufferedImage backImage){
        this.face = face;
        this.suit = suit;
        this.value = value;
        this.frontImage = frontImage;
        this.backImage= backImage;
    }


    public Face getFace(){
        return face;
    }

    public Suit getSuit(){
        return suit;
    }

    public BufferedImage getFrontImage() {
        return frontImage;
    }

    public BufferedImage getBackImage() {
        return backImage;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

}