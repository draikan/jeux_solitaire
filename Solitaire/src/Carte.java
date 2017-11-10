import java.util.ArrayList;
import java.util.Random;

public class Carte {

	private  int val ;
    private int type ;
    
    private ArrayList paquet = new ArrayList();
    private ArrayList paquet_v = new ArrayList();
    
    private Random r = new Random();
    
    private ArrayList c1 = new ArrayList();
    private ArrayList c2 = new ArrayList();
    private ArrayList c3 = new ArrayList();
    private ArrayList c4 = new ArrayList();
    private ArrayList c5 = new ArrayList();
    private ArrayList c6 = new ArrayList();
    private ArrayList c7 = new ArrayList();
    
    private ArrayList c1_v = new ArrayList();
    private ArrayList c2_v = new ArrayList();
    private ArrayList c3_v = new ArrayList();
    private ArrayList c4_v = new ArrayList();
    private ArrayList c5_v = new ArrayList();
    private ArrayList c6_v = new ArrayList();
    private ArrayList c7_v = new ArrayList();
    
    
    
    public Carte()
    {
        this.val=val ; 
        this.type=type; 
    }
    
    
    public Carte(int val , int type )
    {
        this.val=val ; 
        this.type=type; 
    }
    
    public int getVal()
    {
        return val ; 
    }
    
    public int getType()
    {
        return type ; 
    }
    
    public void setVal(int val)
    {
            this.val = val;
    }

    public void setType(int type)
    {
            this.type = type;
    }
    
    public void remplir_paquet() {
    	for(int i = 0; i < 13; i++){
    		for(int c = 0; c<4 ; c++) {
    			paquet.add(new Carte(i,c));
    		}
    	}
    }
    
    public void remplir_colonne(){
    	for(int i=1 ; i < 2 ;i++){c1.add(paquet.get(r.nextInt(paquet.size())));paquet.remove(paquet.get(r.nextInt(paquet.size())));}
 	    for(int i=1 ; i < 3 ;i++){c2.add(paquet.get(r.nextInt(paquet.size())));paquet.remove(paquet.get(r.nextInt(paquet.size())));}
 	    for(int i=1 ; i < 4 ;i++){c3.add(paquet.get(r.nextInt(paquet.size())));paquet.remove(paquet.get(r.nextInt(paquet.size())));}
 	    for(int i=1 ; i < 5 ;i++){c4.add(paquet.get(r.nextInt(paquet.size())));paquet.remove(paquet.get(r.nextInt(paquet.size())));}
 	    for(int i=1 ; i < 6 ;i++){c5.add(paquet.get(r.nextInt(paquet.size())));paquet.remove(paquet.get(r.nextInt(paquet.size())));}
 	    for(int i=1 ; i < 7 ;i++){c6.add(paquet.get(r.nextInt(paquet.size())));paquet.remove(paquet.get(r.nextInt(paquet.size())));}
 	    for(int i=1 ; i < 8 ;i++){c7.add(paquet.get(r.nextInt(paquet.size())));paquet.remove(paquet.get(r.nextInt(paquet.size())));}
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
    }
    
    public void tirer_une_carte() {
    	paquet.clear();
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
