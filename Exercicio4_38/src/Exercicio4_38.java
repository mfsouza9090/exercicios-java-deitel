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
		int contador = 0;
		int dado;
		int digitosAlternados;
		
		System.out.print("Insira um inteiro de quatro d�gitos: ");
		dado = input.nextInt();
		
		while (dado > 9999 || dado < 1000)
		{
			System.out.println("Input inv�lido");
			System.out.print("Insira um inteiro de quatro d�gitos: ");
			dado = input.nextInt();
		}
		
		// troca o primeiro d�gito pelo terceiro
		// e o segundo d�gito pelo quarto
		while (contador < 2)
		{
			digitosAlternados = dado % 100;
			dado /= 100;
			System.out.println(digitosAlternados);
			++contador;
		}
		
		contador = 0;
		
		/* while (contador < 4)
		{
			int digitoUnico;
			digitoUnico = novoDado / 1000;
			novoDado %= 10;
			System.out.println(digitoUnico);
			System.out.print(novoDado);
			++contador;
		} */
		
		input.close();
	}
}