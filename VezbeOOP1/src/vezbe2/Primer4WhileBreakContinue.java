package vezbe2;

public class Primer4WhileBreakContinue {

	public static void main(String[] args) {
		
		/* while (logicki uslov) {
		   	naredbe koje se izvrsavaju sve dok je
		   	logicki uslov ispunjen
		   }
		 */
		int i = 1, n = 10, suma = 0;
		System.out.println("Ispis parnih brojeva na intervalu [1, 10], ciji zbir je manji od 15");
		while (i <= n) {
			if (i % 2 == 1) {
				i += 1;
				continue;
			}
			if (suma + i > 15) {
				break;
			}
			
			System.out.println(i + " ");
			suma = suma + i;
			i += 1;
		}
	}

}
