package condicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Lista de exercícios 2
		// Fazer um programa para ler um número inteiro e 
		// dizer se este número é par ou ímpar.  
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int num = sc.nextInt();
		
		if (num % 2 == 0) System.out.println("Par");
		
		if (num % 2 != 0)  System.out.println("Ímpar");
	}

}
