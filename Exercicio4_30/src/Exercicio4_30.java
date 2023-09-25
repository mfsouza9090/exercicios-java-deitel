/* (Pal�ndromos) Um pal�ndromo � uma sequ�ncia de caracteres que � lida 
 * da esquerda para a direita ou da direita para a esquerda. Por exemplo, 
 * cada um dos seguintes inteiros de cinco d�gitos � um pal�ndromo: 12321, 
 * 55555, 45554 e 11611. Escreva um aplicativo que l� em um inteiro de cinco 
 * d�gitos e determina se ele � ou n�o um pal�ndromo. Se o n�mero n�o for de 
 * cinco d�gitos, exiba uma mensagem de erro e permita que o usu�rio insira 
 * um novo valor. */

import java.util.Scanner;

public class Exercicio4_30 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int inputUsuario = 0;
		int numeroAoContrario = 0;
		int numeroOriginal = 0;
		
		System.out.print("Insira um inteiro de cinco d�gitos: ");
		inputUsuario = input.nextInt();
		
		while (inputUsuario > 99999 || inputUsuario < 10000)
		{
			System.out.print("Insira um inteiro v�lido\n");
			System.out.print("Insira um inteiro de cinco d�gitos: ");
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
			System.out.printf("%d � um pal�ndromo", numeroOriginal);
		else
			System.out.printf("%d n�o � um pal�ndromo", numeroOriginal);
		
		input.close();
	}
}
