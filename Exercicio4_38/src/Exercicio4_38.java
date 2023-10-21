/* Nesse exercício, você investigará um esquema simples para 
 * criptografar e descriptografar dados. Uma empresa que quer 
 * enviar dados pela internet pediu-lhe que escrevesse um programa 
 * que criptografe dados a fim de que eles possam ser transmitidos 
 * com maior segurança. Todos os dados são transmitidos como inteiros 
 * de quatro dígitos. Seu aplicativo deve ler um inteiro de quatro 
 * dígitos inserido pelo usuário e criptografá-lo da seguinte maneira: 
 * substitua cada dígito pelo resultado da adição de 7 ao dígito, 
 * obtendo o restante depois da divisão do novo valor por 10. Troque
 * então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto. 
 * Então, imprima o inteiro criptografado. Escreva um aplicativo separado
 * que receba a entrada de um inteiro de quatro dígitos criptografado e o
 * descriptografe (revertendo o esquema de criptografia) para formar o 
 * número original. */

import java.util.Scanner;

public class Exercicio4_38 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int contador = 0;
		int dado;
		int digitosAlternados = 0;
		int dadoCriptografado = 0;
		
		System.out.print("Insira um inteiro de quatro dígitos: ");
		dado = input.nextInt();
		
		while (dado > 9999 || dado < 1000)
		{
			System.out.println("Input inválido");
			System.out.print("Insira um inteiro de quatro dígitos: ");
			dado = input.nextInt();
		}
		
		// troca o primeiro dígito pelo terceiro
		// e o segundo dígito pelo quarto
		while (contador < 2)
		{
			int resto = dado % 100;
			digitosAlternados = digitosAlternados * 100 + resto;
			dado /= 100;
			++contador;
		}
		
		contador = 0;
		int divisor = 1000;
		
		// adiciona 7 e realiza a operação de módulo
		// por 10 para cada dígito 
		while (contador < 4)
		{
			int digitoUnico;
			digitoUnico = digitosAlternados / divisor;
			digitosAlternados %= divisor;
			dadoCriptografado += ((digitoUnico + 7) % 10) * divisor;
			divisor /= 10;
			++contador;
		}
		
		System.out.print(dadoCriptografado);
		
		input.close();
	}
}