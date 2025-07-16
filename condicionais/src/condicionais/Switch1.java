package condicionais;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor(1 a 7):");
		int diaSemana = sc.nextInt();
		
		switch (diaSemana) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terça-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			if (diaSemana <= 0 || diaSemana > 7) {
				System.out.println("Valor inválido!");
			}
			break;
		}
	}

}
