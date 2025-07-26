package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Lista de exercícios 2
		// Você deve fazer um programa que leia um valor qualquer e apresente
		// uma mensagem dizendo em qual dos seguintes intervalos
		// ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
		// Obviamente se o valor não estiver em	nenhum destes intervalos,
		// deverá ser impressa a mensagem “Fora de intervalo”.
        double x, y;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor do Eixo X:");
        x = sc.nextDouble();
        
        System.out.println("Digite um valor do Eixo Y:");
        y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Ponto de Origem");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else {
            System.out.println("Valor inválido!");
        }

        sc.close();
    }
}
