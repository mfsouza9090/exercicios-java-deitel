import java.util.Scanner;

public class Validador 
{
	public static int validador(String entradaUsuario)
	{
		Scanner input = new Scanner(System.in);
		String dadoOriginal = entradaUsuario;
		int dadoOriginalInt;
		
		while (dadoOriginal.length() != 4)
		{
			System.out.println("Input inv�lido");
			System.out.print("Insira um inteiro de quatro d�gitos: ");
			dadoOriginal = input.next();
		}
		
		dadoOriginalInt = Integer.parseInt(dadoOriginal);
		input.close();
		return dadoOriginalInt;
	}
}
