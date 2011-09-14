
public class CaseConstructible extends CaseAchetable{
	private int nbMaisons;
	private int nbHotels;
	private int loyerMaison,loyerHotel;
	private int prixMaison,prixHotel;
	
	public CaseConstructible(String nom,int prixachat,int prixmaison,int prixhotel, int loyermaison, int loyerhotel){
		this.Nom=nom;
		this.Prixachat=prixachat;	
		this.nbMaisons=0;
		this.nbHotels=0;
		this.loyerMaison=loyermaison;
		this.loyerHotel=loyerhotel;
		this.prixMaison=prixmaison;
		this.prixHotel=prixhotel;
		calculerLoyer();
	}
	
	public void construireMaisonHotel(int nbMaisonAConstruire, int nbHotelAConstruire) {

	    // On ajoute les nouvelles maisons
	    this.nbMaisons = this.nbMaisons + nbMaisonAConstruire;

	    // On ajoute les niouveaux hotels à construireMaison
	    this.nbHotels = this.nbHotels + nbHotelAConstruire;

	    // On met à jour le loyer
	    this.calculerLoyer();
	}
	
	//public void vendreMaison(int nombre){};
	public void calculerLoyer(){
		
		if (nbMaisons == 0 && nbHotels == 0){
			Loyer =Prixachat/10 ;
		}
		else {
			Loyer = loyerMaison*nbMaisons + loyerHotel*nbHotels ;
		}
	}

	public int getNbMaisons() {
		return nbMaisons;
	}

	public void setNbMaisons(int nbMaisons) {
		this.nbMaisons = nbMaisons;
	}

	public int getNbHotels() {
		return nbHotels;
	}

	public void setNbHotels(int nbHotels) {
		this.nbHotels = nbHotels;
	}

	public int getLoyerMaison() {
		return loyerMaison;
	}

	public void setLoyerMaison(int loyerMaison) {
		this.loyerMaison = loyerMaison;
	}

	public int getLoyerHotel() {
		return loyerHotel;
	}

	public void setLoyerHotel(int loyerHotel) {
		this.loyerHotel = loyerHotel;
	}

	public int getPrixMaison() {
		return prixMaison;
	}

	public void setPrixMaison(int prixMaison) {
		this.prixMaison = prixMaison;
	}

	public int getPrixHotel() {
		return prixHotel;
	}

	public void setPrixHotel(int prixHotel) {
		this.prixHotel = prixHotel;
	};
	

}
