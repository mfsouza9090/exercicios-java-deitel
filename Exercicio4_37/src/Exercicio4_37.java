/* (Fatorial) O fatorial de um inteiro n�o negativo n � escrito como n! 
 * (pronuncia-se �n fatorial�) e � definido como segue:
 * 
 * n! = n � (n � 1) � (n � 2) � ... � 1 (para valores de n maiores ou iguais a 1)
 * 
 * e
 * 
 * n! = 1 (para n = 0)
 * 
 * por exemplo, 5! = 5 � 4 � 3 � 2 � 1, o que d� 120.
 * 
 * a) Escreva um aplicativo que l� um inteiro n�o negativo, calcula e imprime 
 * seu fatorial.
 * b) Escreva um aplicativo que estima o valor da constante matem�tica. Permita ao 
 * usu�rio inserir o n�mero de termos a calcular.
 * c) Escreva um aplicativo que computa o valor de e ao quadrado. Permita ao usu�rio 
 * inserir o n�mero de termos a calcular. */

import java.util.Scanner;

public class Exercicio4_37 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int numeroUsuario = 0;
		int fatorial = 0;
		int contador = 0;
		
		
		System.out.print("Insira um inteiro positivo: ");
		numeroUsuario = input.nextInt();
		
		while (numeroUsuario <= 0)
		{
			System.out.println("Inpu inv�lido");
			System.out.print("Insira um inteiro positivo: ");
			numeroUsuario = input.nextInt();
		}
		
		fatorial = numeroUsuario;
		contador = numeroUsuario;
		
		while (contador > 1)
		{
			fatorial = fatorial * (numeroUsuario - 1);
			--numeroUsuario;
			--contador;
			System.out.println(fatorial);
		}
	}
}
