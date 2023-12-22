/* (Programa de impress�o de tri�ngulos modificado) Modifique a Quest�o 5.15 
 * para combinar seu c�digo dos quatro tri�ngulos de asteriscos separados, de 
 * modo que todos os quatro padr�es sejam impressos lado a lado. [Dica: fa�a 
 * uso inteligente de loops for aninhados.] */

public class Exercicio5_22 {

	public static void main(String[] args) {
		for (int contador = 1; contador <= 10; contador++) {
			
			for (int trianguloA = contador; trianguloA > 0; trianguloA--) {
				System.out.print("A*");;
			}
			
			for (int trianguloC = 10 - contador; trianguloC > 0; trianguloC--) {
				System.out.print("C*");
			}
			
			for (int trianguloB = 10 - contador; trianguloB > 0; trianguloB--) {
				System.out.print("B*");
			}
			
			for (int trianguloD = contador; trianguloD > 0; trianguloD--) {
				System.out.print("D*");
			}
			
			System.out.println();
		}
	}
	
}
