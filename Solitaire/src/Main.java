import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
		
		Carte solitaire = new Carte();
		solitaire.remplir_paquet();
		solitaire.remplir_colonne();
		solitaire.afficher_solitaire();
		solitaire.tirer_une_carte();
		Jeux monJeux = new Jeux();
		monJeux.menu();
}
}
