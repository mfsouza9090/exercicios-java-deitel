import java.util.Scanner;

public class Validador 
{
	public static int validador(int entradaUsuario)
	{
		Scanner input = new Scanner(System.in);
		int dadoOriginal = entradaUsuario;
		int contador = 0;
		int primeiroDigito = 0;
		
		// se o primeiro d�gito do dado inserido pelo usu�rio
		// for 0 (uma a��o v�lida), este n�o ser� preservado e 
		// o programa considerar� que o dado tem apenas 3 d�gitos. 
		// o bloco abaixo garante que, neste caso, o input seja
		// validado
		while (contador < 1)
		{
			primeiroDigito = dadoOriginal / 1000;
			++contador;
		}
		
		// lembrete: criar l�gica para confirmar se, mesmo
		// que o primeiro d�gito � esquerda seja 0, o inteiro
		// tenha quatro d�gitos. talvez isso possa ser obtido
		// realizando uma opera��o de m�dulo por 1000 em uma vari�vel
		// contendo o valor do input e depois verificando se o resto
		// tem tr�s d�gitos ( > 99 && < 1000)
		if (primeiroDigito == 0)
		{
			return dadoOriginal;
		}
		else
		{
			while (dadoOriginal > 9999 || dadoOriginal < 1000)
			{
				System.out.println("Input inv�lido");
				System.out.print("Insira um inteiro de quatro d�gitos: ");
				dadoOriginal = input.nextInt();
			}
			return dadoOriginal;
		}
	}
}
