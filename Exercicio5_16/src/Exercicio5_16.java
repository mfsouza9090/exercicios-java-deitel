/* (Gr�fico de barras do programa de impress�o) Uma aplica��o 
 * interessante dos computadores � exibir diagramas e gr�ficos de barras.
 * Escreva um aplicativo que leia cinco n�meros entre 1 e 30. Para cada
 * n�mero que � lido, seu programa deve exibir o mesmo n�mero de asteriscos 
 * adjacentes. Por exemplo, se seu programa l� o n�mero 7, ele deve exibir *******. 
 * Exiba as barras dos asteriscos depois de ler os cinco n�meros. */

import java.util.Scanner;

public class Exercicio5_16 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int usuario;
		
		for (int contador = 1; contador <= 5; contador++)
		{
			
			System.out.println("Insira um n�mero inteiro de 1 a 30:");
			usuario = input.nextInt();
			
			// valida o input
			while (usuario <= 0 || usuario > 30)
			{
				System.out.println("Entrada inv�lida");
				System.out.println("Insira um n�mero inteiro de 1 a 30:");
				usuario = input.nextInt();
			}
			
			while (usuario > 0)
			{
				System.out.print("*");
				usuario--;
			}
			
			System.out.println();
		}
		
		input.close();
	}
}
