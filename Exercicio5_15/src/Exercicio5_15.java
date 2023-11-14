/* (Programa para impress�o de tri�ngulos) Escreva um aplicativo que 
 * exibe os seguintes padr�es separadamente, um embaixo do outro. 
 * Utilize loops for para gerar os padr�es. Todos os asteriscos (*) 
 * devem ser impressos por uma �nica instru��o na forma System.out.print('*'); 
 * o que faz com que os asteriscos sejam impressos lado a lado. Uma 
 * instru��o na forma System.out.println(); pode ser utilizada para mover-se
 * para a pr�xima linha. Uma instru��o na forma System.out.print(' ');
 * pode ser utilizada para exibir um espa�o para os �ltimos dois padr�es. 
 * N�o deve haver outras instru��es de sa�da no programa. [Dica: os dois 
 * �ltimos padr�es requerem que cada linha inicie com um n�mero adequado 
 * de espa�os em branco.] */

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
	}
}
