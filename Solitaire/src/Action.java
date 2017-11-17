import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Action {
	
	Scanner sc = new Scanner(System.in);
	
	private Random r = new Random();
	ArrayList<Carte> paquet_v = new ArrayList<Carte>();
	
	 private Paquet paquet ;
	
	 ArrayList<ArrayList<Carte>> collonne_v= new ArrayList<ArrayList<Carte>>();
	    ArrayList<Carte> c1_v = new ArrayList<Carte> ();
	    ArrayList<Carte> c2_v = new ArrayList<Carte> ();
	    ArrayList<Carte> c3_v = new ArrayList<Carte> ();
	    ArrayList<Carte> c4_v = new ArrayList<Carte> ();
	    ArrayList<Carte> c5_v = new ArrayList<Carte> ();
	    ArrayList<Carte> c6_v = new ArrayList<Carte> ();
	    ArrayList<Carte> c7_v = new ArrayList<Carte> ();

		
		
	    ArrayList<ArrayList<Carte>> collonne= new ArrayList<ArrayList<Carte>>();
	    ArrayList<Carte> c1 = new ArrayList<Carte> ();
	    ArrayList<Carte> c2 = new ArrayList<Carte> ();
	    ArrayList<Carte> c3 = new ArrayList<Carte> ();
	    ArrayList<Carte> c4 = new ArrayList<Carte> ();
	    ArrayList<Carte> c5 = new ArrayList<Carte> ();
	    ArrayList<Carte> c6 = new ArrayList<Carte> ();
	    ArrayList<Carte> c7 = new ArrayList<Carte> ();
	    
	    ArrayList<ArrayList<Carte>> pileCoul= new ArrayList<ArrayList<Carte>>();
	    ArrayList<Carte> coul1 = new ArrayList<Carte> ();
	    ArrayList<Carte> coul2 = new ArrayList<Carte> ();
	    ArrayList<Carte> coul3 = new ArrayList<Carte> ();
	    ArrayList<Carte> coul4 = new ArrayList<Carte> ();
	    
	    
		public void Action(){
			
			paquet = new Paquet() ;
			
			pileCoul.add(coul1);
			pileCoul.add(coul2);
			pileCoul.add(coul3);
			pileCoul.add(coul4);
			
			collonne_v.add(c1_v);
			collonne_v.add(c2_v);
			collonne_v.add(c3_v);
			collonne_v.add(c4_v);
			collonne_v.add(c5_v);
			collonne_v.add(c6_v);
			collonne_v.add(c7_v);
			
			collonne.add(c1);
			collonne.add(c2);
			collonne.add(c3);
			collonne.add(c4);
			collonne.add(c5);
			collonne.add(c6);
			collonne.add(c7);
			
			for(int i = 1 ;i<collonne.size()+1 ; i++) {
				paquet.shuffle();
				for(int j = 1 ; j < i+1; j++ ) {
					Carte carte =  paquet.getPaquet(0); 
					(collonne.get(i)).add(carte);
					paquet.removePaquet(carte);
				}	
			}
			
			for(int i = 1 ;i<collonne.size()+1 ; i++) {
					Carte carte =  paquet.getPaquet(paquet.sizePaquet() - 1); 
					(collonne_v.get(i)).add(carte);
					(collonne.get(i)).remove(carte);
			}
			
			
}
		
	  
	 public void tirer_une_carte() {	    
		 if(paquet.sizePaquet() != 0) {
	    		paquet_v.add(paquet.getPaquet(0));
	    		paquet.removePaquet(paquet.getPaquet(0));
	    	}
	    	else {
	    		for(int i=0 ; i < paquet_v.size(); i++ ) {
	    			paquet.addPaquet(paquet_v.get(i));
	    		}
	    		paquet_v.clear();
	    	}
	    }
	 
	 public boolean  move( ArrayList<Carte> exp , ArrayList<Carte> dest  ) {
		 
		 Carte carte_dest = dest.get(dest.size()-1);
		 Carte carte_exp = exp.get(exp.size()-1);
		 
		 if(dest.size() == 0 && collonne.contains(dest)  || pileCoul.contains(dest) ) {
			 if(carte_dest.val == 13 && collonne.contains(dest) ) {
				 dest.add(carte_exp) ;
				 exp.remove(carte_exp);
				 return true ;
			 }
			 if(pileCoul.contains(dest) && carte_exp.val==1) {
				 dest.add(carte_exp) ;
				 exp.remove(carte_exp);
				 return true ;
			 }
			 else {
				 return false ;
			 }
		 }
		 
		 if((collonne.contains(exp) && collonne.contains(dest))){
			 Carte arrive = dest.get(dest.size()-1) ; 
			 for(int i = 0 ; i<exp.size() + 1 ; i++) {
				 Carte carte_bout = exp.get(i) ;
				 
				 if(carte_bout.val == arrive.val -1) {
					 if(carte_bout.color == 1 || carte_bout.color == 2) {
						 if(arrive.color==3 || arrive.color==4 ) {
							 for(int j = i ; j<exp.size() + 1 ; j++) {
								 Carte depla = exp.get(j) ; 
								 dest.add(depla) ;
								 exp.remove(depla);   
							 }
							 return true ; 
						 }
					 }
					 if(carte_bout.color == 3 || carte_bout.color == 4) {
						 if(arrive.color== 1 || arrive.color == 2 ) {
							 for(int j = i ; j<exp.size() + 1 ; j++) {
								 Carte depla = exp.get(j) ; 
								 dest.add(depla) ;
								 exp.remove(depla);   
							 }
							 return true ; 
						 }
				 		}
			 		}
			 	}
			 return false ;
		 }
		 
			 
		if((collonne.contains(exp) && pileCoul.contains(dest)) || (exp == paquet_v && pileCoul.contains(dest))) {
			Carte carte_dep = exp.get(dest.size()-1) ;
			
			if(carte_dep.color == carte_dest.color && carte_dest.val == carte_dep.val-1) {
				 dest.add(carte_dep) ;
				 exp.remove(carte_dep);
				 return true ; 
			}
			else {return false ; }
		}
		
		if((pileCoul.contains(exp) && collonne.contains(dest)) || (exp == paquet_v && collonne.contains(dest))  ) {
			 Carte arrive = dest.get(dest.size()-1) ; 
			 Carte carte_bout = exp.get(exp.size()-1) ;
				 
			 if(carte_bout.val == arrive.val -1) {
				 if(carte_bout.color == 1 || carte_bout.color == 2) {
					 if(arrive.color==3 || arrive.color==4 ) {
							 dest.add(carte_bout) ;
							 exp.remove(carte_bout);   
						 }
						 return true ; 
					 }
				 }
					 if(carte_bout.color == 3 || carte_bout.color == 4) {
						 if(arrive.color== 1 || arrive.color == 2 ) {
								 dest.add(carte_bout) ;
								 exp.remove(carte_bout);   
							 }
							 return true ; 
						 }
			return false ;	 
	 		}
		
return false ;
}
	 

public void printPlateau() {
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	System.out.println(c6);
	System.out.println(c7);
	
	System.out.println(coul1);
	System.out.println(coul2);
	System.out.println(coul3);
	System.out.println(coul4);
	
	System.out.println(paquet_v);

}
	 
	
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
						case 2 : this.tirer_une_carte(); break;
					}
				}while(select!=0);	
			}
		public void bouger() {
			int select = 0; 
			do{
				System.out.println("****** MENU JEUX ********");
				System.out.println("0: Revenir en arrière");
				System.out.println("1: Choisir une carte");
				select = this.sc.nextInt();
				this.sc.nextLine();
				
				
				switch(select)
				{
					case 1 : this.choixCarte(); break;
				}
			}while(select!=0);	
		}
		
		public void choixCarte() {
			System.out.println("Veuillez choisir une des cartes visibles ");
			System.out.println("Veuillez choisir une des cartes visibles");
//			System.out.print(c1.size() + "" + c1_v + "|");
//		    System.out.print(c2.size() + "" + c2_v + "|");
//		    System.out.print(c3.size() + "" + c3_v + "|");
//		    System.out.print(c4.size() + "" + c4_v + "|");
//		    System.out.print(c5.size() + "" + c5_v + "|");
//		    System.out.print(c6.size() + "" + c6_v + "|");
//		    System.out.print(c7.size() + "" + c7_v + "|");
		}

	 
}
