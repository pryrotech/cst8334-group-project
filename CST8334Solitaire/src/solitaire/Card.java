package solitaire;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Card {

    private Suit suit;
    private Face face;
    private boolean faceUp;

    private BufferedImage suitImg;

    private Color color;
    private Font font;

    private int cornerX, cornerY;
    private int rightX;
    private int bottomY;



    public Card(Face face, Suit suit){
        this.face = face;
        this.suit = suit;
        faceUp = false;
    }

    public void flipCard() {
        faceUp = !faceUp;
    }

    public String toString(){
        String showCard = "";
        showCard += face.printFace() + " of " + suit.printSuit();
        return showCard;
    }


    //Start of methods I'm adding from Grahams example


    private void setSuit(Suit s){
        if (isValidSuit(s))
            suit = s;
    }

    private void setFace(Face f){
        if (isValidFace(f))
            face = f;
    }

    private boolean isValidSuit(Suit suitText) {
        boolean valid = false;
        for (Suit suit : Suit.values()) {
            if (suit.suitText.equals(suitText)) {
                valid = true;
                break;
            }
        }
        return valid;
    }


    private boolean isValidFace(Face faceString) {
        boolean valid = false;
        for (Face face : Face.values()) {
            if (face.faceString.equals(faceString)) {
                valid = true;
                break;
            }
        }
        return valid;
    }




}