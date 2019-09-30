
/**
 * @author Edmund Zhou
 * @since 2019-09-20
 * @version 1.0.0
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//import all the java utilities needed
/**
 * War game class List Card, uses a collection for the deck, with several uses
 * of built in functions and library imports
 * 
 */
public class WarGame {

	public static void main(String[] args) {
		//int round = 0;
		
		//declare arrayList 4 of them
		//1 array for og deck
		ArrayList<Card> deckOfCards = new ArrayList<Card>();
		//1 array for players deck
		ArrayList<Card> deckOfPlayer1 = new ArrayList<Card>();
		//PC card deck
		ArrayList<Card> deckOfPC = new ArrayList<Card>();
		//temporary deck to store
		ArrayList<Card> deckTemporaryStorage = new ArrayList<Card>();
		
		//for loop suit = 4
		for(int s = 0; s < 4; s ++ ) {
			//for loop rank 1-13 for ace 13
			for(int r = 1; r <= 14; r++ ) {
				deckOfCards.add(new Card(s,r));
			}
		}
		
//		
//		// int decksizecounter = 0;
//		/* //create the list for the deck of cards */
//		List<Card> deckOfCards = new ArrayList<Card>();
//
////will be counting from 0 (start) to 3(bc less than 4) bc there are 4 suits
//		for (int s = 0; s < 4; s++) {
//
////will be going from 1 > 13 bc there are ace > king for the ranks
//			for (int r = 1; r < 14; r++) {
//				/* //put a new card into the deck of cards */
//				deckOfCards.add(new Card(s, r)); // s = suit r = rank
//			}
//		}
////end of loops 
//
		//for loop 1-26 for deck 1
		for(int i = 0; i < 26; i++) {
			//deckofplayers
			//add drawn card to bottom
			deckOfPlayer1.add(deckOfCards.get(0));
			//remove from the pile since it's on bottom
			deckOfCards.remove(0);
			//PC deck holds onto card 1
			deckOfPC.add(deckOfCards.get(0));
			//pC deck removes
			deckOfCards.remove(0);
		}
		//collections is the built in super class 
        Collections.shuffle(deckOfPlayer1);
        Collections.shuffle(deckOfPC);
        
		
		
		
//		Collections.shuffle/* //shuffle the deck */(deckOfCards, new Random());
//		/* //player 1's deck of cards 0-25 */
//		LinkedList<Card> p1Deck = new LinkedList<Card>();
//		/* //player 2's deck of cards 26-52 */
//		LinkedList<Card> p2Deck = new LinkedList<Card>();
//
//		p1Deck.addAll(deckOfCards.subList(0, 26));
////grabs the deck of cards from a collection which allows u to use #0-25 which is 26 cards (starts at 0 not 1)
//		/* //same add all function but for player 2 */
//		p2Deck.addAll(deckOfCards.subList(26, deckOfCards.size()));
//		System.out.println(p1Deck.size());
//		System.out.println(p2Deck.size());
//		while /* while loop */ (p1Deck.size() != 0 || p2Deck.size() != 0) {
//			round ++;
//			System.out.println("Round:" +round);
//			// p1 card up */
//			Card p1Card = p1Deck.pop(); // pop is built in function
//			/* //p2 card up */
//			Card p2Card = p2Deck.pop(); // built in function
//
////display
//			/* display player 1's card */
//			System.out.println("P1's Card: " + p1Card.toString());
//			/* display PC's card */
//			System.out.println("PC's Card: " + p2Card.toString());
//			/* if statement to determine which card is higher */
//			if (p1Card.getCard() > p2Card.getCard()) {// if player 1
//														// win
//				/* puts his og card on bottom */
//				p1Deck.addLast(p1Card);
//
//				// System.out.println(decksizecounter);
//				/* puts his new card on bottom */
//				p1Deck.addLast(p2Card);
////if p1 wins then he gets both cards to bottom of his deck
//				/* player1 wins the round & displays */
//				System.out.println("PLayer 1 wins the round");
//				System.out.println("Player 1 Card count: " + p1Deck.size());
//				System.out.println("PC Card count: " + p2Deck.size()); // can use deck size dont need counter oops
//
//				System.out.println();
//			}
//			
        
        
        //while loop for deck for player has to check for greater than 0 and deck of PC greater than 0
        while (deckOfPlayer1.size() > 0 && deckOfPC.size() > 0) {
    		
        	//possibility of games compares to see if possible
    		int possibilityOfGames = compare(deckOfPlayer1.get(0), deckOfPC.get(0));
    		
    		//if possible
    		if(possibilityOfGames == 0) { //p1 win
    			//p1 choice
    			
    			//pc doesn't try to challenge
    			System.out.println("PC Defaults to give up! IMPORABLE WIN");
    			
    			//grab p1 card to show
    			System.out.println("P1:"+ deckOfPlayer1.get(0));
    			//show pc card
    			System.out.println("P2:" +deckOfPC.get(0));
    			//add to bottom
    			deckOfPC.add(deckOfPlayer1.get(0));
    			deckOfPlayer1.remove(0);
    			//remove from top
    			deckOfPC.add(deckOfPC.get(0));
    			//remove
    			deckOfPC.remove(0);
    			//show deck size of player 
    			System.out.println("Player 1 Deck: " +deckOfPlayer1.size());
    			//show deck size of pc
    			System.out.println("Player 2 Deck: " +deckOfPC.size());
    			//spacing
    			System.out.println();
    		}
    			
        
        
//			/* p2 gets card if they win same idea as other statement */
//			else if (p1Card.getCard() < p2Card.getCard()) {
//				/* p2 version */
//				p2Deck.addLast(p1Card);
//				/* p2 deck */
//				p2Deck.addLast(p2Card);
//
//				System.out.println("PC wins the round");
//				System.out.println("PC Card count: " + p2Deck.size());
//				System.out.println("Player 1 Card count: " + p1Deck.size()); // can use deck size dont need counter oops
//
//				System.out.println();
//			}
//
    		
    		else if (possibilityOfGames == 1) {//p2 win
    			//scanner input
    			//user input
    			System.out.println("Select 0 to give up card or 1 to play another.");
    			Scanner in = new Scanner(System.in);
    			int option = in.nextInt();
    			//int for option
    			if(option == 0)
    			{
    				
    				//pass so u don't play another
    			System.out.println("Pass");
    			System.out.println("P1:" +deckOfPlayer1.get(0));
    			System.out.println("P2:" +deckOfPC.get(0));
    			System.out.println();
    			//add card to bottom and remove from top
    			deckOfPlayer1.add(deckOfPC.get(0));
    			deckOfPC.remove(0);
    			deckOfPlayer1.add(deckOfPlayer1.get(0));
    			deckOfPlayer1.remove(0);
    			//display
    			System.out.println("Player 1 Deck: " +deckOfPlayer1.size());
    			System.out.println("Player 2 Deck: " +deckOfPC.size());
    			}
    			
    			//display
    			else
    			{
    				//int x = losing card + new card
    				
    				int x = deckOfPlayer1.get(0).getCard()+ deckOfPlayer1.get(1).getCard();
    				if(x < deckOfPC.get(0).getCard())
    				//compare to other card
    				{
    					System.out.println("P1:" +deckOfPlayer1.get(0));
    					System.out.println("P2:" +deckOfPC.get(0));
    					System.out.println();
    					//add new card to bottom and get rid of em so it doesn't double
    				deckOfPlayer1.add(deckOfPC.get(0));
    				deckOfPC.remove(0);
    				deckOfPlayer1.add(deckOfPlayer1.get(0));
    				deckOfPlayer1.remove(0);	
    				deckOfPlayer1.add(deckOfPlayer1.get(0));
    				deckOfPlayer1.remove(0);
    				
    				//display
    				System.out.println("Player 1 Deck: " +deckOfPlayer1.size());
    				System.out.println("Player 2 Deck: " +deckOfPC.size());
    				System.out.println();
    				}
    				//else <=
    				else {
    					System.out.println("Total is:" +x);
    					System.out.println("P2 is:"  +deckOfPC.get(0));
    					System.out.println();
    					//display
    					deckOfPC.add(deckOfPlayer1.get(0));
    					deckOfPlayer1.remove(0);
    					deckOfPC.add(deckOfPC.get(0));
    					deckOfPC.remove(0);	
    					deckOfPC.add(deckOfPlayer1.get(0));
    					deckOfPlayer1.remove(0);
    					//display
    					System.out.println("Player 1 Deck: " +deckOfPlayer1.size());
    					System.out.println("Player 2 Deck: " +deckOfPC.size());
    					System.out.println();
    					
    				}
    				
    			}
    			//computer program the code
    		}
    		//tie game 
    		else if (possibilityOfGames == 2) {// tie
    			
    			while(possibilityOfGames == 2) {
    				//war
    			for(int i = 0; i < 4; i++) {
    				if(deckOfPlayer1.size() > 0) {
    					deckTemporaryStorage.add(deckOfPlayer1.get(0));
    					deckOfPlayer1.remove(0);
    				}
    				if (deckOfPC.size() > 0) {
    					deckTemporaryStorage.add(deckOfPC.get(0));
    					deckOfPC.remove(0);
    				}
    			}//temporary storage to give somewhere to place war deck cards
    			
    			//make sure game is playable
    		if(deckOfPlayer1.size() > 0 && deckOfPC.size() > 0) {
    			possibilityOfGames = compare(deckOfPlayer1.get(0), deckOfPC.get(0));
    		} else {//cant be short cards
    			break;//will end
    		}
    		
    		}
    			if(possibilityOfGames == 0 ) {//add cards
    				while(!deckTemporaryStorage.isEmpty()) {
    					deckOfPlayer1.add(deckTemporaryStorage.get(0));
    					deckTemporaryStorage.remove(0);
    				}
    				
    			}
    			//use it to play
    			if(possibilityOfGames == 1  ) {
    				while(!deckTemporaryStorage.isEmpty()) {
    					deckOfPC.add(deckTemporaryStorage.get(0));
    					deckTemporaryStorage.remove(0);
    				}
    				
    			}
    				
    			
    			
    		}
    			
    			//System.out.println(deckOfPlayer1.size() + " " + deckOfPC.size() + " " + deckTemporaryStorage.size() );
    			
    			
    			
    		}
    		if(deckOfPlayer1.size() == 0)
    		{
    			System.out.println("PC is the winner! OH NO!");
    			//display winner is pc
    		}
    		else
    		{//otherwise winner is player
    			System.out.println("Winner of the game is player 1!!!!!");
    		}
    	}
    		
             
    		
    	
    	
    			//computer program the code

    		
    		
    		
//			/* else statement for the war game */
//			else {
//				
//				System.out.println();
//				System.out.println("I - De - Clare - War!");
//				System.out.println();
//				/* War1deck original (the 4 cards that will be placed iniside this */
//				List<Card> p1WarDeck = new ArrayList<Card>();
//				/* War2deck original (the 4 cards that will be placed iniside this */
//				List<Card> p2WarDeck = new ArrayList<Card>();
//
//				for/* check if player has enough to do war! */ (int four = 0; four < 3; four++) {
//
//					if (p1Deck.size() == 0 || p2Deck.size() == 0) {
//						/* if either p1 or p2 has 0 cards then it's a loss */
//						/* stop the loop if needed */
//						break;
//					}
//
//					System.out.println("Player 1's card:----- ");
//					// System.out.println();
//					System.out.println("Player 2's card:----- ");
//					System.out.println();
//					/* take it off the top of player 1's deck */
//					p1WarDeck.add(p1Deck.pop());
//					/* take it off the top of player 2's deck */
//					p2WarDeck.add(p2Deck.pop());
//
//				}
	
	/**
	 * 
	 * Used to compare two seperate INT's in order to see which is greater and which is less than
	 * 
	 * @param card1
	 * @param card2
	 * @return's the possibilityOfGames -> outcome as an integer
	 */
	public static int compare(Card card1, Card card2) {
		//number of possible ways game can end with comparison
		int possibilityOfGames = 2;
		//0 is if p1 < PC
		if (card1.getCard() < card2.getCard()) {
			
			possibilityOfGames = 0;
			//1 is if p1  > PC
		} else if (card1.getCard() > card2.getCard() ) {
			
			possibilityOfGames =1;
		}	
		//else return 2 so that PC = P1 WAR
		return possibilityOfGames;
	}
	
	
	
	
}
//				/* compare to, could've made this a compareto function maybe? */
//				if (p1WarDeck.size() == 3 && p2WarDeck.size() == 3) {
////display the war cards from each player
//					System.out.println("Player 1's war card: " + p1WarDeck.get(0).toString());
//
//					/* Change the display with toString function p1 war card */
//					// System.out.println();
//					System.out.println("Player 2's war card: " + p2WarDeck.get(0).toString());
//					/* Change the display with toString function p2 war card */
//					System.out.println();
////problem may come from here 
//					/* grab 2 cards from the deck from winning war */
//					if (p1WarDeck.get(2).getCard() > p2WarDeck.get(2).getCard()) {
//						/* add their own cards back to deck */ p1Deck.addAll(p1WarDeck);
//						/* add the war wins from player 2's war deck */ p1Deck.addAll(p2WarDeck);
//						p1Deck.addLast(p1Card);
//
//						// System.out.println(decksizecounter);
//						/* puts his new card on bottom */
//						p1Deck.addLast(p2Card);
//						System.out.println("The winner of this war round is Player 1!");
//						System.out.println("Player 1 Card count: " + p1Deck.size());
//						System.out.println("PC Card count: " + p2Deck.size()); // can use deck size dont need counter
//																				// oops
//
//						System.out.println();
//					}
//
////player2 has won the round
//
//					else {
////alternate option	
//						/* add all is taking the cards from p1 wardeck into p2deck */ p2Deck.addAll(p1WarDeck);
//						/* add all is taking the cards from p2 wardeck into p2deck */ p2Deck.addAll(p2WarDeck);
//						p2Deck.addLast(p2Card);
//
//						// System.out.println(decksizecounter);
//						/* puts his new card on bottom */
//						p2Deck.addLast(p2Card);
//						System.out.println("PC wins this war round!!");
//						System.out.println("PC Card count: " + p2Deck.size()); // can use deck size dont need counter
//																				// oops
//						System.out.println("Player 1 Card count: " + p1Deck.size()); // can use deck size dont need
//																						// counter oops
//						System.out.println();
//					}
//				}
//			}
//
//			/* .size is built in function to check length */
//			// check deck size again
//			if (p1Deck.size() == 0) {
//				System.out.println("game over! PC is out of cards!");
//				System.out.println("Player 1 is the winner of the war game!");
//				break;
////end
//			}
//
//			/* another built in function for the check of length */
//			else if (p2Deck.size() == 0) {
////cant equal 0 or lose
//				System.out.println("game over! Player 1 is out of cards!");
//				System.out.println("PC wins the game!!! Oh no!!!");
//				break;
////end
//			}
//		}
//
//	}
