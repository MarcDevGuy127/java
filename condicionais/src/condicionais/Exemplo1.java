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
		
		int minutos = sc.nextInt();
		
		double plano = 50.0;
		if (minutos > 100) plano += (minutos - 100) * 2.0;
		
		System.out.printf("Valor da conta: R$ %.2f%n", plano);
		
		sc.close();
	}

}
