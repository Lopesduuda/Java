package exercIniciante_parte3;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tipo = sc.nextInt();
		int soma1 = 0;
		int soma2 = 0;
		int soma3 = 0;
		
		while(tipo != 4) {
			
			if(tipo == 1) {
				soma1 = soma1 + 1;
			}else if (tipo == 2) {
				soma2 = soma2 +1;
			}else if (tipo == 3) {
				soma3 = soma3 +1;
			}
			
			tipo = sc.nextInt();
			
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + soma1);
		System.out.println("Gasolina: " + soma2);
		System.out.println("Diesel: " + soma3);
		
		
		
		
		sc.close();

	}

}
