package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class RaizQuadrada {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextInt();
		
		double resultado = Math.sqrt(num); // utilizando funcao raiz quadrada
		
		System.out.printf("Resultado: %.1f", resultado);
		
		sc.close();
	}

}
