package fr.ei3info;
public class CaseGare extends CaseAchetable {

	public CaseGare(String nom, int prixachat) {
		this.Nom = nom;
		this.prixAchat = prixachat;
		calculerloyer();
	}

	public void calculerloyer() {

		if (this.proprietaire == null) {
			setLoyer(0);
		} else {
			setLoyer(2500 * this.proprietaire.getNbGare());
		}

	}
}
