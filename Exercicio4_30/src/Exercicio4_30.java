/* (Palíndromos) Um palíndromo é uma sequência de caracteres que é lida 
 * da esquerda para a direita ou da direita para a esquerda. Por exemplo, 
 * cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321, 
 * 55555, 45554 e 11611. Escreva um aplicativo que lê em um inteiro de cinco 
 * dígitos e determina se ele é ou não um palíndromo. Se o número não for de 
 * cinco dígitos, exiba uma mensagem de erro e permita que o usuário insira 
 * um novo valor. */

import java.util.Scanner;

public class Exercicio4_30 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int inputUsuario = 0;
		int numeroAoContrario = 0;
		int numeroOriginal = 0;
		
		System.out.print("Insira um inteiro de cinco dígitos: ");
		inputUsuario = input.nextInt();
		
		while (inputUsuario > 99999 || inputUsuario < 10000)
		{
			System.out.print("Insira um inteiro válido\n");
			System.out.print("Insira um inteiro de cinco dígitos: ");
			inputUsuario = input.nextInt();
		}
		
		numeroOriginal = inputUsuario;
		
		while (inputUsuario != 0)
		{
			int resto = inputUsuario % 10;
			numeroAoContrario = numeroAoContrario * 10 + resto;
			inputUsuario = inputUsuario / 10;
		}
		
		if (numeroOriginal == numeroAoContrario)
			System.out.printf("%d é um palíndromo", numeroOriginal);
		else
			System.out.printf("%d não é um palíndromo", numeroOriginal);
		
		input.close();
	}
}
