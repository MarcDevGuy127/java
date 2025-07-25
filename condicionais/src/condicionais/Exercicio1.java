package condicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Lista de exercícios 2
		// Fazer um programa para ler um número inteiro, e depois 
		// dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int num = sc.nextInt();
		
		if (num >= 0) System.out.println("Não Negativo");
		
		if (num < 0)  System.out.println("Negativo");
	}

}
