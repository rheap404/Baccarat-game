import java.util.ArrayList;

public class BaccaratHand extends CardCollection {

    public ArrayList<BaccaratCard> Bcards;

    BaccaratHand() {
        super();
        Bcards = new ArrayList<>();   
    }

    public int size() {
        return Bcards.size();
    }

    // Adds card to Arraylist
    public void add(Card card) {
        Bcards.add((BaccaratCard)card);
        super.add((BaccaratCard)card);
    }

    // Calculates value of hand
    // Subtarcting 10 if value id greater than 10
    public int value() {
       if(super.value()>10)
       {
            return super.value()-10;
        }
       else
       {
            return super.value();
        }
    }

    // Checks for a narural hand
    public boolean isNatural() {
        if(this.size()==2)
        {
            if(this.value()==8 || this.value()==9) {
                return true;
            }
        }
        return false;
    }

    // Method returns a formatted string version of the Hand
    public String toString() {
      String Hname="";
      
      Hname += Bcards.toString()+ " ";
      Hname = Hname.replaceAll("[\\[\\],]", "");
      Hname = Hname.trim();
      return Hname;

    } 
    
}