package banque;

public class Standard extends Compte{
	
	public Standard(String prenom, String nom, String type, double somme) {
		super(prenom, nom, type, somme);
	}
	
	@Override
	public void Retrait(double somme, Compte compte) {
		if (this.getType() == "Standard") {
			if (CheckArgent(somme)) {
				super.somme = super.somme - somme;
				System.out.println("Vous avez " + super.somme + "€ sur votre compte.");				
			}else{
				super.somme = (super.somme - somme)-5;
				System.out.println("Vous avez " + super.somme + "€ sur votre compte.");				
			}
		}
	}
}