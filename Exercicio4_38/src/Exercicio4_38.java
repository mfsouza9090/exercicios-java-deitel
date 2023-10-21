/* Nesse exerc�cio, voc� investigar� um esquema simples para 
 * criptografar e descriptografar dados. Uma empresa que quer 
 * enviar dados pela internet pediu-lhe que escrevesse um programa 
 * que criptografe dados a fim de que eles possam ser transmitidos 
 * com maior seguran�a. Todos os dados s�o transmitidos como inteiros 
 * de quatro d�gitos. Seu aplicativo deve ler um inteiro de quatro 
 * d�gitos inserido pelo usu�rio e criptograf�-lo da seguinte maneira: 
 * substitua cada d�gito pelo resultado da adi��o de 7 ao d�gito, 
 * obtendo o restante depois da divis�o do novo valor por 10. Troque
 * ent�o o primeiro d�gito pelo terceiro e o segundo d�gito pelo quarto. 
 * Ent�o, imprima o inteiro criptografado. Escreva um aplicativo separado
 * que receba a entrada de um inteiro de quatro d�gitos criptografado e o
 * descriptografe (revertendo o esquema de criptografia) para formar o 
 * n�mero original. */

import java.util.Scanner;

public class Exercicio4_38 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int dado;
		int contador = 0;
		int digitosAlternados = 0;
		int dadoCriptografado = 0;
		int multiploDeDez = 1000;
		
		System.out.print("Insira um inteiro de quatro d�gitos: ");
		dado = input.nextInt();
		
		while (dado > 9999 || dado < 1000)
		{
			System.out.println("Input inv�lido");
			System.out.print("Insira um inteiro de quatro d�gitos: ");
			dado = input.nextInt();
		}
		
		System.out.println(dado);
		
		while (contador < 4)
		{
			int digitoUnico;
			// isola o primeiro d�gito e armazena-o
			// em uma nova vari�vel
			digitoUnico = dado / multiploDeDez;
			// elimina o primeiro d�gito da vari�vel original
			// contendo o dado com os d�gitos alternados,
			// atualizando-o p/ a pr�xima itera��o
			dado %= multiploDeDez;
			// criptografa o d�gito isolado de acordo
			// c/ a proposta do exerc�cio, multiplica-o
			// por 1000, 100, 10 e 1 (nesta ordem, a cada
			// itera��o) e acumula o valor na vari�vel final
			dadoCriptografado += ((digitoUnico + 7) % 10) * multiploDeDez;
			multiploDeDez /= 10;
			++contador;
		}
		
		System.out.println(dadoCriptografado);
		
		contador = 0;
		
		// troca o primeiro d�gito pelo terceiro
		// e o segundo d�gito pelo quarto
		while (contador < 2)
		{
			int resto = dadoCriptografado % 100;
			digitosAlternados = digitosAlternados * 100 + resto;
			dadoCriptografado /= 100;
			++contador;
		}
		
		System.out.print(digitosAlternados);

		input.close();
	}
}