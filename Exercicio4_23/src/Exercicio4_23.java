/* (Encontre os dois n�meros maiores) Utilizando uma abordagem semelhante 
 * �quela do Exerc�cio 4.21, encontre os dois maiores valores entre os 10 
 * valores inseridos. [Observa��o: voc� s� pode inserir cada n�mero uma vez.] */

import java.util.Scanner;

public class Exercicio4_23 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		int number = 0;
		int largest = 0;
		int secondLargest = 0;
		
		while (counter < 10)
		{
			System.out.print("Digite um n�mero inteiro: ");
			number = input.nextInt();
			
			if (secondLargest < largest)
				if (number > largest)
					secondLargest = largest;
			
			if (number > largest)
				largest = number;
			
			++counter;
		}
		
		System.out.printf("Maior n�mero: %d%nSegundo maior n�mero: %d%n", largest, secondLargest);
		
		input.close();
	}
}