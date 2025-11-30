package loops;

import java.util.Scanner;

public class For_Exemplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de loops: ");
		int n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
		}
		
		System.out.println("Acabou a contagem!");
		
		sc.close();
	}

}
