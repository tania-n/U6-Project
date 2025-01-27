public class Deck{ 

    private Card[] cards; 
    private int size; // number of cards that have not been dealt with 

    public Deck(String[] ranks, String[] suits, int[] pointValues){ 
        Card[] array = new Card[ranks.length * suits.length]; 
        int k = 0; 
        for(int i = 0; i < suits.length; i++){ 
            for(int j = 0; j < ranks.length; j++){
                array[k] = new Card(ranks[j], suits[i], pointValues[j]);
                k++; 
            } 
        } 
        
        cards = array; 
        size = cards.length; 
        
        shuffle(); 
        
    } 
    
    public boolean isEmpty(){ 
        if(size == 0){ 
            return true; 
        } 
        else{ 
            return false; 
        }
    } 
    
    public int size(){ 
        return size; 
    } 
    
    public Card deal(){ 
        if(size == 0){ 
            return null;
        }
        else{
            size--; 
            return cards[size];
        }
        
        /*if(cards.length > 0){ 
            size--; 
        } 
        Card c = cards[size]; 
        Card[] array = new Card[cards.length - 1]; 
        for(int i = 0; i < cards.length - 1 && i != size; i++){ 
            array[i] = cards[i]; 
        }
        cards = array; 
        return c;*/ //deal;// [cards.length - 1]; 
    } 
    
    public void shuffle(){ 
        this.size = this.cards.length; 
        int k = size - 1; 
        int r = (int)(Math.random() * k) + 1; 
        Card temp = cards[k]; 
        cards[k] = cards[r]; 
        cards[r] = temp; 
    }
    
    public String toString(){ 
        String dealt = ""; 
        String undealt = ""; 
        
        for(int i = 0; i < size; i++){ 
            undealt += cards[i] + "\n"; 
        } 
        for(int i = size; i < cards.length; i++){ 
            dealt += cards[i] + "\n"; 
        }
        return "size = " + size + "\nUndealt cards: \n" + undealt + "\nDealt cards: \n" + dealt; 
    }

}
