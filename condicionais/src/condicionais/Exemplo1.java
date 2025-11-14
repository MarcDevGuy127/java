package condicionais;

import java.util.Locale;
import java.util.Scanner;

//Uma operadora de telefonia cobra R$50.00 por um plano básico que
//dá direito a 100 minutos de telefone. Cada minuto que exceder a
//franquia de 100 minutos custa R$2.00.Fazer um programa para ler a
//quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
//a ser pago.

public class Exemplo1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de minutos:");
		int minutos = sc.nextInt();
		
		double plano = 50.0;
		
		if (minutos < 0) System.out.println("Valor inválido!");
		
		if (minutos < 100) System.out.printf("Valor a pagar: R$ %.2f%n", plano);
		
		if (minutos == 100) System.out.printf("Valor a pagar: R$ %.2f%n", plano);
		
		if (minutos > 100)
		{	
			plano += (minutos - 100) * 2.0;
			
			System.out.printf("Valor a pagar: R$ %.2f", plano);	
		}
		
		sc.close();
	}

}
