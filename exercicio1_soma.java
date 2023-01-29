package exercInicianta_parte1;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y;
		int resultado;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		resultado = x + y;
		System.out.printf("Resultado: %d\n", resultado);
		
		sc.close();

	}

}
