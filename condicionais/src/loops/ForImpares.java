package loops;

import java.util.Scanner;

public class ForImpares {

	public static void main(String[] args) {
		
		// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
		// X, se for o caso. 
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x >= 1 && x <= 1000) {
			
			// += 2 foi usado ao invés de i++ para diminuir a quantidade
			// de calculos e melhorar a performance
			for (int i = 1; i <= x; i += 2) {
		
				if (i % 2 != 0) System.out.printf("%d \n", i);
		
			}
		} else {
			System.out.println("Valor inválido!");
		};
		
		System.out.println("Execução finalizada!");
		
		sc.close();
	}

}
