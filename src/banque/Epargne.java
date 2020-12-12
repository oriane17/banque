package banque;

public class Epargne extends Compte{
	
	public Epargne(String prenom, String nom, String type, double somme) {
		super(prenom, nom, type, somme);
	}
	
	public void Interet(Compte compte) {
		super.somme=(super.somme*1.03);
		System.out.println("Le compte " + super.getType() + " de " + super.getPrenom() + " " + super.getNom() + " a recu " + (super.getSomme()*0.03) + "€ d'interet et contient donc maintenant " + super.getSomme() + "€");
	}
	
	
}
