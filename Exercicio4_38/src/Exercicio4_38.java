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

public class Exercicio4_38 {

	public static void main(String[] args) 
	{
		Menu.menu();
	}
}