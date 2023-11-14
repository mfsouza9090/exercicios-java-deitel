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
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		
		// como até o capítulo corrente os autores não apresentaram nenhuma
		// estrutura de dados, precisei armazenar cada valor em uma variável
		// diferente a partir de uma instrução de seleção múltipla dentro de um
		// loop for. a lógica de validação de input foi inserida no corpo dos 
		// rótulos case. na primeira intrução switch, usei a instrução continue
		// para saltar p/ a próxima iteração; se usasse a instrução break ou a
		// condição "falling through", o objetivo do exercício (exibir as barras
		// de asteriscos após a entrada de todos os dados) não seria alcançado
		for (int contador = 0; contador < 5; contador++)
		{
			System.out.println("Insira um número inteiro de 1 a 30:");
			switch (contador) {
				case 0:
				num1 = input.nextInt();
				while (num1 < 1 || num1 > 30)
				{
					System.out.println("Entrada inválida");
					System.out.println("Insira um número inteiro de 1 a 30:");
					num1 = input.nextInt();
				}
				continue;
				case 1:
				num2 = input.nextInt();
				while (num2 < 1 || num2 > 30)
				{
					System.out.println("Entrada inválida");
					System.out.println("Insira um número inteiro de 1 a 30:");
					num2 = input.nextInt();
				}
				continue;
				case 2:
				num3 = input.nextInt();
				while (num3 < 1 || num3 > 30)
				{
					System.out.println("Entrada inválida");
					System.out.println("Insira um número inteiro de 1 a 30:");
					num3 = input.nextInt();
				}
				continue;
				case 3:
				num4 = input.nextInt();
				while (num4 < 1 || num4 > 30)
				{
					System.out.println("Entrada inválida");
					System.out.println("Insira um número inteiro de 1 a 30:");
					num4 = input.nextInt();
				}
				continue;
				case 4:
				num5 = input.nextInt();
				while (num5 < 1 || num5 > 30)
				{
					System.out.println("Entrada inválida");
					System.out.println("Insira um número inteiro de 1 a 30:");
					num5 = input.nextInt();
				}
			}
			
			for (int contador2 = 0; contador2 < 5; contador2++)
			{
				switch(contador2) {
				case 0:
					System.out.println();
					while (num1 > 0)
					{
						System.out.print("*");
						num1--;
					}
					System.out.println();
					break;
				case 1:
					while (num2 > 0)
					{
						System.out.print("*");
						num2--;
					}
					System.out.println();
					break;
				case 2:
					while (num3 > 0)
					{
						System.out.print("*");
						num3--;
					}
					System.out.println();
					break;
				case 3:
					while (num4 > 0)
					{
						System.out.print("*");
						num4--;
					}
					System.out.println();
					break;
					case 4:
					while (num5 > 0)
					{
						System.out.print("*");
						num5--;
					}
				}
			}
		}
		
		input.close();
	}
}