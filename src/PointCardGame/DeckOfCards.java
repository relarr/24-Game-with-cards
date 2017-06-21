package PointCardGame;

import java.util.ArrayList;
import java.util.Collections;

/**
 ****************************************************************************
 * Comments by student.
 * 
 ****************************************************************************
 * File name:       DeckOfCards.java
 * @author          Rafael Larrea
 * Created on:      March 6, 2015 11:24 PM
 * @version         1.0
 * Platform:        PC, Windows 7, NetBeans 8.0.1, JDK 1.8.0_20
 * @see             java.util.ArrayList
 * @see             java.util.Collections
 * **************************************************************************
 * <b>
 * This Class provides a Deck of 52 cards for the game. It also has a shuffle
 * method to randomly display 4 different cards.
 * </b>
 * **************************************************************************
 */

public class DeckOfCards 
{
    //class Instance variables
    ArrayList <Integer> digits = new ArrayList<>();
    
    //default constructor
    public DeckOfCards()
    {
    }
    
    //overloaded constructor
    public DeckOfCards(ArrayList aL)
    {
        digits = aL;
    }
    
    /**
     * A method that randomly displays for different cards
     * @param aL 
     */
    public void shuffle(ArrayList aL)
    {
        Collections.shuffle(digits);
    }
      
    /**
     * A method that sets a integer from 1 to 52 to each card on the deck
     * @param aL
     * @return digits
     */
    public ArrayList setInteger(ArrayList aL)
    {
        for (int i = 0; i < 52; i++) 
        {
            digits.add(i); 
        }
        return digits;
    }
}
