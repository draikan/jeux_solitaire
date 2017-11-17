import java.util.ArrayList;
import java.util.Collections;


public class Paquet {
	
	
	 	public  ArrayList<Carte> paquet ;

	    
	    public Paquet() {
	    	paquet = new ArrayList<Carte>() ;
	    	for(int i = 0; i < 13; i++){
	    		for(int c = 0; c<4 ; c++) {
	    			paquet.add(new Carte(i,c));
	    		}
	    	}
	    }
	    

	    public int sizePaquet() {
	        return paquet.size();
	    }
	    
	    public Carte getPaquet(int c) {
	    	return paquet.get(c);
	    }
	    
	    public boolean removePaquet(Carte carte) {
	        return paquet.remove(carte);
	    }
	    
	    public boolean addPaquet(Carte c) {
	        return paquet.add(c);
	    }
	    
	    
		@Override
		public String toString() {
		return paquet.toString();
		}	    

	    public void shuffle() {
	        ArrayList<Carte> newDeck = new ArrayList<Carte>();
	        Collections.shuffle(newDeck);
	    }
	    

}
