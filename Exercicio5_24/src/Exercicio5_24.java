/* (Programa de impressão de losangos) Escreva um aplicativo que 
 * imprime a seguinte forma de um losango. Você pode utilizar 
 * instruções de saída que imprimem um único asterisco (*), um único 
 * espaço ou um único caractere de nova linha. Maximize sua utilização 
 * de repetição (com instruções for aninhadas) e minimize o número de 
 * instruções de saída */

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
