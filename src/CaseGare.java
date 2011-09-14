
public class CaseGare extends CaseAchetable{

	public CaseGare(String nom,int prixachat){
		this.Nom=nom;
		this.Prixachat=prixachat;
		calculerloyer();
		}
	
	   public void calculerloyer() {
		   	 
		   	 if (this.Proprietaire == null) {
		   		 setLoyer(0);
		   	 }
		   	 else {
		   	 setLoyer(2500*this.Proprietaire.getNbGare());
		   	 }
	
	   }
}
