package exercInicianta_parte2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double horaI, horaF;
		horaI = sc.nextDouble();
		horaF = sc.nextDouble();
		
		double valid;
		
		if(horaI < horaF) {
		valid = (int) horaF - horaI;
		}else {
			valid = (int) 24 - horaI + horaF;
		}
		System.out.printf("O JOGO DUROU %.0f horas", valid);
		
		sc.close();
		
		}

	}


