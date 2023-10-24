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
			// armazena o input em uma variável do tipo String
			// para que o método validador possa verificar se 
			// o mesmo possui quatro dígitos; caso true, ele 
			// converte e retorna o valor em uma variável
			// do tipo int. se o input fosse armazenado diretamente
			// em uma variável do tipo int e o primeiro dígito
			// à esquerda fosse 0 (uma ação válida), o programa
			// consideraria apenas 3 dígitos e o input, embora
			// legítimo, não seria validado. para maiores
			// esclarecimentos, consultar o método validador da
			// classe Validador
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
