/* (Localize o maior número) O processo de localizar o maior valor é muito utilizado 
 * em aplicativos de computador. Por exemplo, um programa que determina o vencedor de 
 * uma competição de vendas inseriria o número de unidades vendidas por cada vendedor. 
 * O vendedor que vende mais unidades ganha a competição. Escreva um  um aplicativo Java 
 * que aceita como entrada uma série de 10 inteiros e determina e imprime o maior dos inteiros. 
 * Seu programa deve utilizar pelo menos as três variáveis a seguir: 
 * a) counter: um contador para contar até 10 (isto é, monitorar quantos números foram inseridos e 
 * determinar quando todos os 10 números foram processados).
 * b) number: o inteiro mais recentemente inserido pelo usuário.
 * c) largest: o maior número encontrado até agora. */

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
			System.out.print("Digite um número inteiro: ");
			number = input.nextInt();
			
			if (number > largest)
				largest = number;
			
			++counter;
		}
		
		System.out.printf("Maior número digitado: %d%n", largest);
		
		input.close();
	}
}