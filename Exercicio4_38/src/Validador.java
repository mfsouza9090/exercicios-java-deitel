import java.util.Scanner;

public class Validador 
{
	public static int validador(int entradaUsuario)
	{
		Scanner input = new Scanner(System.in);
		int dadoOriginal = entradaUsuario;
		int contador = 0;
		int primeiroDigito = 0;
		
		// se o primeiro dígito do dado inserido pelo usuário
		// for 0 (uma ação válida), este não será preservado e 
		// o programa considerará que o dado tem apenas 3 dígitos. 
		// o bloco abaixo garante que, neste caso, o input seja
		// validado
		while (contador < 1)
		{
			primeiroDigito = dadoOriginal / 1000;
			++contador;
		}
		
		// lembrete: criar lógica para confirmar se, mesmo
		// que o primeiro dígito à esquerda seja 0, o inteiro
		// tenha quatro dígitos. talvez isso possa ser obtido
		// realizando uma operação de módulo por 1000 em uma variável
		// contendo o valor do input e depois verificando se o resto
		// tem três dígitos ( > 99 && < 1000)
		if (primeiroDigito == 0)
		{
			return dadoOriginal;
		}
		else
		{
			while (dadoOriginal > 9999 || dadoOriginal < 1000)
			{
				System.out.println("Input inválido");
				System.out.print("Insira um inteiro de quatro dígitos: ");
				dadoOriginal = input.nextInt();
			}
			return dadoOriginal;
		}
	}
}
