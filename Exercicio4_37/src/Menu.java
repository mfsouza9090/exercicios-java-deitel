import java.util.Scanner;


public class Menu 
{
	public static void acionaMenu()
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
			
			System.out.printf("%d! = %d%n", fatorialDe, Fatorial.calculaFatorial(fatorialDe));
		}
		else if (menuInput == 2)
		{
			int qtdTermos = 0;
			
			System.out.print("Insira o número de termos: ");
			qtdTermos = input.nextInt();
			
			while (qtdTermos <= 0)
			{
				System.out.println("Input inválido");
				System.out.print("Insira o número de termos: ");
				qtdTermos = input.nextInt();
			}
			
			System.out.printf("Valor da constante matemática e: %.2f", 
					ConstanteMatematica.calculaConstante(qtdTermos));
		}
		
		input.close();
	}
}
