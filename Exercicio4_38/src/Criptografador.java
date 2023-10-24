public class Criptografador 
{
	public static void criptografador (int dado)
	{
		int dadoOriginal = dado;
		int contador = 0;
		int digitosAlternados = 0;
		int dadoCriptografado = 0;
		int multiploDeDez = 1000;
		
		while (contador < 4)
		{
			int digitoUnico;
			// isola o primeiro d�gito e armazena-o
			// em uma nova vari�vel
			digitoUnico = dadoOriginal / multiploDeDez;
			// elimina o primeiro d�gito da vari�vel original
			// atualizando-o p/ a pr�xima itera��o
			dadoOriginal %= multiploDeDez;
			// criptografa o d�gito isolado de acordo
			// c/ a proposta do exerc�cio, multiplica-o
			// por 1000, 100, 10 e 1 (nesta ordem, a cada
			// itera��o) e acumula o valor na vari�vel final
			dadoCriptografado += ((digitoUnico + 7) % 10) * multiploDeDez;
			multiploDeDez /= 10;
			++contador;  
		}
		
		contador = 0;
		
		// na primeira itera��o, os dois d�gitos � direita
		// s�o isolados a partir de uma opera��o m�dulo e o resultado
		// � armazenado na vari�vel digitosAlternados. na segunda 
		// itera��o, o valor de digitosAlternados � multiplicado por 100
		// (originando um inteiro de quatro d�gitos) e somado aos dois d�gitos
		// restantes, produzindo o dado criptografado com as posi��es alteradas
		// conforme a proposta do exerc�cio
		while (contador < 2)
		{
			int resto = dadoCriptografado % 100;
			digitosAlternados = digitosAlternados * 100 + resto;
			dadoCriptografado /= 100;
			++contador;
		}
		
		// se a vari�vel digitosAlternados tiver 3 d�gitos,
		// significa que o primeiro d�gito � esquerda era 0 e n�o foi
		// preservado; a instru��o if abaixo garante que o 0
		// esteja l�
		if (digitosAlternados < 1000)
		{
			System.out.printf("Dado criptografado: %04d%n", digitosAlternados);
		}
		else
		{
			System.out.printf("Dado criptografado: %d%n", digitosAlternados);
		}
	}
}