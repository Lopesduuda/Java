package exercInicianta_parte2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		
		int valid1 = A%B;
		int valid2 = B%A;
		
		if (valid1 == 0 || valid2 ==0) {
			System.out.println("são multiplos");
		}else {
			System.out.println("não sao multiplos");
		}
		sc.close();

	}

}
