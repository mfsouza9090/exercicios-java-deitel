/* (Programa de impress�o de losangos) Escreva um aplicativo que 
 * imprime a seguinte forma de um losango. Voc� pode utilizar 
 * instru��es de sa�da que imprimem um �nico asterisco (*), um �nico 
 * espa�o ou um �nico caractere de nova linha. Maximize sua utiliza��o 
 * de repeti��o (com instru��es for aninhadas) e minimize o n�mero de 
 * instru��es de sa�da */

public class Exercicio5_24 {
	
	public static void main(String[] args) {
		for (int linha = 1; linha <= 9; linha++) {
			System.out.print("l");
			for (int coluna = 1; coluna <= 9; coluna++) {
				System.out.print("c");
			}
			System.out.println();
		}
	}

}
