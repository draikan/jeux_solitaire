import java.util.ArrayList;
import java.util.Random;

public class Game {
	
	private Random r = new Random();
	private ArrayList<Carte> paquet;
	
	
    ArrayList<ArrayList<Carte>> collonne= new ArrayList<ArrayList<Carte>>();
    ArrayList<Carte> c1 = new ArrayList<Carte> ();
    ArrayList<Carte> c2 = new ArrayList<Carte> ();
    ArrayList<Carte> c3 = new ArrayList<Carte> ();
    ArrayList<Carte> c4 = new ArrayList<Carte> ();
    ArrayList<Carte> c5 = new ArrayList<Carte> ();
    ArrayList<Carte> c6 = new ArrayList<Carte> ();
    ArrayList<Carte> c7 = new ArrayList<Carte> ();
    

     
	
	public void remplir_collonne(){
		collonne.add(c1);
		collonne.add(c2);
		collonne.add(c3);
		collonne.add(c4);
		collonne.add(c5);
		collonne.add(c6);
		collonne.add(c7);
		for(int i = 1 ;i<collonne.size()+1 ; i++) {
			for(int j = 1 ; j < i+1; j++ ) {
				Object carte =  paquet.get(r.nextInt(paquet.size())); 
				(collonne.get(i)).add(carte);
				paquet.remove(carte);
			}
			
		}

 	    for(int i=1 ; i < 2 ;i++){Object carte =  paquet.get(r.nextInt(paquet.size())); c1.add(carte);paquet.remove(carte);}
	    for(int i=1 ; i < 3 ;i++){Object carte =  paquet.get(r.nextInt(paquet.size())); c2.add(carte);paquet.remove(carte);}
	    for(int i=1 ; i < 4 ;i++){Object carte = paquet.get(r.nextInt(paquet.size())); c3.add(carte);paquet.remove(carte);}
	    for(int i=1 ; i < 5 ;i++){Object carte =  paquet.get(r.nextInt(paquet.size())); c4.add(carte);paquet.remove(carte);}
	    for(int i=1 ; i < 6 ;i++){Object carte =  paquet.get(r.nextInt(paquet.size())); c5.add(carte);paquet.remove(carte);}
	    for(int i=1 ; i < 7 ;i++){Object carte =  paquet.get(r.nextInt(paquet.size())); c6.add(carte);paquet.remove(carte);}
	    for(int i=1 ; i < 8 ;i++){Object carte =  paquet.get(r.nextInt(paquet.size())); c7.add(carte);paquet.remove(carte);}

 		c1_v.add(c1.get(c1.size() - 1));c1.remove(c1.get(c1.size() - 1));
	    c2_v.add(c2.get(c2.size() - 1));c2.remove(c2.get(c2.size() - 1));
	    c3_v.add(c3.get(c3.size() - 1));c3.remove(c3.get(c3.size() - 1));
	    c4_v.add(c4.get(c4.size() - 1));c4.remove(c4.get(c4.size() - 1));
	    c5_v.add(c5.get(c5.size() - 1));c5.remove(c5.get(c5.size() - 1));
	    c6_v.add(c6.get(c6.size() - 1));c6.remove(c6.get(c6.size() - 1));
	    c7_v.add(c7.get(c7.size() - 1));c7.remove(c7.get(c7.size() - 1));
    }
    
    
    
    public void afficher_solitaire() {
    	System.out.println(c1.size() + "" + c1_v);
	    System.out.println(c2.size() + "" + c2_v);
	    System.out.println(c3.size() + "" + c3_v);
	    System.out.println(c4.size() + "" + c4_v);
	    System.out.println(c5.size() + "" + c5_v);
	    System.out.println(c6.size() + "" + c6_v);
	    System.out.println(c7.size() + "" + c7_v);
	    
	    
	    System.out.println(carreau);
	    System.out.println(coeur);
	    System.out.println(trefle);
	    System.out.println(pique);
	    
	
	    		
    }
    
    public void tirer_une_carte() {
    	if(paquet.size() != 0) {
    		paquet_v.add(paquet.get(0));
    		paquet.remove(paquet.get(0));
    		System.out.println(paquet_v.get(paquet_v.size() - 1));
    	}
    	else {
    		for(int i=0 ; i < paquet_v.size(); i++ ) {
    			paquet.add(paquet_v.get(i));
    		}
    		paquet_v.clear();
    	}
    }
}
