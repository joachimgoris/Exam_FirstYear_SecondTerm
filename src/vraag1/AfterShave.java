package vraag1;

public class AfterShave extends Product {
	private DeoType soort;

	public AfterShave(int PN, String m, String n, int v, double p) {
		super(PN, m, n, v, p);
		// TODO Auto-generated constructor stub
	}

	public DeoType getSoort() {
		return soort;
	}

	public void setSoort(DeoType soort) {
		this.soort = soort;
	}
	
}