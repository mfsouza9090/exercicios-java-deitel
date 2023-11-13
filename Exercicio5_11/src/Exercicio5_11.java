/* (Localize o menor valor) Escreva um aplicativo que localiza 
 * o menor de vários números inteiros. Suponha que o primeiro
 * valor lido especifica o número de valores a serem inseridos 
 * pelo usuário. */
import java.util.Scanner;

public class Exercicio5_11 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int inteiroUsuario;
		int menorValor;
		
		System.out.println("Insira um número inteiro. Este número determinará\n"
				       + "a quantidade de entradas que você deverá digitar em\n"
				       + "seguida:");
		
		for (int contador = input.nextInt(); contador > 0; contador--)
		{
			System.out.println();
			System.out.println("Insira um número inteiro:");
			inteiroUsuario = input.nextInt();
			menorValor = inteiroUsuario;
			
			if (inteiroUsuario < menorValor)
				menorValor = inteiroUsuario;
		}
		
		System.out.println();
		System.out.printf("Menor valor: %d%n", menorValor);
		input.close();
	}

}
