/* Escreva um aplicativo que insere um n�mero inteiro que cont�m somente 0s e 1s 
 * (isto �, um n�mero inteiro bin�rio) e imprime seu equivalente decimal. [Dica: 
 * utilize os operadores de resto e divis�o para pegar os d�gitos do n�mero bin�rio 
 * um de cada vez da direita para a esquerda. No sistema de n�meros decimais, o 
 * d�gito mais � direita tem um valor posicional de 1 e o pr�ximo d�gito � esquerda um
 *  valor posicional de 10, depois 100, depois 1.000 e assim por diante. O n�mero 
 *  decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100. No sistema de 
 *  n�mero bin�rio, o d�gito mais � direita tem um valor posicional de 1, o pr�ximo 
 *  d�gito � esquerda um valor posicional de 2, depois 4, depois 8 e assim por diante. 
 *  O equivalente decimal do bin�rio 1.101 � 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 
 *  ou 13.] */

public class Exercicio4_31 
{
	public static void main(String[] args) 
	{
		int binarioOriginal = 10101001;
		int fator = 1;
		int decimal = 0;
		
		while (binarioOriginal != 0)
		{
			int resto = binarioOriginal % 10;
			binarioOriginal = binarioOriginal / 10;
			decimal += resto * fator;
			fator *= 2;
		}
		
		System.out.printf("N�mero bin�rio convertido em decimal: %d", decimal);
	}
}
