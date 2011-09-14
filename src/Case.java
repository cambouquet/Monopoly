
abstract class Case {
	protected String Nom;
	protected Joueur Proprietaire;

	public Joueur getProprietaire() {
		return Proprietaire;
	}

	public void setProprietaire(Joueur proprietaire) {
		Proprietaire = proprietaire;
	}
	
	public String getNom()
	{
		return this.Nom;
	}

}
