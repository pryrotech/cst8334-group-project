package solitaire;

public enum Face {
    ACE(1, "Ace"),
    TWO(2, "2"),
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    NINE(9, "9"),
    TEN(10, "10"),
    JACK(11, "Jack"),
    QUEEN(12, "Queen"),
    KING(13, "King");


    int faceValue;
    String faceString;

    Face(int faceValue, String faceString) {
        this.faceValue = faceValue;
        this.faceString = faceString;
    }

    public String getFace(){
        return faceString;
    }

    public String printFace(){
        return faceString;
    }


}