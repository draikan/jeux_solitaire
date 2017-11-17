import java.util.ArrayList;

public class Carte {
	
	public boolean red;
	int val ;
    int color ;
    private boolean visible;
      
    public Carte (int val, int color) {
        this.red = color < 2 ? true : false;
        this.val = val;
        this.color = color;
    }
    
    public String print(int couleur , int valeur) {
    	ArrayList<String> coul = new ArrayList<String>() ; 
    	coul.add("Carreau");
    	coul.add("Coeur");
    	coul.add("Pique");
    	coul.add("Trefle");
    	
    	ArrayList<String> values = new ArrayList<String>() ; 
    	values.add("As");
    	values.add("2");
    	values.add("3");
    	values.add("4");
    	values.add("5");
    	values.add("6");
    	values.add("7");
    	values.add("8");
    	values.add("9");
    	values.add("10");
    	values.add("Valet");
    	values.add("Dame");
    	values.add("Roi");
    	
        return coul.get(couleur) + values.get(valeur) ;

    }
}
