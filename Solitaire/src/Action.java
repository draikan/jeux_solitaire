import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Action {
	
	Scanner sc = new Scanner(System.in);
	
	private Random r = new Random();
	ArrayList<Carte> paquet_v = new ArrayList<Carte>();
	
	 ArrayList<ArrayList<Carte>> tableau= new ArrayList<ArrayList<Carte>>();
	
	 
	
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
	    

	    
		public Action(){
			
			paquet = new Paquet() ;
			
			tableau.add(c1_v) ;
			tableau.add(c2_v) ;
			tableau.add(c3_v) ;
			tableau.add(c4_v) ;
			tableau.add(c5_v) ;
			tableau.add(c6_v) ;
			tableau.add(c7_v) ;
			tableau.add(coul1);
			tableau.add(coul2);
			tableau.add(coul3);
			tableau.add(coul4);
			tableau.add(paquet_v);
			
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
			
			
			for(int i = 0 ;i<7 ; i++) {
				paquet.shuffle();
				for(int j = 0 ; j < i+1; j++ ) {
					Carte carte =  paquet.getPaquet(paquet.sizePaquet() - 1); 
					(collonne.get(i)).add(carte);
					paquet.removePaquet(carte);
				}	
			}
			
			for(int i = 0 ;i<7 ; i++) {
					Carte carte = collonne.get(i).get(collonne.get(i).size()-1); 
					(collonne_v.get(i)).add(carte);
					(collonne.get(i)).remove(carte);
			}
			
			
}
		
	  
	 public void tirer_une_carte() {	
		 if(paquet.sizePaquet() != 0) {
	    		paquet_v.add(paquet.getPaquet(paquet.sizePaquet() - 1));
	    		paquet.removePaquet(paquet.getPaquet(paquet.sizePaquet() - 1));
	    	}
		 if(paquet.sizePaquet()== 0){
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
		 
		 if(true){
			 System.out.println("rentré");
			 Carte arrive = dest.get(dest.size()-1) ; 
			 for(int i = 0 ; i<exp.size() + 1 ; i++) {
				 Carte carte_bout = exp.get(i) ;
				 if(carte_bout.val == arrive.val -1) {
					 if(carte_bout.color == 0 || carte_bout.color == 1) {
						 if(arrive.color==2 || arrive.color==3 ) {
							 for(int j = i ; j<exp.size() + 1 ; j++) {
								 Carte depla = exp.get(j) ; 
								 dest.add(depla) ;
								 exp.remove(depla);   
							 }
							 return true ; 
						 }
					 }
					 if(carte_bout.color == 2 || carte_bout.color == 3) {
						 if(arrive.color== 0 || arrive.color == 1 ) {
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
		System.out.println("pa rentré");
return false ;
}
	 
public void tiret(int c) {
	if(c != 0) {
	for(int i=0 ; i<c ; i++ )
		System.out.print("[---]");
	}
}
	 

public void printPlateau() {
	for (int i=0 ; i<7 ; i++) {
		tiret(collonne.get(i).size()) ;
		for (int j=0 ; j < collonne_v.get(i).size(); j++){
			System.out.print(afficher(collonne_v.get(i).get(j).color, collonne_v.get(i).get(j).val));
		}
		System.out.println("");
	}
	
	System.out.println(coul1);
	System.out.println(coul2);
	System.out.println(coul3);
	System.out.println(coul4);
	
	System.out.println(paquet_v);

}
	 
public  String afficher(int couleur , int valeur) {
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


public void menu()
		{
				int select = 0; 
				do{
					//this.printPlateau();
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

public ArrayList<Carte> convert(int a) {
	return tableau.get(a);  
}


public void bouger() {
	int select = 0; 
	do{
		this.printPlateau();
		System.out.println(tableau);
		System.out.println(collonne);
		System.out.println("****** MENU JEUX ********");
		System.out.println("0: Revenir en arrière");
		System.out.println("1: Choisir une colonne");
		select = this.sc.nextInt();
		this.sc.nextLine();
		switch(select)
		{
			case 1 : this.bougerCarte(); break;

		}
	}while(select!=0);	
}

		public void bougerCarte() {
			int colExp = 0;
			System.out.println("Choisir une colonne de depart");
			colExp = this.sc.nextInt();
			this.sc.nextLine();
			int colDest = 0 ;
			System.out.println("Choisir une colonne de depart");
			colDest = this.sc.nextInt();
			this.sc.nextLine();
			move(convert(colExp),convert(colDest));
			if(!(move(convert(colExp),convert(colDest)))) {
				System.out.println("Erreur");
			}
		}

	 
}
