package condicionais;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int restante = 0;
		int adicional = 0;
		int valor = 50;
		
		System.out.println("Digite a quantidade de minutos:"); //interação do usuário
		int minutos = sc.nextInt();
		
		
		if (minutos < 100) System.out.println("Mínimo 100 minutos");
		
		if (minutos == 100) {
			
			System.out.println("Minutos: " + minutos);
			System.out.println("Pague: " + valor);
		} 
		
		if (minutos > 100){

			//subtração da qntde de mins com o valor minimo de 100 mins
			restante = minutos - 100;
			
			adicional = restante * 2; //a diferenca vale a multiplicacao com 2
			valor = valor + adicional;
			
			System.out.println("Minutos: " + minutos);
			System.out.println("Adicional: " + adicional);
			System.out.println("Pague: " + valor);
		}
	}

}
