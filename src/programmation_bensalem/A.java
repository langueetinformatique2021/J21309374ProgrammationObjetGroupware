package programmation_bensalem;
/** 
 * A contient la méthode treize retournant la valeur true si un entier n passé en paramètre est
divisible par 13 (false dans le cas contraire)
 */
public class A {
	/** 
	 * méthode treize retournant la valeur true si un entier n passé en paramètre est
divisible par 13 (false dans le cas contraire)
	 *
	 * paramètre n entier
	 * return true si n divisible par 13
	 */
	public static boolean treize(int n) {
// calcul du reste d'une division par 13
		return (n % 13 == 0);
	}
	
}
