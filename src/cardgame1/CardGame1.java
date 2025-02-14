/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardgame1;

import cardgame1.Card.Suit;
import cardgame1.Card.Value;
import java.util.Scanner;
import java.util.Random;



/**
 *
 * @author haspinderkaur
 */
public class CardGame1 {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        Card [] hand = CardHandGenerator.generateHand(7);
        
         //ask the user for a lucky card
       System.out.println("Please choose a suit for your lucky card:");
       for(int i=0; i<Card.Suit.values().length; i++)
       {
           System.out.println((i +1) + ": " + Card.Suit.values()[i]);
       }
       int suit = input.nextInt()-1;
       //System.out.println("Enter a value(1 to 13)");
       int valuePosition = input.nextInt()-1;
       //create a new Card with the two values Chosen
       Card userGuess = new Card(Card.Value.values()[valuePosition], Card.Suit.values()[suit]);
       //check to see if it matches
       boolean match = false;
       for(Card card: hand)
       {
           if(card.getValue()==userGuess.getValue()&&(card.getSuit().equals(userGuess.getSuit())))
           {
               match=true;
               break;
           }
       }
       System.out.println("Did you guess it?" + match);
    }

	
	
    
}
    

