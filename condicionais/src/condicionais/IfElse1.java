package condicionais;

public class IfElse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 9;
		
		if (x < 10 && !(y > 10)) {
			System.out.println(x + " é menor que 10");
			System.out.println(y + " não é maior que 10");
		} else {
			if (x == 10) {
				System.out.println(x + " é igual 10");
			} else {
				if (y == 20 || x == 10) {
					System.out.println(y + " está entre 10 e 20");
				} else {
					System.out.println(x + " vale 10");
				}
			}

		}
	}

}
