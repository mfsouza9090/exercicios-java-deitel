/* (Fatorial) O fatorial de um inteiro não negativo n é escrito como n! 
 * (pronuncia-se “n fatorial”) e é definido como segue:
 * 
 * n! = n · (n – 1) · (n – 2) · ... · 1 (para valores de n maiores ou iguais a 1)
 * 
 * e
 * 
 * n! = 1 (para n = 0)
 * 
 * por exemplo, 5! = 5 · 4 · 3 · 2 · 1, o que dá 120.
 * 
 * a) Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime 
 *    seu fatorial.
 * b) Escreva um aplicativo que estima o valor da constante matemática "e" utilizando
 *    a fórmula a seguir. Permita ao usuário inserir o número de termos a calcular.
 *    
 *    e = 1 + 1/1! + 1/2! + 1/3! + ...
 *    
 * c) Escreva um aplicativo que computa o valor de "e" elevado a "x". Permita ao usuário 
 *    inserir o número de termos a calcular. 
 *    
 *    e elevado a x = 1 + x/1! + x elevado ao quadrado/2! + x elevado ao cubo/3! + ... */

import java.util.Scanner;

public class Exercicio4_37 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int menuInput = 0;
		
		System.out.println("Menu"
				+ "\n1 - Fatorial (Subexercício A)"
				+ "\n2 - Constante matemática de e (Subexercício B)"
				+ "\n3 - Valor de e elevado a x (Subexercício C)"
				+ "\n4 - Sair\n");
		
		menuInput = input.nextInt();
		
		if (menuInput == 1)
		{
			int fatorialDe = 0;
			
			System.out.print("Insira um inteiro positivo: ");
			fatorialDe = input.nextInt();
			
			while (fatorialDe <= 0)
			{
				System.out.println("Input inválido");
				System.out.print("Insira um inteiro positivo: ");
				fatorialDe = input.nextInt();
			}
			
			System.out.printf("%d! = %d%n", fatorialDe, Fatorial.retornaFatorial(fatorialDe));
		}
		else if (menuInput == 2)
		{
			int termos = 0;
			
			System.out.print("Insira o número de termos: ");
			termos = input.nextInt();
			
			while (termos <= 0)
			{
				System.out.println("Input inválido");
				System.out.print("Insira o número de termos: ");
				termos = input.nextInt();
			}
			
			System.out.printf("Valor da constante matemática e: %.2f", 
					ConstanteMatematica.calculaConstante(termos));
		}
		
		/* Scanner input = new Scanner(System.in);
		int numeroUsuario = 0;
		
		System.out.print("Insira um inteiro positivo: ");
		numeroUsuario = input.nextInt();
		
		while (numeroUsuario <= 0)
		{
			System.out.println("Inpu inválido");
			System.out.print("Insira um inteiro positivo: ");
			numeroUsuario = input.nextInt();
		}
		
		System.out.print(Fatorial.retornaFatorial(numeroUsuario)); */
		
		input.close();
	}
}