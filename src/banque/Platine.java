package banque;

public class Platine extends Compte{
	protected int decouvert;
	private double agio;

	public Platine(String prenom, String nom, String type, double somme, int decouvert) {
		super(prenom, nom, type, somme);
		this.decouvert = decouvert;
		System.out.println("Le compte " + super.getType() + " de " + super.getPrenom() + " " + super.getNom() + " contient " + super.getSomme() + "€ et peut avoir " + this.decouvert + "€ de decouvert");
	}

	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}
	
	public double getAgio() {
		return agio;
	}

	public void setAgio(double agio) {
		this.agio = agio;
	}
	
	@Override
	public void Retrait(double somme, Compte compte) {
		if (super.getType() == "Platine") {
			super.somme = super.somme + this.getDecouvert();
			if (CheckArgent(somme)) {
				super.somme = super.somme - this.getDecouvert();
				super.somme = super.somme - somme;
				System.out.println("Vous avez " + super.somme + "€ sur votre compte.");				
			}else{
				System.out.println("Vous n'avez pas assez d'argent sur votre compte.");				
			}
		}
	}
	
	public void Agio(Compte compte) {
		if (super.getType() == "Platine" && super.getSomme() < 0) {	
			this.agio = (Math.abs(super.somme)*0.01);
			System.out.println("Le compte " + super.getType() + " de " + super.getPrenom() + " " + super.getNom() + " doit payer " + (this.getAgio()) + "€ d'agio et contient donc maintenant " + super.getSomme() + "€");
		}
	}
	

//	@Override
//	public String toString() {
//		return super.toString() + " et peut avoir " + this.decouvert + "€ de decouvert";
//	}


}
