/* (Programa de impressão de triângulos modificado) Modifique a Questão 5.15 
 * para combinar seu código dos quatro triângulos de asteriscos separados, de 
 * modo que todos os quatro padrões sejam impressos lado a lado. [Dica: faça 
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
			// o número de espaços em branco é calculado
			// a partir do contador do loop for externo:
			// 0 na primeira iteração, 1 na segunda, 2
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
