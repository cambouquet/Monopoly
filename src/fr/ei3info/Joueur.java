package fr.ei3info;
public class Joueur {
	private String nom;
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	private int fortune;
	private int nbGare;
	private Case position;
	private int nbCompagnie;

	public int getNbGare() {
		return nbGare;
	}

	public void setNbGare(int nbGare) {
		this.nbGare = nbGare;
	}

	public int getNbCompagnie() {
		return nbCompagnie;
	}

	public void setNbCompagnie(int nbCompagnie) {
		this.nbCompagnie = nbCompagnie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getFortune() {
		return fortune;
	}

	public void setFortune(int fortune) {
		this.fortune = fortune;
	}

	public void payer(Joueur joueur) throws NoMoreMoneyException {
		if (position instanceof CaseAchetable) {
			int loyer = ((CaseAchetable) position).getLoyer();
			if (this.fortune < loyer)
				throw new NoMoreMoneyException();
			else {
				this.fortune -= loyer;
				joueur.fortune += loyer;
			}
		}
	}

	public void achete() throws NoMoreMoneyException {
		if (position instanceof CaseAchetable) {
			int achat = ((CaseAchetable) position).getPrixachat();
			if (this.fortune < achat)
				throw new NoMoreMoneyException();
			else {
				this.fortune -= achat;
				this.position.setProprietaire(this);
			}
		}
	}

	public static int lanceLeDe() {
		return ((int) Math.floor(Math.random() * 6)) + 1;
	}

	public void construire(int nb_maison) {
	}

	public void avance(int de, Plateau p) {
		int pos = (de + this.getNumero()) % 40;
		this.position = p.getCases().get(pos);
	}

	public void tourdejeu(Plateau p) {
		int de = lanceLeDe();
		avance(de, p);
		if (this.position instanceof Case) {
			if ((position.getProprietaire() == null)) {
				try {
					this.achete();
				} catch (NoMoreMoneyException e) {
				}
			}

		}
	}

	public Joueur(String nom) {
		super();
		this.nom = nom;
	}

	public String afficheCaseJoueur() {
		String retour = new String();
		String limiteHor = "+------------------------------+\n";
		retour += limiteHor;
		retour += this.position.getNom() + "\n";
		if (position instanceof CaseAchetable) {
			if (((CaseAchetable) position).estLibre()) {
				retour += formate("La case est libre.");

				retour += formate("Prix = "
						+ ((CaseAchetable) position).getPrixachat());
			} else {
				retour += formate("La case est occup�e.");
				if (position instanceof CaseAchetable) {

					retour += formate("Loyer = "
							+ ((CaseAchetable) position).getLoyer());
				}
			}
		}
		retour += limiteHor;
		retour += formate(this.nom);
		retour += limiteHor;
		retour += formate("Fortune: " + this.fortune);
		retour += formate("Nb gares: " + this.nbGare);
		retour += formate("Nb compagnies: " + this.nbCompagnie);
		retour += limiteHor;
		return retour;
	}

	private String formate(String chaine) {
		String retour = "|";
		retour += chaine;
		int l = 30 - chaine.length();
		for (int i = 0; i < l; i++) {
			retour += " ";
		}
		retour += "|\n";
		return retour;
	}

}
