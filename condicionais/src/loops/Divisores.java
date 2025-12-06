package loops;

import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		// Ler um número inteiro N e calcular todos os seus divisores. 

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n <= 0) System.out.println("Valor inválido, insira um número inteiro positivo!");
		
		for (int i = n; i >= 1; i--) {
			if (n % i == 0) System.out.printf("%d %n", i);
		}
		
		sc.close();
	}

}
