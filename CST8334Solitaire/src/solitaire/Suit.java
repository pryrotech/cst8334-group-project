package solitaire;

public enum Suit {
    CLUBS("Clubs"),
    SPADES("Spades"),
    HEARTS("Hearts"),
    DIAMONDS("Diamonds");

    String suitText;

    Suit(String suitText){
        this.suitText = suitText;
    }

    public String printSuit(){
        return suitText;
    }
}

