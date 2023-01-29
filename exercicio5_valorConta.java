package exercInicianta_parte2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double cod1 = 4.0;
		double cod2 = 4.50;
		double cod3 = 5.0;
		double cod4 = 2.0;
		double cod5 = 1.50;
		
		int cod = sc.nextInt();
		double qt = sc.nextInt();
		
		if (cod == 1) {
			double total = cod1* qt;
			System.out.printf("Total: R$ %.2f", total);
		}else if (cod ==2) {
			double total = cod2* qt;
			System.out.printf("Total: R$ %.2f", total);
		}else if (cod ==3) {
			double total = cod3* qt;
			System.out.printf("Total: R$ %.2f", total);
		}else if (cod ==4) {
			double total = cod4* qt;
			System.out.printf("Total: R$ %.2f", total);
		}else if (cod ==5) {
			double total = cod5* qt;
			System.out.printf("Total: R$ %.2f", total);
		}
		
		sc.close();
		}

	}


