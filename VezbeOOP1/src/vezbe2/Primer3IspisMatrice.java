package vezbe2;

public class Primer3IspisMatrice {

	public static void main(String[] args) {

		// ugnjezdene naredbe
		int n = 4, m = 7;
		System.out.println("Matrica A je oblika: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("\t");
			for (int j = 1; j <= m; j++) {
				System.out.print(j);
				if (j < m) {
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}

	}

}
