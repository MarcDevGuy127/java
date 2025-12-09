package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double area1, area2;

		System.out.println("\nTriângulo 1");
		System.out.println("Digite três números:");
		area1 = calcArea(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		System.out.println("\nTriângulo 2");
		System.out.println("Digite três números:");
		area2 = calcArea(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		System.out.printf("\nÁrea do triângulo 1: %.2f\n", area1);
		System.out.printf("Área do triângulo 2: %.2f\n", area2);

		System.out.printf("Maior área: %.2f\n", max(area1, area2));

		sc.close();
	}

	// funcao para calcular area
	public static double calcArea(double a, double b, double c) {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	// funcao para exibir a maior area
	public static double max(double x, double y) {
		return (x > y) ? x : y; // verdadeiro e falso
	}
}
