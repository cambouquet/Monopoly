
public class CaseNonAchetable extends Case {
		private int taxe;
		
		public int getTaxe() {
			return taxe;
		}

		public void setTaxe(int taxe) {
			this.taxe = taxe;
		}

		
		public CaseNonAchetable(String nom, int t){
			this.Nom = nom;
			this.taxe=t;
					
		}
	
}
