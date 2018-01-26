package vraag1;

public class Bestelling implements Berekenbaar {
	private Product[] arrProduct = new Product[100];
	private int productNummer = 1000;

	public Bestelling() { }

	public void voegProductToe(Product p) throws IllegalArgumentException {
		boolean alToegevoegd = false;
		for (Product product : arrProduct) {
			if (product != null) {
				if (product.equals(p)) {
					alToegevoegd = true;
				}
			}
		}
		if (!alToegevoegd) {
			arrProduct[productNummer - 1000] = p;
			productNummer++;
		} else {
			throw new IllegalArgumentException("Dit product is reeds toegevoegd.");
		}

	}

	public void verwijderProduct(int productNummer) {
		boolean aanwezig = false;
		for (Product product : arrProduct) {
			if (product != null) {
				if (!product.getMerk().equals("") && !product.getMerk().equals(null))
					aanwezig = true;
			}
		}
		if (aanwezig == true) {
			arrProduct[productNummer] = new Deodorant(0, null, null, productNummer, productNummer, null);
			System.out.println("Product met productnummer " + productNummer + " werd verwijderd.");
		} else {
			System.out.println("Er is geen product gevonden met productnummer " + productNummer + ".");
		}
	}

	public void toonLijst() {
		for (Product product : arrProduct) {
			if (product != null) {
				if (!product.getMerk().equals("") && !product.getMerk().equals(null)) {
					System.out.println(product.getProductNummer() + "\tMerk: " + product.getMerk() + "\tNaam: "
							+ product.getNaam() + "\tVolume: " + product.getVolume() + "\tPrijs: " + product.getPrijs()
							+ "\tCode: " + product.getProductCode() + "\n");
				}
			}
		}
	}

	public void toonPerMerk(String merk) {
		for (Product product : arrProduct) {
			if (product != null) {
				if (product.getMerk().equals(merk)) {
					System.out.println(product.getProductNummer() + "\tMerk: " + product.getMerk() + "\tNaam: "
							+ product.getNaam() + "\tVolume: " + product.getVolume() + "\tPrijs: " + product.getPrijs()
							+ "\tCode: " + product.getProductCode() + "\n");
				}
			}
		}
	}

	public void toonParfums() {
		for (Product product : arrProduct) {
			if (product != null) {
				if (product.getClass().equals(Parfum.class)) {
					System.out.println(product.getProductNummer() + "\tMerk: " + product.getMerk() + "\tNaam: "
							+ product.getNaam() + "\tVolume: " + product.getVolume() + "\tPrijs: " + product.getPrijs()
							+ "\tCode: " + product.getProductCode() + "\n");
				}
			}
		}
	}

	public int getAantalProducten() {
		int retvalue = 0;
		for (Product product : arrProduct) {
			if (product != null) {
				if (product.getMerk() != "" || product.getMerk() != null) {
					retvalue++;
				}
			}
		}
		return retvalue;
	}

	@Override
	public double totalePrijs() {
		double retvalue = 0;
		for (int i = 0; i < getAantalProducten(); i++) {
			retvalue += arrProduct[i].getPrijs();
		}
		return retvalue;
	}
}
