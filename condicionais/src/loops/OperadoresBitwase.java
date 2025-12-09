package loops;

import java.util.Scanner;

public class OperadoresBitwase {

	public static void main(String[] args) {
		
		// comparacoes com tabela verdade
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2); // E - Apenas V se ambos os lados for V
		System.out.println(n1 | n2); // OU - Apenas V se pelo menos um lado ou ambos for V
		System.out.println(n1 ^ n2); // OU EXCLUSIVO - Apenas V se um lado for V

		// comparando bits
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		
		System.out.println("Digite um valor inteiro:");
		int n = sc.nextInt();
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false");
		}
		sc.close();

	}

}
