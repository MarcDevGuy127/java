package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Lista de exercícios 2
		/*
		 * 
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.


Renda				Imposto
0 - 2000 			= Isento
2000.01 - 3000.01 	= 8%
3000.01 - 4500 		= 18%
>4500 				= 28%

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.
		 */
        double salario, imposto;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de seu salário:");
        salario = sc.nextDouble();
        
        if (salario >= 0 && salario <= 2000) {
			imposto = 0;
			System.out.printf("Salário: %d", salario);
			System.out.printf("Imposto: %d", imposto);
		}
        
        if (salario >= 2000.01 && salario <= 3000) {
        	imposto = salario + (salario * 0.8);
			System.out.printf("Salário: %d", salario);
			System.out.printf("Imposto: %d", imposto);
		}
        
        if (salario >= 3000.01 && salario <= 4500) {
        	imposto = salario + (salario * 0.18);
			System.out.printf("Salário: %d", salario);
			System.out.printf("Imposto: %d", imposto);
		}
        
        if (salario > 4500) {
        	imposto = salario + (salario * 0.28);
			System.out.printf("Salário: %d", salario);
			System.out.printf("Imposto: %d", imposto);
		}

        sc.close();
    }
}
