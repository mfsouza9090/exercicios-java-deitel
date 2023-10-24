import java.util.Scanner;

public class Menu 
{
	public static void menu()
	{
		Scanner input = new Scanner(System.in);
		int resposta = 0;
		
		System.out.println("Escolha uma op��o: \n"
				         + "1 - Criptografar dado\n"
				         + "2 - Descriptografar dado\n"
				         + "3 - Encerrar o programa");
		
		resposta = input.nextInt();
		
		if (resposta == 1)
		{
			// armazena o input em uma vari�vel do tipo String
			// para que o m�todo validador possa verificar se 
			// o mesmo possui quatro d�gitos; caso true, ele 
			// converte e retorna o valor em uma vari�vel
			// do tipo int. se o input fosse armazenado diretamente
			// em uma vari�vel do tipo int e o primeiro d�gito
			// � esquerda fosse 0 (uma a��o v�lida), o programa
			// consideraria apenas 3 d�gitos e o input, embora
			// leg�timo, n�o seria validado. para maiores
			// esclarecimentos, consultar o m�todo validador da
			// classe Validador
			String dadoOriginal = "";
			int dadoOriginalInt;
			
			System.out.print("Insira um inteiro de quatro d�gitos: ");
			dadoOriginal = input.next();
			
			dadoOriginalInt = Validador.validador(dadoOriginal);
			
		    Criptografador.criptografador(dadoOriginalInt);
		}
		else if (resposta == 2)
		{
			String dadoOriginal = "";
			int dadoOriginalInt;
			
			System.out.print("Insira um dado (inteiro de quatro d�gitos) criptografado: ");
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
			System.out.println("Input inv�lido");
			menu();
		}
		
		input.close();
	}
}
