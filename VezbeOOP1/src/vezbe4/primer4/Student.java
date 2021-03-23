package vezbe4.primer4;

public class Student {

	protected String ime;
	private String indeks;
	private String grad;

	void ispisi() {
		System.out.println("Student (Ime: " + ime + ", indeks: " + indeks + ", grad: " + grad + ")");
	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getIndeks() {
		return indeks;
	}

	public void setIndeks(String indeks) {
		this.indeks = indeks;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

}
