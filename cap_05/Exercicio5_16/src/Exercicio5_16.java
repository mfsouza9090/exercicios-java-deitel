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
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		
		// como at� o cap�tulo corrente os autores n�o apresentaram nenhuma
		// estrutura de dados, precisei armazenar cada valor em uma vari�vel
		// diferente a partir de uma instru��o de sele��o m�ltipla dentro de um
		// loop for. a l�gica de valida��o de input foi inserida no corpo dos 
		// r�tulos case. na primeira intru��o switch, usei a instru��o continue
		// para saltar p/ a pr�xima itera��o; se usasse a instru��o break ou a
		// condi��o "falling through", o objetivo do exerc�cio (exibir as barras
		// de asteriscos ap�s a entrada de todos os dados) n�o seria alcan�ado
		for (int contador = 0; contador < 5; contador++)
		{
			System.out.println("Insira um n�mero inteiro de 1 a 30:");
			switch (contador) {
				case 0:
				num1 = input.nextInt();
				while (num1 < 1 || num1 > 30)
				{
					System.out.println("Entrada inv�lida");
					System.out.println("Insira um n�mero inteiro de 1 a 30:");
					num1 = input.nextInt();
				}
				continue;
				case 1:
				num2 = input.nextInt();
				while (num2 < 1 || num2 > 30)
				{
					System.out.println("Entrada inv�lida");
					System.out.println("Insira um n�mero inteiro de 1 a 30:");
					num2 = input.nextInt();
				}
				continue;
				case 2:
				num3 = input.nextInt();
				while (num3 < 1 || num3 > 30)
				{
					System.out.println("Entrada inv�lida");
					System.out.println("Insira um n�mero inteiro de 1 a 30:");
					num3 = input.nextInt();
				}
				continue;
				case 3:
				num4 = input.nextInt();
				while (num4 < 1 || num4 > 30)
				{
					System.out.println("Entrada inv�lida");
					System.out.println("Insira um n�mero inteiro de 1 a 30:");
					num4 = input.nextInt();
				}
				continue;
				case 4:
				num5 = input.nextInt();
				while (num5 < 1 || num5 > 30)
				{
					System.out.println("Entrada inv�lida");
					System.out.println("Insira um n�mero inteiro de 1 a 30:");
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