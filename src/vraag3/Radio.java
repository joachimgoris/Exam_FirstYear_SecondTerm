package vraag3;

public class Radio implements MuziekSpeler{
	

	private boolean aan;
	private double frequentie;
	
	public Radio() {
		setFrequentie(97.9);
		aan = false;
	}
	
	@Override
	public void play() {
		aan = true;
		
	}

	@Override
	public void stop() {
		aan = false;
		
	}

	public double getFrequentie() {
		return frequentie;
	}

	public void setFrequentie(double frequentie) throws IllegalArgumentException {
		if(frequentie< 108 && frequentie > 88) {
			this.frequentie = frequentie;
		}
		else {
			throw new IllegalArgumentException();
		}
		
	}
	
	@Override
	public String toString() {
		String status = "uit";
		if(aan==true) {
			status = "aan";
		}
		return "Radio [status radio = " + status + ", frequentie=" + frequentie + "]";
	}
}
