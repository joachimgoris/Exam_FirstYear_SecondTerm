package vraag1;

public class Parfum extends Product {
	private DeoType soort;
	
	public Parfum(int productNummer, String merk, String naam, int volume, double prijs) {
		super(productNummer, merk, naam, volume, prijs);
	}

	public DeoType getSoort() {
		return soort;
	}

	public void setSoort(DeoType soort) {
		this.soort = soort;
	}

}
