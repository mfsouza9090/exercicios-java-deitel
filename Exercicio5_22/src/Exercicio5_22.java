/* (Programa de impress�o de tri�ngulos modificado) Modifique a Quest�o 5.15 
 * para combinar seu c�digo dos quatro tri�ngulos de asteriscos separados, de 
 * modo que todos os quatro padr�es sejam impressos lado a lado. [Dica: fa�a 
 * uso inteligente de loops for aninhados.] */

public class Exercicio5_22 {

	public static void main(String[] args) {
		for (int contador = 1; contador <= 10; contador++)
		{
			int asteriscos = contador;
			
			while (asteriscos > 0)
			{
				System.out.print("*");
				asteriscos--;
			}
			
			for (int contador1 = 10; contador1 > 0; contador1--) {
				int asteriscos1 = contador1;
				int espacos1 = 9 - (contador1 - 1);
				
				while (espacos1 > 0) {
					System.out.print(" ");
					espacos1--;
				}
				
				while (asteriscos1 > 0) {
					System.out.print("*");
					asteriscos1--;
				}
				System.out.println();
			}
		}
		
		
	}

}
