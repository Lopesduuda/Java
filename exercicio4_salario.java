package exercInicianta_parte1;
import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int horas = sc.nextInt();
		float valor = sc.nextFloat();
		
		float salario = horas * valor;
		
		System.out.printf("Number: %d\n", num);
		System.out.printf("SALARY: U$ %.2f", salario);
		
		sc.close();

	}

}
