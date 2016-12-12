//Jakob Vendegna

public class Card {
    private int value;
    private String face;
    
    public Card() {
        //creates a blank card object, you would need to set a value using the set methods.
    }
    
    public Card(String f, int v) {
        // creates a card object with a face and a value
        face = f;
        value = v;
    }
    
    public void setFace(String f) {
        // sets the face value of the card, either hearts, spades, clubs, or diamonds
        f = f.toLowerCase();
        switch (f) {
        case "heart":
        case "hearts":
        case "spade":
        case "spades":
        case "diamond":
        case "diamonds":
        case "club":
        case "clubs":
        case "h":
        case "s":
        case "d":
        case "c":
            face = f;
        default:
            face = "Hearts";
        }
    }
    
    public void setValue(int v) {
        // set the numerical value of the card
        if (v <=13 && v != 0) {
        value = v;
        }
        else {
            value = 1;
        }
    }
    
    public String getFace() {
        // get the face value of the card
        return face;
    }
    
    public int getValue() {
        // get the numerical value of the card
        return value;
    }
    
    public Card copyCard(Card c) {
        // create a copy of a card
        Card x = new Card(c.getFace(), c.getValue());
        return x;
    }
    
    public String toString() {
        // a string representation of the card
        String v2;
        String output;
        if (value <= 10 && value > 1) {
            output = value + " of " + face;
            return output;
        }
        // set text versions of numerical values
        else if (value == 1)
            v2 = "Ace";
        else if (value == 11)
            v2 = "Jack";
        else if (value == 12)
            v2 = "Queen";
        else
            v2 = "King";
            
        // construct the string 
        output = v2 + " of " + face;
        
        return output;
    }
     
}