/* (Lados de um tri�ngulo) Escreva um aplicativo que l� tr�s 
 * valores diferentes de zero inseridos pelo usu�rio, determina 
 * e imprime se eles poderiam representar os lados de um 
 * tri�ngulo. */ 

import java.util.Scanner;

public class Exercicio4_35 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int lado1 = 0;
		int lado2 = 0;
		int lado3 = 0;
		
		System.out.print("Digite o primeiro lado do tri�ngulo: ");
		lado1 = input.nextInt();
		
		while (lado1 <= 0)
		{
			System.out.println("Input inv�lido. Digite um inteiro positivo");
			System.out.print("Digite o primeiro lado do tri�ngulo: ");
			lado1 = input.nextInt();
		}
		
		System.out.print("Digite o segundo lado do tri�ngulo: ");
		lado2 = input.nextInt();
		
		while (lado2 <= 0)
		{
			System.out.println("Input inv�lido. Digite um inteiro positivo");
			System.out.print("Digite o segundo lado do tri�ngulo: ");
			lado2 = input.nextInt();
		}
		
		System.out.print("Digite o terceiro lado do tri�ngulo: ");
		lado3 = input.nextInt();
		
		while (lado3 <= 0)
		{
			System.out.println("Input inv�lido. Digite um inteiro positivo");
			System.out.print("Digite o terceiro lado do tri�ngulo: ");
			lado3 = input.nextInt();
		}
		
		if ((lado1 + lado2) > lado3)
		{
			System.out.println("Os tr�s lados podem formar um tri�ngulo");
		}
		else if ((lado1 + lado3) > lado2)
		{
			System.out.println("Os tr�s lados podem formar um tri�ngulo");
		}
		else if  ((lado2 + lado3) > lado1)
		{
			System.out.println("Os tr�s lados podem formar um tri�ngulo");
		}
		else
		{
			System.out.println("Os tr�s lados n�o podem formar um tri�ngulo");
		}
	}
}