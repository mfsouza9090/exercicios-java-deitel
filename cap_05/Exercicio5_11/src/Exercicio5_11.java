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
		int contador;
		
		System.out.println("Insira um n�mero inteiro. Este n�mero determinar�\n"
				       + "a quantidade de entradas que voc� dever� digitar em\n"
				       + "seguida:");
		// a express�o abaixo se justifica pois a entrada do primeiro inteiro 
		// se dar� fora do escopo do loop, que dever� iterar x vezes - 1
		contador = input.nextInt() - 1;
		
		// as tr�s linhas a seguir garantem que o valor da vari�vel
		// menorValor seja igual ao valor do primeiro inteiro digitado
		// pelo usu�rio antes do in�cio do loop. sem elas, o menor
		// valor seria sempre 0 
		System.out.println();
		System.out.println("Insira um n�mero inteiro:");
		menorValor = input.nextInt();
		
		while (contador > 0)
		{
			System.out.println();
			System.out.println("Insira um n�mero inteiro:");
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