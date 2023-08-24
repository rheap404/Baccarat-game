import java.util.Scanner;

public class Baccarat {
  public static void main(String[] args)
  {

    Scanner sc = new Scanner(System.in);

    // initializing values and shuffling the deck
    int Round=0;
    int playerW=0;
    int bankerW=0;
    int tie=0;
    String out="y";
    Shoe shoe = new Shoe(6);
    shoe.shuffle();

    // creates a new Baccarat Hand for player and banker
    // on the condition that the deck is greater than 5
    while(shoe.size()>=6)
    {
      BaccaratHand banker = new BaccaratHand();
      BaccaratHand player = new BaccaratHand();

      // 2 cards are added to each hand alternativley 
      banker.add(shoe.deal());
      player.add(shoe.deal());
      banker.add(shoe.deal());
      player.add(shoe.deal());

      // round number calculated and displayed along with 
      // cards of the banker and player
      Round++;
      System.out.println("Round "+ Round);
      System.out.println("Player: "+player.toString()+" = "+player.value());
      System.out.println("Banker: "+banker.toString()+" = "+banker.value());
  
     // checking for a natural hand
      if(!player.isNatural() && !banker.isNatural())
        { 
          // Multiple if statements checking the card values 
          // and distributing cards according to the rules of Baccarat
          if(player.value()<=5)
            {
              System.out.println("Dealing third card to player");
              player.add(shoe.deal());

              if(banker.value()<=2)
                {
                  System.out.println("Dealing third card to banker");
                  banker.add(shoe.deal());
                }
              if(banker.value()==3 && player.Bcards.get(2).value()!=8)
                {
                  System.out.println("Dealing third card to banker");
                  banker.add(shoe.deal());
                }
              if(banker.value()==4 && player.Bcards.get(2).value()<=2 && player.Bcards.get(2).value()>=7)
                {
                  System.out.println("Dealing third card to banker");
                  banker.add(shoe.deal());
                }
              if(banker.value()==5 && player.Bcards.get(2).value()<=4 && player.Bcards.get(2).value()>=7)
                {
                  System.out.println("Dealing third card to banker");
                  banker.add(shoe.deal());
                }
              if(banker.value()==6 && player.Bcards.get(2).value()==6 && player.Bcards.get(2).value()==7)
                {
                  System.out.println("Dealing third card to banker");
                  banker.add(shoe.deal());
                }

              // Displaying the hand with new cards
              System.out.println("Player: "+player.toString()+" = "+player.value());
              System.out.println("Banker: "+banker.toString()+" = "+banker.value());
            }

          else
          {
            if(banker.value()<=5)
            {
              System.out.println("Dealing third card to banker");
              banker.add(shoe.deal());
              // Displaying the hand with new cards
              System.out.println("Player: "+player.toString()+" = "+player.value());
              System.out.println("Banker: "+banker.toString()+" = "+banker.value());
            }
          }
         }
       
       // Checking the value of each hand and determining the winner
       if(player.value()==banker.value())
       {
        System.out.println("Tie");
        tie++;
       }

       else if(player.value()>banker.value())
       {
        System.out.println("Player wins!");
        playerW++;
       }

       else
       {
        System.out.println("Banker wins!");
        bankerW++;
       }
       
       // Asking the player if they wish to play another round
       System.out.print("Another Round? (y/n): ");
       String i= sc.nextLine();
       System.out.println();
       if(i.compareToIgnoreCase(out)!=0)
       {
        break;
       }
    
    }

    // Displaying total rounds played, wins of each party and ties
    sc.close();
    System.out.println(Round+" rounds played");
    System.out.println(playerW+" player wins");
    System.out.println(bankerW+" banker wins");
    System.out.println(tie+" ties");

  }
 }

