public class Card{ 
    private String rank; 
    private String suit; 
    private int pointValue; 

    public Card(String r, String s, int p){ 
        rank = r; 
        suit = s; 
        pointValue = p; 
    } 

    // accessor for rank
    public String getRank(){ 
        return rank; 
    } 

    // accessor for suit  
    public String getSuit(){ 
        return suit; 
    } 

    // accessor for pointValue 
    public int getPointValue(){ 
        return pointValue; 
    } 

    // if the rank, suit, and pointValue equal the ones from Card c, then it will return true 
    public boolean equals(Card c){ 
        if(this.rank.equals(c.rank) && this.suit.equals(c.suit) && this.pointValue == c.pointValue){ 
            return true; 
        } 
        else{ 
            return false; 
        }
    } 

    // puts the rank, suit, and pointValue in the proper format 
    public String toString(){ 
        return rank + " of " + suit + " (point value = " + pointValue + ")"; 
    }
}
