package condicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Lista de exercícios 2
		// Com base na tabela abaixo, escreva um programa que leia o
		// código de um item e a quantidade deste item. A seguir, 
		// calcule e mostre o valor da conta a pagar. 
		/*_________CARDAPIO___________
		 *  CODIGO ESPECIFICACAO PRECO
		 * 1		Hot Dog		R$4.00
		 * 2		X Salad		R$4.50
		 * 3		X Bacon		R$5.00
		 * 4		Torrada		R$2.00
		 * 5		Refri		R$1.50
		 * */
		
        double refeicaoA = 0, refeicaoB = 0, total;
        int cardapioA, cardapioB;

        Scanner sc = new Scanner(System.in);

        System.out.println("_________CARDÁPIO___________");
        System.out.println(" CODIGO ESPECIFICACAO PRECO ");
        System.out.println(" 1      Hot Dog       R$4.00");
        System.out.println(" 2      X Salad       R$4.50");
        System.out.println(" 3      X Bacon       R$5.00");
        System.out.println(" 4      Torrada       R$2.00");
        System.out.println(" 5      Refri         R$1.50");

        System.out.println("Digite uma opção:");
        cardapioA = sc.nextInt();

        switch (cardapioA) {
            case 1 -> refeicaoA = 4.00;
            case 2 -> refeicaoA = 4.50;
            case 3 -> refeicaoA = 5.00;
            case 4 -> refeicaoA = 2.00;
            case 5 -> refeicaoA = 1.50;
            default -> System.out.println("Valor inválido!");
        }

        System.out.println("Digite outra opção:");
        cardapioB = sc.nextInt();

        switch (cardapioB) {
            case 1 -> refeicaoB = 4.00;
            case 2 -> refeicaoB = 4.50;
            case 3 -> refeicaoB = 5.00;
            case 4 -> refeicaoB = 2.00;
            case 5 -> refeicaoB = 1.50;
            default -> System.out.println("Valor inválido!");
        }

        total = refeicaoA + refeicaoB;

        System.out.printf("TOTAL A PAGAR: R$%.2f\n", total);
        sc.close();
    }
}
