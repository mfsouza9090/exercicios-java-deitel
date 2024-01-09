/* (Programa de impressão de losangos) Escreva um aplicativo que 
 * imprime a seguinte forma de um losango. Você pode utilizar 
 * instruções de saída que imprimem um único asterisco (*), um único 
 * espaço ou um único caractere de nova linha. Maximize sua utilização 
 * de repetição (com instruções for aninhadas) e minimize o número de 
 * instruções de saída */

public class Exercicio5_24 {
	
	public static void main(String[] args) {
		// quantidade de asteriscos a ser printada;
		// é incrementada em 2 a cada iteração do loop
		// mais externo até a quinta volta; após, é
		// decrementada em 2
		int qtdAsteriscos = 1;
		// referência à coluna a partir da qual os asteriscos
		// devem começar a ser printados; é decrementada em 1
		// a cada iteração do loop mais externo até a quinta
		// volta; após, é incrementada em 1
		int refColuna = 5;
		
		for (int linha = 1; linha <= 9; linha++) {
			for (int coluna = 1; coluna <= 9; coluna++) {
				// verifica se o número da coluna (representado
				// pela variável de controle) é compatível com a
				// variável refColuna, que representa a posição
				// em que os asteriscos devem começar a ser printados
				if (coluna == refColuna) {
					// os asteriscos são printados em sequência
					for (int asterisco = qtdAsteriscos; asterisco > 0; asterisco--) {
						System.out.print("*");
					}
				}
				
				System.out.print(" ");
			}
			
			// a justificativa para essa estrutura consta
			// nos dois primeiros comentários
			if (linha < 5) {
				refColuna--;
				qtdAsteriscos += 2;
			}
			else {
				refColuna++;
				qtdAsteriscos -= 2;
			}
			
			System.out.println();
		}
	}

}
