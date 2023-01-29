package exercInicianta_parte1;
import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double tri = (A*C)/2;
		double pi = 3.14159;
		double cir = pi * Math.pow(C, 2.0);
		double trap = C * (A + B) / 2;
		double quad = Math.pow(B, 2.0);
		double ret = B * A;
		
		System.out.printf("TRIANGULO: %.3f\n", tri);
		System.out.printf("CIRCULO: %.3f\n", cir);
		System.out.printf("TRAPEZIO: %.3f\n", trap);
		System.out.printf("QUADRADO: %.3f\n", quad);
		System.out.printf("RETANGULO: %.3f\n", ret);
		
		sc.close();

	}

}
