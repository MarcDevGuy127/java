package condicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Lista de exercícios 2
		// Leia a hora inicial e a hora final de um jogo. A seguir calcule a 
		// duração do jogo, sabendo que o mesmo pode começar em um dia e 
		// terminar em outro, tendo uma duração mínima de 1 hora e máxima de 
		// 24 horas.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial:");
		int a = sc.nextInt();
		
		if(a < 0 && a > 24) System.out.println("Valor inválido!");
		
		System.out.println("Digite a hora final:");
		int b = sc.nextInt();
		
		if(b < 0 && b > 24) System.out.println("Valor inválido!");
		
		if ((a >= 0 && a <= 24)&&(b >= 0 && b <= 24)) {
			int c = b - a;
			
			System.out.printf("Hora Inicial: %d : 00 \n", a);
			System.out.printf("Hora Final: %d : 00 \n", b);
			System.out.printf("O jogo durou %d horas.", c);	
		}
	}

}
