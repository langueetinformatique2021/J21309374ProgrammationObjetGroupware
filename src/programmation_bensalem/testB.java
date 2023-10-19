package programmation_bensalem;
/** 
 * permet de tester les méthodes de la classe A
 */
public class testB {
	/**
	 * test la méthode divise de la classe B
	 * @param args non utilisé 
	*/
	
	public static void main(String[] args) {
		int i = 1;
		for (int k = 0; k < 50; k++) {
			i = B.divise(i);
			System.out.println(k + " " + i);
	
			}
	}
}