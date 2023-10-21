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
		
		int dado;
		int contador = 0;
		int digitosAlternados = 0;
		int dadoCriptografado = 0;
		int multiploDeDez = 1000;
		
		System.out.print("Insira um inteiro de quatro dígitos: ");
		dado = input.nextInt();
		
		while (dado > 9999 || dado < 1000)
		{
			System.out.println("Input inválido");
			System.out.print("Insira um inteiro de quatro dígitos: ");
			dado = input.nextInt();
		}
		
		System.out.println(dado);
		
		while (contador < 4)
		{
			int digitoUnico;
			// isola o primeiro dígito e armazena-o
			// em uma nova variável
			digitoUnico = dado / multiploDeDez;
			// elimina o primeiro dígito da variável original
			// contendo o dado com os dígitos alternados,
			// atualizando-o p/ a próxima iteração
			dado %= multiploDeDez;
			// criptografa o dígito isolado de acordo
			// c/ a proposta do exercício, multiplica-o
			// por 1000, 100, 10 e 1 (nesta ordem, a cada
			// iteração) e acumula o valor na variável final
			dadoCriptografado += ((digitoUnico + 7) % 10) * multiploDeDez;
			multiploDeDez /= 10;
			++contador;
		}
		
		System.out.println(dadoCriptografado);
		
		contador = 0;
		
		// troca o primeiro dígito pelo terceiro
		// e o segundo dígito pelo quarto
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