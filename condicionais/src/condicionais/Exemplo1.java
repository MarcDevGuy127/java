package condicionais;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int diferenca, adicional = 0;
		int valor = 50;
		
		System.out.println("Digite a quantidade de minutos:"); //interação do usuário
		int minutos = sc.nextInt();
		
		if (minutos < 0) System.out.println("Valor inválido!");
		
		if (minutos < 100) System.out.println("Mínimo 100 minutos");
		
		if (minutos == 100) System.out.println("Valor a pagar: R$ " + valor);
		
		if (minutos > 100) {

			diferenca = minutos - 100; //subtração da qntde de mins com o minimo de 100 mins
			adicional = diferenca * 2; //a diferenca vale a multiplicacao com 2
			valor = valor + adicional;
			
			System.out.println("Valor a pagar: R$ " + valor);
		}
		sc.close();
	}

}
