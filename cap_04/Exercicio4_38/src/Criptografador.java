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
			// isola o primeiro dígito e armazena-o
			// em uma nova variável
			digitoUnico = dadoOriginal / multiploDeDez;
			// elimina o primeiro dígito da variável original
			// atualizando-o p/ a próxima iteração
			dadoOriginal %= multiploDeDez;
			// criptografa o dígito isolado de acordo
			// c/ a proposta do exercício, multiplica-o
			// por 1000, 100, 10 e 1 (nesta ordem, a cada
			// iteração) e acumula o valor na variável final
			dadoCriptografado += ((digitoUnico + 7) % 10) * multiploDeDez;
			multiploDeDez /= 10;
			++contador;  
		}
		
		contador = 0;
		
		// na primeira iteração, os dois dígitos à direita
		// são isolados a partir de uma operação módulo e o resultado
		// é armazenado na variável digitosAlternados. na segunda 
		// iteração, o valor de digitosAlternados é multiplicado por 100
		// (originando um inteiro de quatro dígitos) e somado aos dois dígitos
		// restantes, produzindo o dado criptografado com as posições alteradas
		// conforme a proposta do exercício
		while (contador < 2)
		{
			int resto = dadoCriptografado % 100;
			digitosAlternados = digitosAlternados * 100 + resto;
			dadoCriptografado /= 100;
			++contador;
		}
		
		// se a variável digitosAlternados tiver 3 dígitos,
		// significa que o primeiro dígito à esquerda era 0 e não foi
		// preservado; a instrução if abaixo garante que o 0
		// esteja lá
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