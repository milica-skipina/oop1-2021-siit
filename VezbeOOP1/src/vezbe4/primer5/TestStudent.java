package vezbe4.primer5;

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
		
		Student s1 = new Student();
		Student s2 = new Student("Marko", "111", "Novi Sad");
		Student s3 = new Student(s2);
		Student s4 = s2;
		
		System.out.println("\nPrimjer instanciranja objekata pomocu razlicitih konstruktora");
		s1.ispisi();
		s2.ispisi();
		s3.ispisi();
		s4.ispisi();

		/*
		int a, b;
		a = 3;
		b = a;
		a = 5;
		System.out.println("a = " + a + "\t b = " + b);
		
		System.out.println("\nIzmjena grada studenta2");
		s2.setGrad("Beograd");
		s2.ispisi();
		s3.ispisi();
		s4.ispisi();
		*/
	}

}
