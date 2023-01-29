package exercInicianta_parte1;
import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		float code1 = sc.nextFloat();
		float num1 = sc.nextFloat();
		float val1 = sc.nextFloat();
		float code2 = sc.nextFloat();
		float num2 = sc.nextFloat();
		float val2 = sc.nextFloat();
		
		code1 = num1 * val1;
		code2 = num2 * val2;
		
		float total = code1 + code2;
		
		System.out.printf("Valor a pagar: %f", total);
		
		sc.close();

	}

}
