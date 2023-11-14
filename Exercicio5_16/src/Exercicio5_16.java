/* (Gráfico de barras do programa de impressão) Uma aplicação 
 * interessante dos computadores é exibir diagramas e gráficos de barras.
 * Escreva um aplicativo que leia cinco números entre 1 e 30. Para cada
 * número que é lido, seu programa deve exibir o mesmo número de asteriscos 
 * adjacentes. Por exemplo, se seu programa lê o número 7, ele deve exibir *******. 
 * Exiba as barras dos asteriscos depois de ler os cinco números. */

import java.util.Scanner;

public class Exercicio5_16 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int usuario;
		
		for (int contador = 1; contador <= 5; contador++)
		{
			
			System.out.println("Insira um número inteiro de 1 a 30:");
			usuario = input.nextInt();
			
			// valida o input
			while (usuario <= 0 || usuario > 30)
			{
				System.out.println("Entrada inválida");
				System.out.println("Insira um número inteiro de 1 a 30:");
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
