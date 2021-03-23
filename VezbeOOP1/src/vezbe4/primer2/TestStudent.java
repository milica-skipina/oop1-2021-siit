package vezbe4.primer2;

import java.util.ArrayList;

public class TestStudent {

	public static void main(String[] args) {

		Student[] niz = new Student[3];
		niz[0] = new Student();
		niz[1] = new Student();
		niz[2] = new Student();

		System.out.println(niz[0].ime);

		for (Student s : niz) {
			s.ispisi();
		}

		// Broj elemenata moze biti zadat inicijalno
		// ArrayList<Integer> arrL = new ArrayList<Integer>(2);
		ArrayList<Student> dinamickiNiz = new ArrayList<Student>();
		dinamickiNiz.add(new Student());
		dinamickiNiz.add(new Student());
		// moze imati vise elemenata nego sto se inicijalno zada
		// dinamickiNiz.add(new Student());

		System.out.println(dinamickiNiz.get(0));

		for (Student s : dinamickiNiz) {
			s.ispisi();
		}
	}

}
