package loops;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
	// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de 
	// N = N * (N-1) * (N-2) * (N-3) * ... * 1. 
	// Lembrando que, por definição, fatorial de 0 é 1. 

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long fatorial = 1;
				
		for (int i = n; i >= 1; i--) {
			
			fatorial *= i;
			
			System.out.printf("%d - %d %n", i, fatorial);
			
		}
		
		System.out.printf("Resultado: %d %n", fatorial);
		
		sc.close();
	}

}
