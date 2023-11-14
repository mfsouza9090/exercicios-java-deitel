/* (Programa para impressão de triângulos) Escreva um aplicativo que 
 * exibe os seguintes padrões separadamente, um embaixo do outro. 
 * Utilize loops for para gerar os padrões. Todos os asteriscos (*) 
 * devem ser impressos por uma única instrução na forma System.out.print('*'); 
 * o que faz com que os asteriscos sejam impressos lado a lado. Uma 
 * instrução na forma System.out.println(); pode ser utilizada para mover-se
 * para a próxima linha. Uma instrução na forma System.out.print(' ');
 * pode ser utilizada para exibir um espaço para os últimos dois padrões. 
 * Não deve haver outras instruções de saída no programa. [Dica: os dois 
 * últimos padrões requerem que cada linha inicie com um número adequado 
 * de espaços em branco.] */

public class Exercicio5_15 
{
	public static void main(String[] args) 
	{
		// a)
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
	}
}
