/* (Lados de um triângulo direito) Escreva um aplicativo que lê três 
 * inteiros diferentes de zero, determina e imprime se eles poderiam
 * representar os lados de um triângulo direito. */

import java.util.Scanner;

public class Exercicio4_36 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int lado1 = 0;
		int lado2 = 0;
		int lado3 = 0;
		
		System.out.print("Insira o primeiro lado do triângulo: ");
		lado1 = input.nextInt();
		
		while (lado1 <= 0)
		{
			System.out.println("Input inválido. Insira um inteiro positivo");
			System.out.print("Insira o primeiro lado do triângulo: ");
			lado1 = input.nextInt();
		}
		
		System.out.print("Insira o segundo lado do triângulo: ");
		lado2 = input.nextInt();
		
		while (lado2 <= 0)
		{
			System.out.println("Input inválido. Insira um inteiro positivo");
			System.out.print("Insira o segundo lado do triângulo: ");
			lado2 = input.nextInt();
		}
		
		System.out.print("Insira o terceiro lado do triângulo: ");
		lado3 = input.nextInt();
		
		while (lado3 <= 0)
		{
			System.out.println("Input inválido. Insira um inteiro positivo");
			System.out.print("Insira o terceiro lado do triângulo: ");
			lado3 = input.nextInt();
		}
		
		if ((lado1 * lado1) == ((lado2 * lado2) + (lado3 * lado3)))
		{
			System.out.print("Os inteiros inseridos podem representar os lados de um triângulo retângulo");
		}
		else if ((lado2 * lado2) == ((lado1 * lado1) + (lado3 * lado3)))
		{
			System.out.print("Os inteiros inseridos podem representar os lados de um triângulo retângulo");
		}
		else if ((lado3 * lado3) == ((lado1 * lado1) + (lado2 * lado2)))
		{
			System.out.print("Os inteiros inseridos podem representar os lados de um triângulo retângulo");
		}
		else
		{
			System.out.print("Os inteiros inseridos não podem representar os lados de um triângulo retângulo");
		}
		
		input.close();
	}
}