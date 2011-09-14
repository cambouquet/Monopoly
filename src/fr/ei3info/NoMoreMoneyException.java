package fr.ei3info;
class NoMoreMoneyException extends Exception {

	private static final long serialVersionUID = 1L;

	public NoMoreMoneyException() {
		System.out.println("Le joueur n'a pas assez d'argent!");
	}
}
