package condicionais;

import java.util.Scanner;

public class Linkedin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose one option (1 - 4):");
		int option = sc.nextInt();
		
		switch (option) {
		case 1 -> System.out.println("Visit: https://portfoliomh-phi.vercel.app/");
		case 2 -> System.out.println("Send: marceloh.github@gmail.com");
		case 3 -> System.out.println("View: github.com/MarcDevGuy127");
		case 4 -> System.out.println("Follow: www.linkedin.com/in/marcelo-henrique-costa-da-silva");
		default -> System.out.println("Let's code!");
		}
	}

}
