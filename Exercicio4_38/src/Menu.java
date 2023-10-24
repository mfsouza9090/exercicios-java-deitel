import java.util.Scanner;

public class Menu 
{
	public static void menu()
	{
		Scanner input = new Scanner(System.in);
		int resposta = 0;
		
		System.out.println("Escolha uma opção: \n"
				         + "1 - Criptografar dado\n"
				         + "2 - Descriptografar dado\n"
				         + "3 - Encerrar o programa");
		
		resposta = input.nextInt();
		
		if (resposta == 1)
		{
			String dadoOriginal = "";
			int dadoOriginalInt;
			
			System.out.print("Insira um inteiro de quatro dígitos: ");
			dadoOriginal = input.next();
			
			dadoOriginalInt = Validador.validador(dadoOriginal);
			
		    Criptografador.criptografador(dadoOriginalInt);
		}
		else if (resposta == 2)
		{
			String dadoOriginal = "";
			int dadoOriginalInt;
			
			System.out.print("Insira um dado (inteiro de quatro dígitos) criptografado: ");
			dadoOriginal = input.next();
			
			dadoOriginalInt = Validador.validador(dadoOriginal);
			
			System.out.printf("Dado descriptografado: %d%n", 
					          Descriptografador.descriptografador(dadoOriginalInt));
		}
		else if (resposta == 3)
		{
			System.out.println("Obrigado por usar o programa");
			System.exit(0);
		}
		else
		{
			System.out.println("Input inválido");
			menu();
		}
		
		input.close();
	}
}
