/* (Padr�o de tabuleiro de damas de asteriscos) Escreva um 
 * aplicativo que utiliza apenas as instru��es de sa�da
 * System.out.print("* ");
 * System.out.print(" ");
 * System.out.println();
 * para exibir o padr�o de tabuleiro de damas a seguir. 
 * Uma chamada de m�todo System.out.println sem arggumentos 
 * faz com que o programa gere sa�da de um �nico caractere de 
 * nova linha. [Dica: as instru��es de repeti��o s�o requeridas.] */

public class Exercicio4_32 {

	public static void main(String[] args) 
	{
		int coluna = 0;
		
		while (coluna < 8)
		{
			int linha = 0;
			
			while (linha < 8)
			{
				if (coluna % 2 == 0)
				{
					System.out.print("* ");
					System.out.print(" ");
				}
				else
				{
					System.out.print(" ");
					System.out.print("* ");
				}
				
				++linha;
			}
			
			++coluna;
			System.out.println();
		}
	}
}
