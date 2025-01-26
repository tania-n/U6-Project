public class Card{ 
    private String rank; 
    private String suit; 
    private int pointValue; 

    public Card(String r, String s, int p){ 
        rank = r; 
        suit = s; 
        pointValue = p; 
        
    } 

    public String getRank(){ 
        return rank; 
    } 

    public String getSuit(){ 
        return suit; 
    } 

    public int getPointValue(){ 
        return pointValue; 
    } 

    public boolean equals(Card c){ 
        if(this.rank.equals(c.rank) && this.suit.equals(c.suit) && this.pointValue == c.pointValue){ 
            return true; 
        } 
        else{ 
            return false; 
        }
    } 

    public String toString(){ 
        return rank + " of " + suit + " (point value = " + pointValue + ")"; 
    }




}
