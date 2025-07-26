package condicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Lista de exercícios 2
		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma 
		// mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os 
		// valores lidos são  múltiplos entre si. Atenção: os números devem 
		// poder ser digitados em ordem crescente ou decrescente.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int a = sc.nextInt();
		
		System.out.println("Digite um outro número inteiro:");
		int b = sc.nextInt();
		
		if (a % b == 0) System.out.println("São múltiplos.");
		
		if (a % b != 0) System.out.println("Não são múltiplos.");
	}

}
