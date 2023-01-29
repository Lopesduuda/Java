package exercInicianta_parte1;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int dif = (A*B) - (C*D);
		System.out.printf("Diferenca = %d", dif);
		
		sc.close();

	}

}
