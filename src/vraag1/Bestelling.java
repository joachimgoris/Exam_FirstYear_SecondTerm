package vraag1;

public class Bestelling {
	private Product[] arrProduct = new Product[100];
	private int productNummer = 1000;

	public Bestelling() {

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
			arrProduct[productNummer] = p;
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
		if (aanwezig == true)
		{
			arrProduct[pN].setMerk("");
			arrProduct[pN].setNaam("");
			arrProduct[pN].setPrijs(0);
			arrProduct[pN].setVolume(0);
			arrProduct[pN].setProductNummer(0);
			System.out.println("Product met productnummer "+pN+" werd verwijderd.");
		}
		else {
			System.out.println("Er is geen product gevonden met productnummer "+pN+".");
		}
	}
	
	public void toonLijst() {
		for (Product product : arrProduct) {
			if(product.getMerk() != "" || product.getMerk() != null) {
				System.out.println(product.getProductNummer()+"\tMerk: "+product.getMerk()+"\tNaam: "+product.getNaam()+"\tVolume: "+product.getVolume()+"\tPrijs: "+product.getPrijs()+"\tCode: "+product.getProductCode());
			}
		}
	}
	
	public void toonPerMerk() {
		
	}
}
