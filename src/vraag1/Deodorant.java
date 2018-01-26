package vraag1;

public class Deodorant extends Product {
	private DeoType soort;

	public Deodorant(int PN, String m, String n, int v, double p, DeoType dt) {
		super(PN, m, n, v, p);
		setSoort(dt);
		// TODO Auto-generated constructor stub
	}

	public DeoType getSoort() {
		return soort;
	}

	public void setSoort(DeoType soort) {
		this.soort = soort;
	}

}
