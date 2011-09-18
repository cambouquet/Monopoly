package fr.ei3info;
public class CaseAchetable extends Case {

	protected Joueur proprietaire;
	protected int loyer;
	protected int prixAchat;

	public boolean estLibre() {
		if (proprietaire == null) {
			return true;
		} else {
			return false;
		}
	}

	public Joueur getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Joueur proprietaire) {
		this.proprietaire = proprietaire;
	}

	public int getLoyer() {
		return loyer;
	}

	public void setLoyer(int loyer) {
		this.loyer = loyer;
	}

	public int getPrixachat() {
		return prixAchat;
	}

	public void setPrixachat(int prixAchat) {
		this.prixAchat = prixAchat;
	}

}
