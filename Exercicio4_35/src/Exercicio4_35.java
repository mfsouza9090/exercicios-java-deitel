/* (Lados de um triângulo) Escreva um aplicativo que lê três 
 * valores diferentes de zero inseridos pelo usuário, determina 
 * e imprime se eles poderiam representar os lados de um 
 * triângulo. */ 

import java.util.Scanner;

public class Exercicio4_35 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int lado1 = 0;
		int lado2 = 0;
		int lado3 = 0;
		
		
		System.out.print("Digite o primeiro lado do triângulo: ");
		lado1 = input.nextInt();
		
		while (lado1 <= 0)
		{
			System.out.println("Input inválido. Digite um inteiro positivo");
			System.out.print("Digite o primeiro lado do triângulo: ");
			lado1 = input.nextInt();
		}
		
		System.out.print("Digite o segundo lado do triângulo: ");
		lado2 = input.nextInt();
		
		while (lado2 <= 0)
		{
			System.out.println("Input inválido. Digite um inteiro positivo");
			System.out.print("Digite o segundo lado do triângulo: ");
			lado2 = input.nextInt();
		}
		
		System.out.print("Digite o terceiro lado do triângulo: ");
		lado3 = input.nextInt();
		
		while (lado3 <= 0)
		{
			System.out.println("Input inválido. Digite um inteiro positivo");
			System.out.print("Digite o terceiro lado do triângulo: ");
			lado3 = input.nextInt();
		}
	}
}