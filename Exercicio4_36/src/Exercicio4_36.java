/* (Lados de um tri�ngulo direito) Escreva um aplicativo que l� tr�s 
 * inteiros diferentes de zero, determina e imprime se eles poderiam
 * representar os lados de um tri�ngulo direito. */

import java.util.Scanner;

public class Exercicio4_36 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int lado1 = 0;
		int lado2 = 0;
		int lado3 = 0;
		
		System.out.print("Insira o primeiro lado do tri�ngulo: ");
		lado1 = input.nextInt();
		
		while (lado1 <= 0)
		{
			System.out.println("Input inv�lido. Insira um inteiro positivo");
			System.out.print("Insira o primeiro lado do tri�ngulo: ");
			lado1 = input.nextInt();
		}
		
		System.out.print("Insira o segundo lado do tri�ngulo: ");
		lado2 = input.nextInt();
		
		while (lado2 <= 0)
		{
			System.out.println("Input inv�lido. Insira um inteiro positivo");
			System.out.print("Insira o segundo lado do tri�ngulo: ");
			lado2 = input.nextInt();
		}
		
		System.out.print("Insira o terceiro lado do tri�ngulo: ");
		lado3 = input.nextInt();
		
		while (lado3 <= 0)
		{
			System.out.println("Input inv�lido. Insira um inteiro positivo");
			System.out.print("Insira o terceiro lado do tri�ngulo: ");
			lado3 = input.nextInt();
		}
		
		if ((lado1 * lado1) == ((lado2 * lado2) + (lado3 * lado3)))
		{
			System.out.print("Os inteiros inseridos podem representar os lados de um tri�ngulo ret�ngulo");
		}
		else if ((lado2 * lado2) == ((lado1 * lado1) + (lado3 * lado3)))
		{
			System.out.print("Os inteiros inseridos podem representar os lados de um tri�ngulo ret�ngulo");
		}
		else if ((lado3 * lado3) == ((lado1 * lado1) + (lado2 * lado2)))
		{
			System.out.print("Os inteiros inseridos podem representar os lados de um tri�ngulo ret�ngulo");
		}
		else
		{
			System.out.print("Os inteiros inseridos n�o podem representar os lados de um tri�ngulo ret�ngulo");
		}
		
		input.close();
	}
}