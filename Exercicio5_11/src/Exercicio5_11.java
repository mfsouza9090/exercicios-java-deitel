/* (Localize o menor valor) Escreva um aplicativo que localiza 
 * o menor de vários números inteiros. Suponha que o primeiro
 * valor lido especifica o número de valores a serem inseridos 
 * pelo usuário. */
import java.util.Scanner;

public class Exercicio5_11 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int menorValor = 0;
		int contador;
		
		System.out.println("Insira um número inteiro. Este número determinará\n"
				       + "a quantidade de entradas que você deverá digitar em\n"
				       + "seguida:");
		// a expressão abaixo se justifica pois a entrada do primeiro inteiro 
		// se dará fora do escopo do loop, que deverá iterar x vezes - 1
		contador = input.nextInt() - 1;
		
		// as três linhas a seguir garantem que o valor da variável
		// menorValor seja igual ao valor do primeiro inteiro digitado
		// pelo usuário antes do início do loop. sem elas, o menor
		// valor seria sempre 0 
		System.out.println();
		System.out.println("Insira um número inteiro:");
		menorValor = input.nextInt();
		
		while (contador > 0)
		{
			System.out.println();
			System.out.println("Insira um número inteiro:");
			int inteiroUsuario = input.nextInt();
			
			if (inteiroUsuario < menorValor)
				menorValor = inteiroUsuario;
			
			contador--;
		}
		
		System.out.println();
		System.out.printf("Menor valor digitado: %d%n", menorValor);
		
		input.close();
	}
}