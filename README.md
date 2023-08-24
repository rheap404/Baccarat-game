# Baccarat Game Simulation

This repository contains a Java simulation of the classic card game Baccarat. The simulation is designed to allow players to play rounds of Baccarat against the computer. The code is structured using various classes to represent different aspects of the game.

## Contents
Baccarat.java: The main class that orchestrates the Baccarat game rounds, player interactions, and displays results.  <br>

BaccaratCard.java: Extends the Card class to provide functionality specific to Baccarat, such as card value handling. <br>

BaccaratHand.java: Represents a hand of Baccarat cards, including methods for hand evaluation and manipulation. <br>

Card.java: Represents a standard playing card, including rank, suit, value calculation, and more. <br>

CardCollection.java: An abstract class that serves as a foundation for managing collections of playing cards in various card games. <br>

Shoe.java: Represents a shoe of playing cards used in card games, including methods for initializing, shuffling, and dealing cards. <br>

## Simulation Features
The Baccarat Card Game Simulation in this repository provides a simplified version of the game, allowing players to play rounds against a computer opponent. Here are some features of the simulation: <br>

Classes Representation: The simulation employs a modular structure with different classes representing various aspects of the game. This includes BaccaratCard, BaccaratHand, Card, CardCollection, and Shoe. <br>

Natural Hands: The simulation recognizes natural hands, where the initial two-card hand totals 8 or 9. Natural hands are automatically identified, providing an instant win if the opposing hand doesn't have the same value. <br>

Third Card Rules: The simulation follows Baccarat's rules for drawing a third card. Depending on the total point value of the initial two-card hands, additional cards may be drawn for the player and/or the banker. <br>

Shoe and Deck Management: The Shoe class represents a shoe of playing cards, where multiple decks are shuffled together. This emulates real casino practice and ensures a sufficient number of cards for gameplay. <br>

User Interaction: The simulation prompts players to decide whether they want to play another round after each round. Players can input "y" to continue or any other input to exit. <br>

Game Outcome Tracking: The simulation tracks and displays the number of rounds played, player wins, banker wins, and ties. <br>


## How to Run
To run the simulation: <br>

1. Compile the Java source files using a Java compiler: <br>
   javac Baccarat.java BaccaratCard.java BaccaratHand.java Card.java CardCollection.java Shoe.java <br>

2. Run the Baccarat class to start the simulation: <br>
   java Baccarat <br>

Follow the prompts to play rounds of Baccarat and see the results. <br>

