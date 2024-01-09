/* (Leis de De Morgan) Neste capítulo, discutimos os operadores lógicos &&, &, ||, |, ^ e !. 
 * As leis de De Morgan às vezes podem tornar mais convenientes para expressar uma expressão 
 * lógica. Essas leis afirmam que a expressão !(condição1 && condição2) é logicamente equivalente 
 * à expressão(!condição1 || !condição2). Além disso, a expressão !(condição1 || condição2) é 
 * logicamente equivalente à expressão (!condição1&& !condição2). Utilize as leis de De Morgan  
 * para escrever expressões equivalentes para cada uma das expressões a seguir, então escreva 
 * um aplicativo para mostrar que tanto a expressão original como a nova expressão em cada caso 
 * produzem o mesmo valor: 
 * a) !(x < 5) && !(y >= 7) 
 * b) !(a == b) || !(g != 5) 
 * c) !((x <= 8) && (y > 4)) 
 * d) !((i > 4) || (j <= 6)) */

public class Exercicio5_23 {

	public static void main(String[] args) {
		// a) !(x < 5) && !(y >= 7)
		int x = 4;
		int y = 7;
		boolean aExpOriginal = !(x < 5) && !(y >= 7);
		boolean aLeiMorgan = !(x < 5) || !(y >= 7);
		
		System.out.printf("Expressão original: !(x < 5) && !(y >= 7) = %b%n"
				        + "Aplicação da Lei de Morgan: !(x < 5) || !(y >= 7) = %b%n", aExpOriginal, aLeiMorgan);
		System.out.println();
		
		// b) !(a == b) || !(g != 5)
		int a = 5;
		int b = 5;
		int g = 6;
		boolean bExpOriginal = !(a == b) || !(g != 5);
		boolean bLeiMorgan = !(a == b) && !(g != 5);
		
		System.out.printf("Expressão original: !(a == b) || !(g != 5) = %b%n"
				        + "Aplicação da Lei de Morgan: !(a == b) && !(g != 5) = %b%n", bExpOriginal, bLeiMorgan);
		System.out.println();
		
		// c) !((x <= 8) && (y > 4))
		boolean cExpOriginal = !((x <= 8) && (y > 4));
		boolean cLeiMorgan = !((x <= 8) || (y > 4));
		
		System.out.printf("Expressão original: !((x <= 8) && (y > 4)) = %b%n"
				        + "Aplicação da Lei de Morgan: !((x <= 8) || (y > 4)) = %b", cExpOriginal, cLeiMorgan);
		System.out.println();
	}

}
