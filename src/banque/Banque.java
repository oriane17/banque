package banque;

// Ca ne marche pas, c'est ca qu'il faut m'expliquer mdrrr
// Je ne sais pas comment faire la fonction ajouterClient et encore moins supprimerClient mdrr

public class Banque extends Compte{
	private String typecreation;

	public Banque(String prenom, String nom, String type, double somme) {
		super(prenom, nom, type, somme);
	}
	
	public void ajouterClient(String type, String nom){
		if (this.getTypecreation() == "Platine") {
			Platine totoPlatine = new Platine(getPrenom(), getNom(), getType(), getSomme(), getDecouvert());
		}
		if (super.getType() == "Standard") {
			Standard totoStandard = new Standard(getPrenom(), getNom(), getType(), getSomme());
			}
		}
		if (super.getType() == "Epargne") {
		}
	}

	public void supprimerClient(){
	}

	public String getTypecreation() {
		return Typecreation;
	}

	public void setTypecreation() {
		return Typecreation;
	}
}
