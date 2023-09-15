/* (Encontre os dois números maiores) Utilizando uma abordagem semelhante 
 * àquela do Exercício 4.21, encontre os dois maiores valores entre os 10 
 * valores inseridos. [Observação: você só pode inserir cada número uma vez.] */

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
			System.out.print("Digite um número inteiro: ");
			number = input.nextInt();
			
			if (secondLargest < largest)
				if (number > largest)
					secondLargest = largest;
			
			if (number > largest)
				largest = number;
			
			++counter;
		}
		
		System.out.printf("Maior número: %d%nSegundo maior número: %d%n", largest, secondLargest);
		
		input.close();
	}
}