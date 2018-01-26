package vraag1;

public class Bestelling implements Berekenbaar {
	private Product[] arrProduct = new Product[100];
	private int productNummer = 1000;

	public Bestelling() {
		vulArray();
	}

	public void vulArray() {
		for (int i = 0; i < arrProduct.length; i++) {
			arrProduct[i] = new Deodorant(0, null, null, productNummer, productNummer, null);
		}

	}

	public void voegProductToe(Product p) throws IllegalArgumentException {
		boolean alToegevoegd = false;
		for (Product product : arrProduct) {
			if (product.getMerk() == p.getMerk() && product.getNaam() == p.getNaam()
					&& product.getVolume() == p.getVolume()) {
				alToegevoegd = true;
			}
		}
		if (alToegevoegd == false) {
			arrProduct[productNummer - 1000] = p;
			productNummer++;
		} else {
			System.out.println("Dit product is reeds toegevoegd.");
			throw new IllegalArgumentException();
		}

	}

	public void verwijderProduct(int pN) {
		boolean aanwezig = false;
		for (Product product : arrProduct) {
			if (product.getMerk() != "" && product.getMerk() != null)
				aanwezig = true;
		}
		if (aanwezig == true) {
			arrProduct[pN] = new Deodorant(0, null, null, pN, pN, null);
			System.out.println("Product met productnummer " + pN + " werd verwijderd.");
		} else {
			System.out.println("Er is geen product gevonden met productnummer " + pN + ".");
		}
	}

	public void toonLijst() {
		for (Product product : arrProduct) {
			if (product.getMerk() != "" && product.getMerk() != null) {
				System.out.println(product.getProductNummer() + "\tMerk: " + product.getMerk() + "\tNaam: "
						+ product.getNaam() + "\tVolume: " + product.getVolume() + "\tPrijs: " + product.getPrijs()
						+ "\tCode: " + product.getProductCode() + "\n");
			}
		}
	}

	public void toonPerMerk(String merk) {
		System.out.println("Van het merk " + merk + ":");
		for (Product product : arrProduct) {
			if (product.getMerk() == merk) {
				System.out.println(product.getProductNummer() + "\tMerk: " + product.getMerk() + "\tNaam: "
						+ product.getNaam() + "\tVolume: " + product.getVolume() + "\tPrijs: " + product.getPrijs()
						+ "\tCode: " + product.getProductCode() + "\n");
			}
		}
	}

	public void toonParfums() {
		System.out.println("Alle Parfums:");
		for (Product product : arrProduct) {
			if (product.getClass().equals(Parfum.class)) {
				System.out.println(product.getProductNummer() + "\tMerk: " + product.getMerk() + "\tNaam: "
						+ product.getNaam() + "\tVolume: " + product.getVolume() + "\tPrijs: " + product.getPrijs()
						+ "\tCode: " + product.getProductCode() + "\n");
			}
		}
	}

	public int getAantalProducten() {
		int retvalue = 0;
		for (Product product : arrProduct) {
			if (product.getMerk() != "" || product.getMerk() != null) {
				retvalue++;
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
