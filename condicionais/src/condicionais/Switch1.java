package condicionais;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int diaSemana = 0;
		
		while(diaSemana != 8) {
			System.out.println("Digite um valor(1 a 7):");
			System.out.println("8 - Sair");
			
			diaSemana = sc.nextInt();
			
			switch (diaSemana) {
				case 1 -> System.out.println("Segunda-feira");
				case 2 -> System.out.println("Terça-feira");
				case 3 -> System.out.println("Quarta-feira");
				case 4 -> System.out.println("Quinta-feira");
				case 5 -> System.out.println("Sexta-feira");
				case 6 -> System.out.println("Sábado");
				case 7 -> System.out.println("Domingo");
				default -> {
					if (diaSemana <= 0 || diaSemana > 8) {
						System.out.println("Valor inválido!");
					}
				}
			}
		}
	}

}
