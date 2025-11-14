package condicionais;

public class CondicionalTernaria {

	public static void main(String[] args) {
		// condicional ternaria
		double preco = 34.5;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("Preço: R$ %.2f \n", preco);
		System.out.printf("Desconto: R$ %.2f \n", desconto);
		System.out.printf("Total: R$ %.2f \n", preco - desconto);
	}

}
