import java.util.Scanner;

public class Menu 
{
	public static void acionaMenu()
	{
		Scanner input = new Scanner(System.in);
		int menuInput = 0;
		
		System.out.println("Menu"
				+ "\n1 - Fatorial (Subexerc�cio A)"
				+ "\n2 - Constante matem�tica de e (Subexerc�cio B)"
				+ "\n3 - Valor de e^(x) (Subexerc�cio C)"
				+ "\n4 - Sair\n");
		
		menuInput = input.nextInt();
		
		if (menuInput == 1)
		{
			int fatorialDe = 0;
			
			System.out.print("Insira um inteiro positivo: ");
			fatorialDe = input.nextInt();
			
			while (fatorialDe <= 0)
			{
				System.out.println("Input inv�lido");
				System.out.print("Insira um inteiro positivo: ");
				fatorialDe = input.nextInt();
			}
			
			System.out.printf("%d! = %d%n", fatorialDe, Fatorial.calculaFatorial(fatorialDe));
		}
		else if (menuInput == 2)
		{
			int qtdTermos = 0;
			
			System.out.print("Insira o n�mero de termos: ");
			qtdTermos = input.nextInt();
			
			while (qtdTermos <= 0)
			{
				System.out.println("Input inv�lido");
				System.out.print("Insira o n�mero de termos: ");
				qtdTermos = input.nextInt();
			}
			
			System.out.printf("Valor da constante matem�tica e: %.9f", 
					ConstanteMatematica.calculaConstante(qtdTermos));
		}
		else if (menuInput == 3)
		{
			int expoente = 0;
			int qtdTermos = 0;
			
			System.out.print("Insira expoente de x: ");
			expoente = input.nextInt();
			
			System.out.print("Insira o n�mero de termos: ");
			qtdTermos = input.nextInt();
			
			while (expoente < 0)
			{
				System.out.println("Input inv�lido");
				System.out.print("Insira o expoente de x");
			}
			
			while (qtdTermos <= 0)
			{
				System.out.println("Input inv�lido");
				System.out.print("Insira o n�mero de termos");
			}
			
			System.out.printf("Valor de e^%d: %.9f", expoente, 
					ConstanteMatematicaPotencia.calculaConstantePotencia(expoente, qtdTermos));
		}
		else if (menuInput == 4)
		{
			System.out.print("Obrigado por usar o programa");
			System.exit(0);
		}
		else 
		{
			System.out.println("Input inv�lido");
			System.out.println("Digite um comando v�lido");
			acionaMenu();
		}
		
		input.close();
	}
}
