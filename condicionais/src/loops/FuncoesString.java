package loops;

public class FuncoesString {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG   ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("Original: -" + original + "-"); // exibindo elementos originais
		System.out.println("toLowerCase: -" + s01 + "-"); // tornando tudo minusculo
		System.out.println("toUpperCase: -" + s02 + "-"); // tornando tudo maiusculo
		System.out.println("trim: -" + s03 + "-"); // eliminando espaco
		System.out.println("substring(2): -" + s04 + "-"); // delimitador de exibição (mostrando tudo eliminado apenas as 2 primeiras letras)
		System.out.println("substring(2, 9): -" + s05 + "-"); // delimitador de exibição (mostrando tudo eliminando as 2 primeiras letras e mostrando até a letra 9)
		System.out.println("replace('a', 'x'): -" + s06 + "-"); // substituindo todos os 'a' por 'x'
		System.out.println("replace('abc', 'xy'): -" + s07 + "-"); // substituindo todos os 'abc' por 'xy'
		System.out.println("Index of 'bc': " + i); // exibindo o primeiro indice que possui 'bc'
		System.out.println("Last index of 'bc': " + j); // exibindo o ultimo indice que possui 'bc'
	}

}
