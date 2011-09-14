package fr.ei3info;
public class CaseAchetable extends Case {

	protected Joueur Proprietaire;
	protected int Loyer;
	protected int Prixachat;

	public boolean estLibre() {
		if (Proprietaire == null) {
			return true;
		} else {
			return false;
		}
	}

	public Joueur getProprietaire() {
		return Proprietaire;
	}

	public void setProprietaire(Joueur proprietaire) {
		Proprietaire = proprietaire;
	}

	public int getLoyer() {
		return Loyer;
	}

	public void setLoyer(int loyer) {
		Loyer = loyer;
	}

	public int getPrixachat() {
		return Prixachat;
	}

	public void setPrixachat(int prixachat) {
		Prixachat = prixachat;
	}

}
