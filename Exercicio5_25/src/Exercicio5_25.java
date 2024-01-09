/* (Programa de impressão de losangos modificado) Modifique o aplicativo 
 * que você escreveu na Questão 5.24 para ler um número ímpar no intervalo 
 * 1 a 19 para especificar o número de linhas no losango. Seu programa então 
 * deve exibir um losango do tamanho apropriado. */

import java.util.Scanner;

public class Exercicio5_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int resposta;
		
		System.out.print("Insira um número ímpar no intervalo de 1 a 19: ");
		resposta = input.nextInt();
		
		// valida o número inserido pelo usuário
		while (resposta % 2 == 0) {
			System.out.println("Input inválido");
			System.out.print("Insira um número ímpar no intervalo de 1 a 19: ");
			resposta = input.nextInt();
		}
		
		// quantidade de asteriscos a ser printada;
		// é incrementada em 2 a cada iteração do loop
		// mais externo até alcançar a metade do losango; 
		// após, é decrementada em 2
		int qtdAsteriscos = 1;
		
		// determina a coluna central do losango
		int refInicial = resposta / 2 + 1;
		
		// referência à coluna a partir da qual os asteriscos
		// devem começar a ser printados; é decrementada em 1
		// a cada iteração do loop mais externo até alcançar
		// a metade do losango; após, é incrementada em 1
		int refColuna = refInicial;
				
		for (int linha = 1; linha <= resposta; linha++) {
				for (int coluna = 1; coluna <= resposta; coluna++) {
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
