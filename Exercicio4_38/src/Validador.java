import java.util.Scanner;

public class Validador 
{
	public static int validador(int entradaUsuario)
	{
		Scanner input = new Scanner(System.in);
		int dadoOriginal = entradaUsuario;
		
		while (dadoOriginal > 9999 || dadoOriginal < 1000)
		{
			System.out.println("Input inv�lido");
			System.out.print("Insira um inteiro de quatro d�gitos: ");
			dadoOriginal = input.nextInt();
		}
		
		input.close();
		
		return dadoOriginal;
	}
}
