package exercInicianta_parte1;
import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * Math.pow(raio,2.0);
		
		Locale.setDefault(Locale.US);
		System.out.printf("valor da área: %.4f", area );

		sc.close();
	}

}
