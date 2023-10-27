/* (Crescimento demogr�fico mundial) A popula��o mundial cresceu consideravelmente 
 * ao longo dos s�culos. O crescimento cont�nuo pode, por fim, desafiar os limites 
 * de ar respir�vel, �gua pot�vel, terra f�rtil para agricultura e outros recursos 
 * limitados. H� evid�ncia de que o crescimento tem reduzido a velocidade nos �ltimos 
 * anos e que a popula��o mundial pode chegar ao ponto m�ximo em algum momento nesse 
 * s�culo e, ent�o, come�ar a diminuir.
 * 
 * Para esse exerc�cio, pesquise quest�es de crescimento demogr�fico mundial on-line. 
 * N�o deixe de investigar v�rios pontos de vista. Obtenha estimativas da popula��o 
 * mundial atual e sua taxa de crescimento (a porcentagem pela qual provavelmente 
 * aumentar� neste ano). Escreva um programa que calcule o crescimento demogr�fico 
 * mundial anual dos pr�ximos 75 anos, utilizando a premissa simplificadora de que a 
 * taxa de crescimento atual ficar� constante. Imprima os resultados em uma tabela. 
 * A primeira coluna deve exibir os anos do ano 1 ao ano 75. A segunda coluna deve 
 * exibir a popula��o mundial esperada no fim desse ano. A terceira deve exibir o 
 * aumento num�rico na popula��o mundial que ocorreria nesse ano. Utilizando os seus
 * resultados, determine o ano em que a popula��o dobraria com rela��o ao n�mero de 
 * hoje se a taxa de crescimento do ano atual persistisse. */


// fonte dos dados utilizados no exerc�cio:
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
		System.out.printf("|    Crescimento demogr�fico     |%n");
		System.out.printf("|        anual at� 2098          |%n");
		System.out.printf(" -------------------------------- %n");
		System.out.printf(" --------------------------------%n");
		System.out.printf("| %s  |  %s  |  %s  |%n", "ANO", "POPULA��O", "AUMENTO");
		System.out.printf(" --------------------------------%n");
		
		while (flag != -1)
		{
			double popAnoCorrente;
			double aumentoAno;
			
			popAnoCorrente = popAnoAnterior * taxaCrescimento + popAnoAnterior;
			aumentoAno = popAnoCorrente - popAnoAnterior;
			popAnoAnterior = popAnoCorrente;
			
			// este bloco printa os dados at� 2098, 
			// de acordo c/ a proposta do exerc�cio
			if (anoCorrente <= 2098)
			{
				System.out.printf("| %d | %11.0f | %9.0f |%n", anoCorrente, popAnoCorrente, aumentoAno );
				++anoCorrente;
			}
			// este bloco � executado quando a popula��o dobra
			// em rela��o ao primeiro valor, printando o ano
			// e o n�mero de habitantes
			else if (popAnoCorrente >= populacaoMundial2022 * 2)
			{
				System.out.printf(" --------------------------------%n");
				System.out.printf("\nAno em que a popula��o mundial dobrar� de tamanho: %d, com %11.0f habitantes", 
						anoCorrente, popAnoCorrente);
				
				flag = -1;
			}
		}
	}
}
