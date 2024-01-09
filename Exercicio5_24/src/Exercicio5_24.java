/* (Programa de impress�o de losangos) Escreva um aplicativo que 
 * imprime a seguinte forma de um losango. Voc� pode utilizar 
 * instru��es de sa�da que imprimem um �nico asterisco (*), um �nico 
 * espa�o ou um �nico caractere de nova linha. Maximize sua utiliza��o 
 * de repeti��o (com instru��es for aninhadas) e minimize o n�mero de 
 * instru��es de sa�da */

public class Exercicio5_24 {
	
	public static void main(String[] args) {
		// quantidade de asteriscos a ser printada;
		// � incrementada em 2 a cada itera��o do loop
		// mais externo at� a quinta volta; ap�s, �
		// decrementada em 2
		int qtdAsteriscos = 1;
		// refer�ncia � coluna a partir da qual os asteriscos
		// devem come�ar a ser printados; � decrementada em 1
		// a cada itera��o do loop mais externo at� a quinta
		// volta; ap�s, � incrementada em 1
		int refColuna = 5;
		
		for (int linha = 1; linha <= 9; linha++) {
			for (int coluna = 1; coluna <= 9; coluna++) {
				// verifica se o n�mero da coluna (representado
				// pela vari�vel de controle) � compat�vel com a
				// vari�vel refColuna, que representa a posi��o
				// em que os asteriscos devem come�ar a ser printados
				if (coluna == refColuna) {
					// os asteriscos s�o printados em sequ�ncia
					for (int asterisco = qtdAsteriscos; asterisco > 0; asterisco--) {
						System.out.print("*");
					}
				}
				
				System.out.print(" ");
			}
			
			// a justificativa para essa estrutura consta
			// nos dois primeiros coment�rios
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
