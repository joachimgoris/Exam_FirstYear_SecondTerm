package vraag1;

public abstract class Product {
	private int productNummer;
	private String merk;
	private String naam;
	private int volume;
	private double prijs;
	
	public Product(int PN, String m, String n, int v, double p) {
		setProductNummer(PN);
		setMerk(m);
		setNaam(n);
		setVolume(v);
		setPrijs(p);
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
		retvalue += getMerk().substring(0, 2)+getNaam().substring(0, 2)+getVolume();
		retvalue = retvalue.toUpperCase();
		retvalue.replace(' ', '_');
		return retvalue;
	}
	
	public boolean equals(Product p) {
		if(this.getMerk() == p.getMerk()&& this.getNaam()==p.getNaam()&&this.getVolume()==p.getVolume()) {
			return true;
		} else {
			return false;
		}
	}
}
