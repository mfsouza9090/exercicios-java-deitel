/* (Quadrado de asteriscos) Escreva um aplicativo que solicita ao usu�rio 
 * que insira o tamanho do lado de um quadrado e, ent�o, exibe um quadrado 
 * vazio desse tamanho com asteriscos. Seu programa deve trabalhar com 
 * quadrados de todos os comprimentos de lado poss�veis entre 1 e 20 */

import java.util.Scanner;

public class Exercicio4_29 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int lado = 0;
		int linha = 0;
		
		System.out.print("Insira o tamanho do lado de um quadrado: ");
		lado = input.nextInt();
		
		while (lado < 1 || lado > 20)
		{
			System.out.print("Digite um valor v�lido\n");
			System.out.print("Insira o tamanho do lado de um quadrado: ");
			lado = input.nextInt();
		}
		
		while (linha < lado)
		{
			int coluna = 0;
			
			while (coluna < lado)
			{	
				if (linha == 0 || linha == lado - 1)
				{
					System.out.print("* ");
					++coluna;
				}
				else if (coluna == 0 || coluna == lado - 1)
				{
					System.out.print("* ");
					++coluna;
				}
				else
				{
					System.out.print("  ");
					++coluna;
				}
			}
			System.out.println();
			++linha;
		}
		input.close();
	}
}
