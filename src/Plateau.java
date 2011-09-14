import java.util.ArrayList;
import java.util.LinkedList;


public class Plateau {

	protected ArrayList<Case> cases;
	protected LinkedList<Joueur> joueurs;
	
	public void initPlateau(ArrayList<String> nomsdesjoueurs) {

		int i;
		int r = nomsdesjoueurs.size();
		for ( i=0; i<r; i++){
		joueurs.add(new Joueur(nomsdesjoueurs[i]));
		}
		
		cases = new ArrayList<Case>(40);

		cases.add(0, new CaseNonAchetable("Go", 200));
		cases.add(1, new CaseConstructible("Mediterranean Avenue", 60));
		cases.add(2, new CaseNonAchetable("CommChest"));
		cases.add(3, new CaseConstructible("Baltic Avenue", 60));
		cases.add(4, new CaseNonAchetable("Income Tax", -200));
		cases.add(5, new Gare("Reading Railroad", 200));
		cases.add(6, new CaseConstructible("Oriental Avenue", 100));
		cases.add(7, new CaseNonAchetable("Chance"));
		cases.add(8, new CaseConstructible("Vermont Avenue", 100));
		cases.add(9, new CaseConstructible("Connecticut Avenue", 120));
		cases.add(10, new CaseNonAchetable("Prison"));
		cases.add(11, new CaseConstructible("St. Charles Place", 140));
		cases.add(12, new Compagnie("Electric Company"));
		cases.add(13, new CaseConstructible("State Avenue", 140));
		cases.add(14, new CaseConstructible("Virginia Avenue", 160));
		cases.add(15, new Gare("Pennsylvania Railroad"));
		cases.add(16, new CaseConstructible("St. James Place", 180));
		cases.add(17, new CaseNonAchetable("Caisse de Communauté"));
		cases.add(18, new CaseConstructible("Tenessee avenue", 180));
		cases.add(19, new CaseConstructible("New York Avenue", 200));
		cases.add(20, new CaseNonAchetable("Free Parking"));
		cases.add(21, new CaseConstructible("Kentucky Avenue", 220));
		cases.add(22, new CaseNonAchetable("Chance"));
		cases.add(23, new CaseConstructible("Indiana Avenue", 220));
		cases.add(24, new CaseConstructible("Illinois Avenue", 240));
		cases.add(25, new Gare("B&O Railroad", 200));
		cases.add(26, new CaseConstructible("Atlantic Avnue", 260));
		cases.add(27, new CaseConstructible("Ventinor Avenue", 260));
		cases.add(28, new CaseNonAchetable("Water Works"));
		cases.add(29, new CaseConstructible("Marvin Gardens", 280));
		cases.add(30, new CaseNonAchetable());
		cases.add(31, new CaseConstructible("Pacific Avenue", 300));
		cases.add(32, new CaseConstructible("North Carolina Avenue", 300));
		cases.add(33, new CaseNonAchetable());
		cases.add(34, new CaseConstructible("Pennsylvania avenue", 330));
		cases.add(35, new Gare("Short Line", 200));
		cases.add(36, new CaseNonAchetable());
		cases.add(37, new CaseConstructible("Park Place", 390));
		cases.add(38, new CaseNonAchetable("Luxury Tax", 1500));
		cases.add(39, new CaseConstructible("Boardwalk", 400));
	}

	public void tourDeJeu() {
		for(i=0; i<this.joueurs.size(); i++){
			if(!this.finDePartie()){
			this.joueurs[i].tourJoueur();}
		}
	}

	public boolean finDePartie () {
		boolean r=false;
		if(this.joueurs.size()==1) {r=true;}
		return r;
		
	}
	
	public LinkedList<Joueur> getJoueurs(){return this.joueurs;}
	
}
