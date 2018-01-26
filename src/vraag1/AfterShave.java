package vraag1;

public class AfterShave extends Product {
	private DeoType soort;

	public AfterShave(int productNummer, String merk, String naam, int volume, double prijs, DeoType deoType) {
		super(productNummer, merk, naam, volume, prijs);
		setSoort(deoType);
		// TODO Auto-generated constructor stub
	}

	public DeoType getSoort() {
		return soort;
	}

	public void setSoort(DeoType soort) {
		this.soort = soort;
	}
	
}
