package vezbe4.primer3;

public class Krug {

	// poluprecnik kruga
	double r;
	
	// drugi dio
	// centar
	// Tacka c;
	
	double povrsina() {
		return r*r*Math.PI;
	}
	
	double obim() {
		return 2*r*Math.PI;
	}
	
	/* drugi dio
	void provera(Tacka t) {
		double d = t.rastojanje(c);
		if (d < r) {
			System.out.println("Tacka se nalazi unutar kruga");
		}
		else if(d == r) {
			System.out.println("Tacka se nalazi na krugu");
		}
		else {
			System.out.println("Tacka se nalazi izvan kruga");
		}
	}
	*/
}
