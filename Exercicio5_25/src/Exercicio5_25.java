/* (Programa de impress�o de losangos modificado) Modifique o aplicativo 
 * que voc� escreveu na Quest�o 5.24 para ler um n�mero �mpar no intervalo 
 * 1 a 19 para especificar o n�mero de linhas no losango. Seu programa ent�o 
 * deve exibir um losango do tamanho apropriado. */

import java.util.Scanner;

public class Exercicio5_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int resposta;
		
		System.out.print("Insira um n�mero �mpar no intervalo de 1 a 19: ");
		resposta = input.nextInt();
		
		// valida o n�mero inserido pelo usu�rio
		while (resposta % 2 == 0) {
			System.out.println("Input inv�lido");
			System.out.print("Insira um n�mero �mpar no intervalo de 1 a 19: ");
			resposta = input.nextInt();
		}
		
		// quantidade de asteriscos a ser printada;
		// � incrementada em 2 a cada itera��o do loop
		// mais externo at� alcan�ar a metade do losango; 
		// ap�s, � decrementada em 2
		int qtdAsteriscos = 1;
		
		// determina a coluna central do losango
		int refInicial = resposta / 2 + 1;
		
		// refer�ncia � coluna a partir da qual os asteriscos
		// devem come�ar a ser printados; � decrementada em 1
		// a cada itera��o do loop mais externo at� alcan�ar
		// a metade do losango; ap�s, � incrementada em 1
		int refColuna = refInicial;
				
		for (int linha = 1; linha <= resposta; linha++) {
				for (int coluna = 1; coluna <= resposta; coluna++) {
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
				if (linha < refInicial) {
					refColuna--;
					qtdAsteriscos += 2;
				}
				else {
					refColuna++;
					qtdAsteriscos -= 2;
				}
					
				System.out.println();
			}
		
			input.close();
		}

}
