
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


public void payer(Joueur joueur) throws  NoMoreMoney
	  {  
			int loyer = position.getLoyer();
	          if(this.fortune < loyer)
	                  throw new NoMoreMoney();
	          else
	          {
	                  this.fortune-=loyer;
	                  joueur.fortune+=loyer;
	          }
	  }
	  
	  
	/*try {
		payer(somme,joueur);        
	    } 
	catch (NoMoreMoney e) {
		}*/
public void achete(){
	int achat=position.getPrixAchat();
	 if(this.fortune <achat )
         throw new NoMoreMoney();
 else
 {
         this.fortune-=achat;
         this.position.setProprietaire(this);
  }
	
}

public static int lanceLeDe() {
	return ((int) Math.floor(Math.random()*6))+1;
}
public void construire(int nb_maison){
}
public void avance(int de,Plateau p)
{
 int pos=(de+this.position.getNumero())%40;
 this.position=p.getCases()[pos];
}
public  void tourdejeu(Plateau p){
	int de=lanceLeDe();
	avance(de,p);
	if (this.position instanceof Case)
		{
		if ((position.getProprietaire()==null))
			{
			try {
				this.achete();        
			    } 
			catch (NoMoreMoney e) {
				}
			}
		else ()	
		}
}
public Joueur(String nom) {
	super();
	this.nom = nom;
}



}
