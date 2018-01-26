package vraag1;

public class Deodorant extends Product {
	private DeoType soort;

	public Deodorant(int productNummer, String merk, String naam, int volume, double prijs, DeoType deoType) {
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
