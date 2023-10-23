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
			int dadoOriginal = 0;
			
			System.out.print("Insira um inteiro de quatro dígitos: ");
			dadoOriginal = input.nextInt();
			
			dadoOriginal = Validador.validador(dadoOriginal);
			
		    Criptografador.criptografador(dadoOriginal);
		}
		else if (resposta == 2)
		{
			int dadoOriginal = 0;
			
			System.out.print("Insira um dado (inteiro de quatro dígitos) criptografado: ");
			dadoOriginal = input.nextInt();
			
			dadoOriginal = Validador.validador(dadoOriginal);
			
			System.out.printf("Dado descriptografado: %d%n", 
					          Descriptografador.descriptografador(dadoOriginal));
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
