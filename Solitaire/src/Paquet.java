import java.util.ArrayList;
import java.util.Random;

public class Paquet {
	
	
	 	private ArrayList<Carte> paquet ;

	    
	    public void remplir_paquet() {
	    	paquet = new ArrayList<Carte>() ;
	    	for(int i = 0; i < 13; i++){
	    		for(int c = 0; c<4 ; c++) {
	    			paquet.add(new Carte(i,c));
	    		}
	    	}
	    }
	    
	    
	    public Carte getCard() {
	        return paquet.remove(0);
	    }

	    public void shuffle() {
	        ArrayList<Carte> newDeck = new ArrayList<Carte>();
	        for (int i = 0; i < 51; i++) {
	            int rand = new Random().nextInt(paquet.size());
	            newDeck.add(paquet.remove(rand));
	        }
	        newDeck.add(paquet.remove(0));
	        paquet = newDeck;
	    }
	    
	    

	    public void print() {
	        for (int i = 0; i < 52; i++) {
	            Carte card = paquet.get(i);
	            card.makeVisible();
	            card.print();
	        }
	    }
	    
}
