package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ExemploDebug {

	public static void main(String[] args) {

		//Na classe: Botao direito do mouse -> Debug as -> Run as Java Application
		//ADD BREAKPOINT: Ctrl + Shift + B
		//Switch perspective
		//Para DEBUG confirme switch perspective
		//DEBUG: F6		
		//Para Java canto direito da tela
		
		// Calculo de área
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura, comprimento, metroQuadrado;

		System.out.println("Digite o valor da largura:");
		largura = sc.nextDouble();

		System.out.println("Digite o valor do comprimento:");
		comprimento = sc.nextDouble();

		System.out.println("Digite o valor do metro quadrado:");
		metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		sc.close();
	}

}
