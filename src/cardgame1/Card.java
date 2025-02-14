/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame1;

/**
 *
 * @author haspinderkaur - 08/02/2025
 */
public class Card {
    
    private Value value;
    private Suit suit;
    
    public enum Suit{
        HEARTS, CLUBS, SPADES, DIAMONDS
    }
    
    public enum Value{
        ACE, TWO, THREE, FOOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
        JACK, QUEEN, KING
    }
    
    
    public Card (Value givenValue, Suit givenSuit) {
        this.value = givenValue;
        this.suit = givenSuit;
    }
    
    public Value getValue() 
    {
        return this.value;
    }
    
    public void setValue (Value value) 
    {
        this.value = value;
    }
    
    public Suit getSuit() 
    {
        return this.suit;
    }
    
    public void setSuit (Suit suit) 
    {
        this.suit = suit;
    }
    
    

}
