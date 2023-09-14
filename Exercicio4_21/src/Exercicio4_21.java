/* (Localize o maior n�mero) O processo de localizar o maior valor � muito utilizado 
 * em aplicativos de computador. Por exemplo, um programa que determina o vencedor de 
 * uma competi��o de vendas inseriria o n�mero de unidades vendidas por cada vendedor. 
 * O vendedor que vende mais unidades ganha a competi��o. Escreva um  um aplicativo Java 
 * que aceita como entrada uma s�rie de 10 inteiros e determina e imprime o maior dos inteiros. 
 * Seu programa deve utilizar pelo menos as tr�s vari�veis a seguir: 
 * a) counter: um contador para contar at� 10 (isto �, monitorar quantos n�meros foram inseridos e 
 * determinar quando todos os 10 n�meros foram processados).
 * b) number: o inteiro mais recentemente inserido pelo usu�rio.
 * c) largest: o maior n�mero encontrado at� agora. */

import java.util.Scanner;

public class Exercicio4_21 
{
	public static void main(String[] args) 
	{
		int counter = 0;
		int number = 0;
		int largest = 0;
		
		Scanner input = new Scanner(System.in);
		
		while (counter < 10)
		{
			System.out.print("Digite um n�mero inteiro: ");
			number = input.nextInt();
			
			if (number > largest)
				largest = number;
			
			++counter;
		}
		
		System.out.printf("Maior n�mero digitado: %d%n", largest);
		
		input.close();
	}
}