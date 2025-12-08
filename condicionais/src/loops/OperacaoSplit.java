package loops;

public class OperacaoSplit {

	public static void main(String[] args) {
		 String s = "potato apple lemon";
		 String[] vect = s.split(" "); // separando elementos através do " "
		 String word1 = vect[0]; // atribuindo variavel para primeira palavra
		 String word2 = vect[1]; // atribuindo variavel para segunda palavra
		 String word3 = vect[2]; // atribuindo variavel para terceira palavra
		 
		 System.out.println(word1);
		 System.out.println(word2);
		 System.out.println(word3);
	}

}
