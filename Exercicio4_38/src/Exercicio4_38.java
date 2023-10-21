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
		int digitosAlternados;
		
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