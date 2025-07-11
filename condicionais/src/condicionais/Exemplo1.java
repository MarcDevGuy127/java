package condicionais;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int adicional;
		int mult;
		int valor = 50;
		System.out.println("Digite");
		int minutos = sc.nextInt();
		
		if (minutos == 100) {
			
			System.out.println("Pague " + valor);
			
		} 
		
		if (minutos >= 101){

			adicional = 100 - minutos;
				
			mult = adicional * 2; // a diferenca vale a multiplicacao com 2
			
			valor = mult + valor;
				
			System.out.println("Pague " + valor);
		}
	}

}
