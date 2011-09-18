package fr.ei3info;
public class CaseCompanie extends CaseAchetable {

	public CaseCompanie(String nom, int prixachat) {
		this.Nom = nom;
		this.prixAchat = prixachat;
		this.loyer = prixAchat / 10;
	}

	public void calculerloyer(int dernierLance) {
		if (this.proprietaire == null) {
			setLoyer(0);
		}

		else {
			setLoyer(600 * dernierLance * this.proprietaire.getNbCompagnie());
		}
	}
}
