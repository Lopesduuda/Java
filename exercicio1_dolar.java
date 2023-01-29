package exercFixacao;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class exercicio1_dolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.println("What is the dollar price? ");
		cc.dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		cc.dollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", cc.reals() );
		
		sc.close();

	}

}
