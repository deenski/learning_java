//Jakob Vendegna

import java.util.*;

public class DeckOfCards {
    
    
    public static void main(String[] args) {
        //the deck is a vector object
        Vector<Card> deck = new Vector<Card>();
        
        // build the deck
        buildDeck(deck);
        
        // shuffle the deck
        //shuffleDeck(deck);
        Collections.shuffle(deck);
        
        // deal the deck
        dealDeck(deck);
    }
    
    public static void buildDeck(Vector<Card> deck) {
        // counter variable used to build each specific card.
        int i = 1;
        // outer for loop runs through innner loop 4 times
        for (int k = 0; k <= 3; k++) {
            //loop to create each card, give it a value and a suit.
            for (int j = 1; j < 14; j++) {
                //first 13 cards
                if (i <= 13){
                    String suit = "Hearts";
                    Card c = new Card(suit, j);
                    deck.addElement(c);
                    i++;
                }
                //second set of 13 cards
                else if (i <= 26 &&  i > 13) {
                    String suit = "Spades";
                    Card c = new Card(suit, j);
                    deck.addElement(c);
                    i++;
                }
                //third set of 13 cards
                else if (i <= 39 && i > 25) {
                    String suit = "Diamonds";
                    Card c = new Card(suit, j);
                    deck.addElement(c);
                    i++;
                }
                //fourth set of 13 cards
                else if (i > 39 && i < 53) {
                    String suit = "Clubs";
                    Card c = new Card(suit, j);
                    deck.addElement(c);
                    i++;
                }
            }
        }
    }
    // Shuffle the cards.
   //  public static void shuffleDeck(Vector<Card> c){
//     
//         // I wanted the program to shuffle the deck a random amount of times.
//         int shuffleTimes = (int) (Math.random() * 10);
//         
//         // And I wanted you to know how many times the deck was shuffled
//         System.out.println("Shuffled deck " + (shuffleTimes + 1) + " times");
//         System.out.println("Deck consists of " + c.size() + " cards");
//         
//         // shuffle the deck shuffleTimes times.
//         for (int z = 0; z <= shuffleTimes; z++) {
//         
//             //given the size of the deck, remove a card from one position and insert it in another
//             for (int i = 0; i < c.size(); i++){
//                 
//                 int swapcard = (int)(Math.random() * 52);
//                 int placeholder = (int) (Math.random() * 52);
//                 
//                 // copy the card at location swapcard
//                 Card swap = c.elementAt(swapcard);
//                 
//                 // delete the card selected
//                 c.remove(swapcard);
//                 // add it back to a different position in the deck.
//                 c.add(placeholder, swap);
//             }
//         }
//     }


    
    public static void dealDeck(Vector d) {
           //print out each item in the deck
           for (int i = 0; i < 52; i++)
               System.out.println(d.get(i));
    }
}  
