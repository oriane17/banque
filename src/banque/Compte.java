package banque;

public class Compte {
	private String prenom;
	private String nom;
	private String type;
	protected double somme;
	
	public Compte(String prenom, String nom, String type, double somme) {		
		this.prenom = prenom;
		this.nom = nom;
		this.type = type;
		this.somme = somme;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public double getSomme() {
		return somme;
	}

	public void setSomme(double somme) {
		this.somme = somme;
	}

	protected boolean CheckArgent(double somme) {
		if (this.somme>=somme) {
			return true;
		}
		return false;		
	}
	
	public void Retrait(double somme, Compte compte) {
		if (CheckArgent(somme)) {
			this.somme = this.somme - somme;
		}else {
				System.out.println("Vous n'avez pas assez d'argent sur votre compte.");
			}
		}
	
	public void Depot(double somme, Compte compte) {
		this.somme = this.somme + somme;
		System.out.println("Vous avez " + this.somme + "€ sur votre compte.");				
		}
	
	public double Transfert(double somme, Compte compte) {
		if (CheckArgent(somme)) {
			this.somme = this.somme - somme;
			return somme;
		}
		return 0;
	}
	
	
	@Override
	public String toString() {
		return "Le compte " + this.getType() + " de " + this.getPrenom() + " " + this.getNom() + " contient " + this.getSomme() + "€";
	}

}


