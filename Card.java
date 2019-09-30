/**
 *
 * Models a card class 
 * uses rank & suit (both int) to declare them
 * @author Edmund Zhou
 * @since 2019-09-20
 * @version 1.0.0
 *
 */

class Card {
	
	//ranks from A-King
int rank; 
	//suits HEARTS SPADE DIAMOND CLOVER
int suit; 
  
//card class
/**
 * Card constructor that pulls in suits and ranks in parameter 
 * and makes it equal in order to use later.
 * @param suits
 * @param ranks
 */
public Card(int suits, int ranks){

	rank = ranks;
	suit = suits;
}
  /**
   * Getter for the card class
   * @return rank
   */
//method: Getter
public int getCard() {
return rank;
}
  /**
   * Setter for the class
   * makes rank = to param rankss
   * @param rankss
   */
//method: Setter
public void setCard(int rankss){
	
rank = rankss;
}
  
/**
 * Override to help with the display of the cards in order to add the
 * "Of" for Ace "OF" Spade
 * Uses case switch in order to declare Ace & Jack-King
 * return card display aka SHOWCARD
 */
@Override
//to string to help with display
public String toString(){
StringBuilder showCard = new StringBuilder();
//stringbuilder fixes 
  
//can use case or if statements
switch(rank){
//switch to fix Jack-Ace
case 11:
	//11 <-> jack
showCard.append("Jack");
break;
case 12:
	//12 <-> queen
showCard.append("Queen");
break;

case 13:
	//13 <-> King
showCard.append("King");
break;
case 14:
	//14 <-> ace (display)
showCard.append("Ace");
break;   
default:
	//dont need 2 change 2-10 because it already has numerical show for java
showCard.append(rank); 

break;
}
  
showCard.append/*the of will display card to look like Ace of Spade*/(" of ");
  
switch(suit){
//case statements for the suit DIAMOND CLUBS HEARTS SPADES

//case 0 (aka statement 1: is spades)
case 0:
showCard.append("Spades");
break;

//second case is hearts
case 1:
showCard.append("Hearts");
break;

//third case is clubs
case 2:
showCard.append("Clubs");
break;

//fourth case is diamonds
case 3:
showCard.append("Diamonds");
break;

//default ends everything
default: 
break;
}
  

return showCard./*the toString will be called to show what card is being called*/toString(); //display
}
  
}
