package vraag1;

public interface Berekenbaar {
	public final int BTW = 21;
	
	public double totalePrijs();
	
	public default double totalePrijsExclBtw() {
		double retvalue;
		retvalue = totalePrijs()/1.21;
		return retvalue;
	}
}
