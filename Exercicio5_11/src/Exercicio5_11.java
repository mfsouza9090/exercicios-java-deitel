/* (Localize o menor valor) Escreva um aplicativo que localiza 
 * o menor de v�rios n�meros inteiros. Suponha que o primeiro
 * valor lido especifica o n�mero de valores a serem inseridos 
 * pelo usu�rio. */
import java.util.Scanner;

public class Exercicio5_11 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int menorValor = 0;
		
		System.out.println("Insira um n�mero inteiro. Este n�mero determinar�\n"
				       + "a quantidade de entradas que voc� dever� digitar em\n"
				       + "seguida:");
		
		for (int contador = input.nextInt(); contador > 0; contador--)
		{
			System.out.println();
			System.out.println("Insira um n�mero inteiro:");
			int inteiroUsuario = input.nextInt();
			
			if (inteiroUsuario < menorValor)
				menorValor = inteiroUsuario;
		}
		System.out.println();
		System.out.printf("Menor valor digitado: %d%n", menorValor);
		
		input.close();
	}
}