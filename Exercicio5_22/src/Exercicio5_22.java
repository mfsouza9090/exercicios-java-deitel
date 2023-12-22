/* (Programa de impress�o de tri�ngulos modificado) Modifique a Quest�o 5.15 
 * para combinar seu c�digo dos quatro tri�ngulos de asteriscos separados, de 
 * modo que todos os quatro padr�es sejam impressos lado a lado. [Dica: fa�a 
 * uso inteligente de loops for aninhados.] */

public class Exercicio5_22 {

	public static void main(String[] args) {
		for (int contador = 1; contador <= 10; contador++)
		{
			int contadorAux = contador;
			
			while (contadorAux > 0)
			{
				System.out.print("*");
				contadorAux--;
			}
			System.out.println();
		}
		
		System.out.println();
		
		// b)
		for (int contador = 10; contador > 0; contador--)
		{
			int contadorAux = contador;
			
			while (contadorAux > 0)
			{
				System.out.print("*");
				contadorAux--;
			}
			System.out.println();
		}
		
		System.out.println();
		
		// c)
		for (int contador = 10; contador > 0; contador--)
		{
			int asteriscos = contador;
			// o n�mero de espa�os em branco � calculado
			// a partir do contador do loop for externo:
			// 0 na primeira itera��o, 1 na segunda, 2
			// na terceira e assim por diante
			int espacos = 9 - (contador - 1);
			
			while (espacos > 0)
			{
				System.out.print(" ");
				espacos--;
			}
			
			while (asteriscos > 0)
			{
				System.out.print("*");
				asteriscos--;
			}
		
			System.out.println();
		}
		
		System.out.println();
		
		// d)
		for (int contador = 1; contador <= 10; contador++)
		{
			int asteriscos = contador;
			int espacos = 10 - contador;
			
			while (espacos > 0)
			{
				System.out.print(" ");
				espacos--;
			}
			
			while (asteriscos > 0)
			{
				System.out.print("*");
				asteriscos--;
			}
		
			System.out.println();
		}
	}

}
