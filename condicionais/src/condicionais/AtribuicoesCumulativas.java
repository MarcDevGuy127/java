package condicionais;

import java.util.Scanner;

public class AtribuicoesCumulativas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int opcao = 0;

		while(opcao != 6) {
			
			System.out.println("Digite o valor de a:");
			int a = sc.nextInt();

			System.out.println("Digite o valor de b:");
			int b = sc.nextInt();

			System.out.println("Agora escolha uma atribuicao que queira testar!");
			System.out.println("1. a += b");
			System.out.println("2. a -= b");
			System.out.println("3. a *= b");
			System.out.println("4. a /= b");
			System.out.println("5. a %= b");
			System.out.println("6. Sair");
			
			opcao = sc.nextInt();

			switch (opcao) {
			case 1 -> System.out.println(a += b);
			case 2 -> System.out.println(a -= b);
			case 3 -> System.out.println(a *= b);
			case 4 -> System.out.println(a /= b);
			case 5 -> System.out.println(a %= b);

			default -> {
					if (opcao < 0 || opcao > 6) {
						System.out.println("Opção inválida!");
					}
				}
			}
		}
	}

}
