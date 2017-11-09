import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

public class Jeux {
	Scanner sc = new Scanner(System.in);
	public void menu()
	{
			int select = 0; 
			do{
				System.out.println("****** MENU JEUX ********");
				System.out.println("1: Bouger une carte");
				System.out.println("2: Piocher une carte");
				select = this.sc.nextInt();
				this.sc.nextLine();
				
				
				switch(select)
				{
					case 1 : this.bouger(); break;
					case 2 : this.piocher(); break;
				}
			}while(select!=0);	
		}
	public void bouger() {
		
	}
	public void piocher() {
		
	}
	 
	  public static void main(String[] args) {
		
	    ArrayList carreau = new ArrayList();
	    ArrayList coeur = new ArrayList();
	    ArrayList pique = new ArrayList();
	    ArrayList trefle = new ArrayList();
	    ArrayList paquet = new ArrayList();
	    
	    ArrayList c1 = new ArrayList();
	    ArrayList c2 = new ArrayList();
	    ArrayList c3 = new ArrayList();
	    ArrayList c4 = new ArrayList();
	    ArrayList c5 = new ArrayList();
	    ArrayList c6 = new ArrayList();
	    ArrayList c7 = new ArrayList();
	    
	    ArrayList c1_v = new ArrayList();
	    ArrayList c2_v = new ArrayList();
	    ArrayList c3_v = new ArrayList();
	    ArrayList c4_v = new ArrayList();
	    ArrayList c5_v = new ArrayList();
	    ArrayList c6_v = new ArrayList();
	    ArrayList c7_v = new ArrayList();
	    

	    Random r = new Random();
	    
	    for(int i = 0; i < 13; i++){carreau.add(i+1+"c"); paquet.add(i+1+"c") ;}
	    for(int i = 0; i < 13; i++){pique.add(i+1+"p");paquet.add(i+1+"p") ;}
	    for(int i = 0; i < 13; i++){trefle.add(i+1+"t");paquet.add(i+1+"t");}
	    for(int i = 0; i < 13; i++){coeur.add(i+1+"coe");paquet.add(i+1+"coe");}
	    
	  
	    
	    for(int i=1 ; i < 2 ;i++){String carte = (String) paquet.get(r.nextInt(paquet.size())); c1.add(carte);paquet.remove(carte);}
	    for(int i=1 ; i < 3 ;i++){String carte = (String) paquet.get(r.nextInt(paquet.size())); c2.add(carte);paquet.remove(carte);}
	    for(int i=1 ; i < 4 ;i++){String carte = (String) paquet.get(r.nextInt(paquet.size())); c3.add(carte);paquet.remove(carte);}
	    for(int i=1 ; i < 5 ;i++){String carte = (String) paquet.get(r.nextInt(paquet.size())); c4.add(carte);paquet.remove(carte);}
	    for(int i=1 ; i < 6 ;i++){String carte = (String) paquet.get(r.nextInt(paquet.size())); c5.add(carte);paquet.remove(carte);}
	    for(int i=1 ; i < 7 ;i++){String carte = (String) paquet.get(r.nextInt(paquet.size())); c6.add(carte);paquet.remove(carte);}
	    for(int i=1 ; i < 8 ;i++){String carte = (String) paquet.get(r.nextInt(paquet.size())); c7.add(carte);paquet.remove(carte);}
	    
	    
	    c1_v.add(c1.get(c1.size() - 1));c1.remove(c1.get(c1.size() - 1));
	    c2_v.add(c2.get(c2.size() - 1));c2.remove(c2.get(c2.size() - 1));
	    c3_v.add(c3.get(c3.size() - 1));c3.remove(c3.get(c3.size() - 1));
	    c4_v.add(c4.get(c4.size() - 1));c4.remove(c4.get(c4.size() - 1));
	    c5_v.add(c5.get(c5.size() - 1));c5.remove(c5.get(c5.size() - 1));
	    c6_v.add(c6.get(c6.size() - 1));c6.remove(c6.get(c6.size() - 1));
	    c7_v.add(c7.get(c7.size() - 1));c7.remove(c7.get(c7.size() - 1));

	    
	    System.out.println(c1.size() + "" + c1_v);
	    System.out.println(c2.size() + "" + c2_v);
	    System.out.println(c3.size() + "" + c3_v);
	    System.out.println(c4.size() + "" + c4_v);
	    System.out.println(c5.size() + "" + c5_v);
	    System.out.println(c6.size() + "" + c6_v);
	    System.out.println(c7.size() + "" + c7_v);
	    System.out.println(paquet);
	    
	    }
	  
	  
	}