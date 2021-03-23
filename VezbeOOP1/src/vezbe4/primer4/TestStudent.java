package vezbe4.primer4;

import java.util.ArrayList;

public class TestStudent {

	public static void main(String[] args) {

		Student[] niz = new Student[3];
		niz[0] = new Student();
		niz[1] = new Student();
		niz[2] = new Student();

		// posto je atribute private, java gresku
		// System.out.println(niz[0].ime);

		// pristup atributima
		System.out.println(niz[0].getIme());

		for (Student s : niz) {
			s.ispisi();
		}
		
		niz[0].setIme("Milan");
		niz[0].setIndeks("12345");
		niz[0].setGrad("Novi Sad");
		niz[0].ispisi();
			
		// Broj elemenata moze biti zadat inicijalno
		// ArrayList<Integer> arrL = new ArrayList<Integer>(2);
		ArrayList<Student> dinamickiNiz = new ArrayList<Student>();
		dinamickiNiz.add(new Student());
		dinamickiNiz.add(new Student());
		dinamickiNiz.add(new Student());

		System.out.println(dinamickiNiz.get(0));

		for (Student s : dinamickiNiz) {
			s.ispisi();
		}

	}

}
