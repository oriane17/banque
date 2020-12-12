package banque;

public class Operation {
		
		private double somme;

		public Operation(double somme) {
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
}

