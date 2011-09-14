

public class monopoly_test_joueur {

	public int test_lanceLeDe(){
		int occurence1 = 0;
		int occurence2 = 0;
		int occurence3 = 0;
		int occurence4 = 0;
		int occurence5 = 0;
		int occurence6 = 0;
		double tolerance = 0.1; 
		boolean failed = false;
		int MAX_ITER = 100000;
		
		Joueur joueurTest =  new Joueur("Test_Eric");
		for (int i = 0; i < MAX_ITER &&  !failed; i++){
			switch(joueurTest.lanceLeDe()){
			case 1 : 
				occurence1 ++;
				break;
			case 2 : 
				occurence1 ++;
				break;
			case 3 : 
				occurence1 ++;
				break;
			case 4 : 
				occurence1 ++;
				break;
			case 5 : 
				occurence1 ++;
				break;
			case 6 : 
				occurence1 ++;
				break;
				default : 
					failed = true;
					break;
			}
		}

if (failed) return 0; // Uncorrect value 
if (Math.abs(occurence1- MAX_ITER/6)>tolerance*MAX_ITER
		||Math.abs(occurence1- MAX_ITER/6)>tolerance*MAX_ITER
		|| Math.abs(occurence1- MAX_ITER/6)>tolerance*MAX_ITER
		|| Math.abs(occurence1- MAX_ITER/6)>tolerance*MAX_ITER
		|| Math.abs(occurence1- MAX_ITER/6)>tolerance*MAX_ITER
		|| Math.abs(occurence1- MAX_ITER/6)>tolerance*MAX_ITER
		)
	return 1; // Répartition non uniforme
	}
}
