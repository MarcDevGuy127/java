package condicionais;

public class ExpressoesComparativas {

	public static void main(String[] args) {
		
		int x = 5;
		
		if (x < 10) {
			System.out.printf("%d é menor que 10.\n", x);
		}
		if (x > 10) {
			System.out.printf("%d é maior que 10.\n", x);
		}
		if (x >= 10) {
			System.out.printf("%d é maior ou igual a 10.\n", x);
		}
		if (x <= 10) {
			System.out.printf("%d é menor ou igual a 10.\n", x);
		}
		if (x == 10) {
			System.out.printf("%d é igual a 10.\n", x);
		}
		if (x != 10) {
			System.out.printf("%d é diferente de 10.\n", x);
		}
	}

}
