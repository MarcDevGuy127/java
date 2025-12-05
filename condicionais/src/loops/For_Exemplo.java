package loops;

import java.util.Scanner;

public class For_Exemplo {

	public static void main(String[] args) {

		// O primeiro valor digitado é a quantidade de números que serão somados
		// Os valores digitados posteriores compõem a soma total
		Scanner sc = new Scanner(System.in);
				
		int soma = 0;
		int n = sc.nextInt();	
		
		for (int i = 0; i < n; i++) {
			
			int x = sc.nextInt();
			
			soma += x;
		}
		
		System.out.printf("Soma total: %d", soma);
		
		sc.close();
	}

}
