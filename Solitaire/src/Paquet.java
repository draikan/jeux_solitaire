import java.util.ArrayList;

public class Paquet {
	
	
	 	private ArrayList<Carte> paquet = new ArrayList<Carte>();

	    
	    public void remplir_paquet() {
	    	for(int i = 0; i < 13; i++){
	    		for(int c = 0; c<4 ; c++) {
	    			paquet.add(new Carte(i,c));
	    		}
	    	}
	    }

}
