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
				+ "\n3 - Valor de e^(x) (Subexercício C)"
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
			
			System.out.printf("Valor da constante matemática e: %.9f", 
					ConstanteMatematica.calculaConstante(qtdTermos));
		}
		else if (menuInput == 3)
		{
			int expoente = 0;
			int qtdTermos = 0;
			
			System.out.print("Insira expoente de x: ");
			expoente = input.nextInt();
			
			System.out.print("Insira o número de termos: ");
			qtdTermos = input.nextInt();
			
			while (expoente < 0)
			{
				System.out.println("Input inválido");
				System.out.print("Insira o expoente de x");
			}
			
			while (qtdTermos <= 0)
			{
				System.out.println("Input inválido");
				System.out.print("Insira o número de termos");
			}
			
			System.out.printf("Valor de e^%d: %.9f", expoente, 
					ConstanteMatematicaPotencia.calculaConstantePotencia(expoente, qtdTermos));
		}
		
		input.close();
	}
}
