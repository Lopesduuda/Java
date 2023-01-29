package exercInicianta_parte2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int valid = (char) numero%2;
		
		if(valid > 0) {
			System.out.println("IMPAR");
		}else {
			System.out.println("PAR");
		}
		sc.close();

	}

}
