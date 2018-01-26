package vraag1;

public abstract class Product {
	private int productNummer;
	private String merk;
	private String naam;
	private int volume;
	private double prijs;

	public Product(int productNummer, String merk, String naam, int volume, double prijs) {
		setProductNummer(productNummer);
		setMerk(merk);
		setNaam(naam);
		setVolume(volume);
		setPrijs(prijs);
	}

	public int getProductNummer() {
		return productNummer;
	}

	public void setProductNummer(int productNummer) {
		this.productNummer = productNummer;
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

	public String getProductCode() {
		String retvalue = "";
		retvalue += getMerk().substring(0, 2) + getNaam().substring(0, 2) + getVolume();
		retvalue = retvalue.toUpperCase();
		retvalue.replace(' ', '_');
		return retvalue;
	}

	@Override
	public boolean equals(Object object) {
		if ((object != null) && (this.getClass() == object.getClass())
				&& (((Product) object).getMerk().equals(this.getMerk())) &&
				(((Product) object).getNaam().equals(this.getNaam()))
				&& (((Product) object).getVolume() == this.getVolume()))
			return true;
		else
			return false;
	}
}
