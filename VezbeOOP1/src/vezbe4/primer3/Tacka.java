package vezbe4.primer3;

public class Tacka {

	double x;
	double y;

	double rastojanje(Tacka t) {
		double d = Math.sqrt((x - t.x) * (x - t.x) + (y - t.y) * (y - t.y));
		return d;
	}

	double rastojanje(double x, double y) {
		double d = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
		return d;
	}

}
