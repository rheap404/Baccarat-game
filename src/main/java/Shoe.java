
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Shoe extends CardCollection{

    private List<BaccaratCard> cards;
 
    Shoe(int decks){
        
        // Checking for correct number of decks
        if(decks!=6 && decks!=8)
        {
            throw new CardException("Invalid number of decks");
        }

        // Storing the total number of cards in a array list
        this.cards = new ArrayList<>(decks * 52);
        for (int i = 0; i < decks; i++) {
            for (Card.Suit suit : Card.Suit.values()) {
                for (Card.Rank rank : Card.Rank.values()) {
                    cards.add(new BaccaratCard(rank, suit));
                }
            }
        }
    }

    // Method to return size 
    public int size() {
       return this.cards.size();
    }
    
    // Shuffling the deck of cards using Collections
    public void shuffle() {
     
        Collections.shuffle(this.cards);

    }

    // Checks if the decks is empty if not returns the first card
    public Card deal() {

        if (this.cards.isEmpty())
        {
            throw new CardException("Empty Shoe");
        }
         else 
        { 
            return this.cards.remove(0);
        }

    }
}