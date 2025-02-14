
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame1;


import java.util.Random;

/**
 *
 * @author haspinderkaur
 */
public class CardHandGenerator 
{
    
    public static Card[] generateHand(int numCards)
    {
        Card[] hand = new Card[numCards];
       Random random = new Random();
       for(int i=0; i<hand.length; i++)
       {
           Card.Value value = Card.Value.values()[random.nextInt(13)];
           Card.Suit suit = Card.Suit.values()[random.nextInt(4)];
           Card card = new Card(value, suit);
           hand[i] = card;
           //print out each card that we generate
           System.out.println("generating: "+ card.getValue() + " of " + card.getSuit() );
       }  
        return hand;
    }
   
}

    

