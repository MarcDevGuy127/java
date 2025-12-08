package loops;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US); 
		String opcao;

		double celsius = 0, fahrenheit = 0;
		
		System.out.println("Bem-vindo ao conversor de temperatura °C -> °F!");
		System.out.println("Deseja iniciar? (s/n):");
		opcao = sc.next();
		
		do {
			System.out.println("Digite temperatura em °C:");
			celsius = sc.nextDouble();
			
			fahrenheit = (9 * celsius / 5) + 32;
			
			System.out.printf("%.1f °F %n", fahrenheit);
			
			System.out.println("Deseja prosseguir? (s/n):");
			opcao = sc.next();
			
		} while (opcao == "s");
		
		System.out.println("Programa encerrado!");
		sc.close();
	}

}
