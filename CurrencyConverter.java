package util;

public class CurrencyConverter {

	public static final double IOF = 1.06;
	public double dollarPrice;
	public double dollar;
	
	public double reals() {
		return dollarPrice * dollar * IOF;
	}
}
