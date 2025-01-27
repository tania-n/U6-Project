public class Deck{ 

    private Card[] cards; 
    private int size; // number of cards that have not been dealt with 

    public Deck(String[] ranks, String[] suits, int[] pointValues){ 
        Card[] array = new Card[ranks.length * suits.length]; 
        int k = 0; 
        // loops through each index in suits
        for(int i = 0; i < suits.length; i++){ 
            // loops through each index in length
            for(int j = 0; j < ranks.length; j++){
                // sets array at index k to a new Card 
                // Card contains ranks, suits, and pointValues all at index j 
                array[k] = new Card(ranks[j], suits[i], pointValues[j]);
                k++; 
            } 
        } 
        
        cards = array; 
        size = cards.length; 
        
        shuffle(); 
        
    } 
    
    public boolean isEmpty(){ 
        // if there are 0 undealt cards, it will return true 
        if(size == 0){ 
            return true; 
        } 
        // if there are more than 0, it will return false 
        else{ 
            return false; 
        }
    } 
    
    public int size(){ 
        return size; 
    } 

    public Card deal(){ 
        // if there are 0 undealt cards, it will return null 
        if(size == 0){ 
            return null;
        }
        // if there are more than 0, size will decrease by 1
        // it will return the card at index size 
        else{
            size--; 
            return cards[size];
        }
    } 
 
    public void shuffle(){ 
        this.size = this.cards.length; 
        int k = size - 1; 
        // generates a random number between 0 and k
        int r = (int)(Math.random() * k) + 1; 
        // temporary variable to hold the card at index k; 
        Card temp = cards[k]; 
        // sets card at index k to card at index r
        cards[k] = cards[r]; 
        // sets card at index r to the temporary variable 
        cards[r] = temp; 
    }
    
    public String toString(){ 
        // string for dealt and undealt cards
        String dealt = ""; 
        String undealt = ""; 

        // loops through each index until it reaches the value of size 
        for(int i = 0; i < size; i++){ 
            // adds each card at index i to the undealt string 
            undealt += cards[i] + "\n"; 
        } 
        // loops through each index between the value of size and the length of cards 
        for(int i = size; i < cards.length; i++){ 
            // adds each card at index i to the dealt string 
            dealt += cards[i] + "\n"; 
        } 
        // returns the size, undealt cards, and dealt cards 
        return "size = " + size + "\nUndealt cards: \n" + undealt + "\nDealt cards: \n" + dealt; 
    }

}
