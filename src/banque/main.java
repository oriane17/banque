package banque;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {
	public static void main(String[] args) throws IOException {
// Creation compte
		Platine ComptePlatine = new Platine("Oriane", "SAVIO", "Platine", 10, 500);

// Creation fichier historique		
		BufferedWriter historique = new BufferedWriter(new FileWriter("C:\\Users\\orian\\Desktop\\historique_" + ComptePlatine.getNom() +".txt"));

// Retrait		
		ComptePlatine.Retrait(20, ComptePlatine);

// Creation compte
		Standard CompteStandard = new Standard("Oriane", "SAVIO", "Standard", 100);

// Avoir la somme		
		System.out.println("std" + CompteStandard.getSomme());
		
// Ecrire dans l'historique
		historique.write("std" + ComptePlatine.getSomme() + "\n");

// Calculer les agios du compte Platine
		ComptePlatine.Agio(ComptePlatine);
		System.out.println("plat" + ComptePlatine.getSomme());

//Depot d'argent		
		CompteStandard.Depot(10, CompteStandard);

// Transfert (marche que quand le compte emetteur est dans le positif)		
		CompteStandard.Depot(ComptePlatine.Transfert(50, ComptePlatine), CompteStandard);
		historique.close();

// Epargne
		Epargne CompteEpargne = new Epargne("Oriane", "SAVIO", "Epargne", 999);
		CompteEpargne.Depot(ComptePlatine.Transfert(1, ComptePlatine), CompteEpargne);
		CompteEpargne.Interet(CompteEpargne);

	}
}
