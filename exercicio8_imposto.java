package exercInicianta_parte2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sal = sc.nextDouble();
		
		if(sal >= 0.0 && sal <=2000.0) {
			System.out.println("isento");
		}else if (sal >= 2000.01 && sal <= 3000.0) {
			double irrf = sal * 0.08;
			System.out.printf("R$ %.2f", irrf);
		}else if (sal >= 3000.01 && sal <= 4500.0) {
			double irrf = (1000.0 * 0.08) + ((sal-3000.0) * 0.18);
			System.out.printf("R$ %.2f", irrf);
		}else if (sal > 4500.0) {
			double irrf = (1000.0 * 0.08) +(1500.0 * 0.18) +  ((sal-4500.0) * 0.28);
			System.out.printf("R$ %.2f", irrf);
		}
		sc.close();

	}

}
