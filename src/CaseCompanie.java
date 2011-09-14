
public class CaseCompanie extends CaseAchetable{
	
	public CaseCompanie(String nom,int prixachat){
		this.Nom=nom;
		this.Prixachat=prixachat;
		this.Loyer = Prixachat/10;	
	}
	
	public void calculerloyer(int dernierLance) {
  		 if (this.Proprietaire == null) {
			 setLoyer(0);
		}

		else {
			setLoyer(600*dernierLance*this.Proprietaire.getNbCompagnie());
		}
}

}
