package loops;

import java.util.Scanner;

public class Expoentes {

	public static void main(String[] args) {
	// Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar 
	// na tela N linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, 
	// depois o quadrado e o cubo do valor, conforme  exemplo. 

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n <= 0) System.out.println("Valor inválido, insira um número inteiro positivo!");
		
		for (int i = n; i >= 1; i--) {
			int aoQuadrado = i * i;
			int aoCubo = i * i * i;
			
			System.out.printf("%d %d %d \n", i, aoQuadrado, aoCubo);
		}
		sc.close();
		
	}

}
