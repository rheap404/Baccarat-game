 
 public class BaccaratCard extends Card
 {
    // Constructor for BaccaratCard calling the super constructor of the extended class
    BaccaratCard(Rank r, Suit s) {
     super(r,s);
    }

    // Getter methods
    public Rank getRank() {
        return super.getRank();
    }
   
    public Suit getSuit() {
        return super.getSuit();
    }

    public String toString() {
        return super.toString();
    }

    public boolean equals(Object other) {
        return super.equals(other);
    }

    public int compareTo(Card other) {
        return super.compareTo(other);
    }

    public int value() {
        if(super.value()==10)
        {
            return 0;
        }
        else
        {
            return super.value();
        }
    }

 }