/* (Crescimento demográfico mundial) A população mundial cresceu consideravelmente 
 * ao longo dos séculos. O crescimento contínuo pode, por fim, desafiar os limites 
 * de ar respirável, água potável, terra fértil para agricultura e outros recursos 
 * limitados. Há evidência de que o crescimento tem reduzido a velocidade nos últimos 
 * anos e que a população mundial pode chegar ao ponto máximo em algum momento nesse 
 * século e, então, começar a diminuir.
 * 
 * Para esse exercício, pesquise questões de crescimento demográfico mundial on-line. 
 * Não deixe de investigar vários pontos de vista. Obtenha estimativas da população 
 * mundial atual e sua taxa de crescimento (a porcentagem pela qual provavelmente 
 * aumentará neste ano). Escreva um programa que calcule o crescimento demográfico 
 * mundial anual dos próximos 75 anos, utilizando a premissa simplificadora de que a 
 * taxa de crescimento atual ficará constante. Imprima os resultados em uma tabela. 
 * A primeira coluna deve exibir os anos do ano 1 ao ano 75. A segunda coluna deve 
 * exibir a população mundial esperada no fim desse ano. A terceira deve exibir o 
 * aumento numérico na população mundial que ocorreria nesse ano. Utilizando os seus
 * resultados, determine o ano em que a população dobraria com relação ao número de 
 * hoje se a taxa de crescimento do ano atual persistisse. */


// fonte dos dados utilizados no exercício:
// https://www.dadosmundiais.com/crescimento-populacao.php
public class Exercicio4_39 
{
	public static void main(String[] args) 
	{
		long populacaoMundial2022 = 7951000000L;
		double popAnoAnterior = populacaoMundial2022;
		double taxaCrescimento = 0.008;
		int anoCorrente = 2023;
		int flag = 1;
		
		System.out.printf(" -------------------------------- %n");
		System.out.printf("|    Crescimento demográfico     |%n");
		System.out.printf("|        anual até 2098          |%n");
		System.out.printf(" -------------------------------- %n");
		System.out.printf(" --------------------------------%n");
		System.out.printf("| %s  |  %s  |  %s  |%n", "ANO", "POPULAÇÃO", "AUMENTO");
		System.out.printf(" --------------------------------%n");
		
		while (flag != -1)
		{
			double popAnoCorrente;
			double aumentoAno;
			
			popAnoCorrente = popAnoAnterior * taxaCrescimento + popAnoAnterior;
			aumentoAno = popAnoCorrente - popAnoAnterior;
			popAnoAnterior = popAnoCorrente;
			
			// este bloco printa os dados até 2098, 
			// de acordo c/ a proposta do exercício
			if (anoCorrente <= 2098)
			{
				System.out.printf("| %d | %11.0f | %9.0f |%n", anoCorrente, popAnoCorrente, aumentoAno );
				++anoCorrente;
			}
			// este bloco é executado quando a população dobra
			// em relação ao primeiro valor, printando o ano
			// e o número de habitantes
			else if (popAnoCorrente >= populacaoMundial2022 * 2)
			{
				System.out.printf(" --------------------------------%n");
				System.out.printf("\nAno em que a população mundial dobrará de tamanho: %d, com %11.0f habitantes", 
						anoCorrente, popAnoCorrente);
				
				flag = -1;
			}
		}
	}
}
