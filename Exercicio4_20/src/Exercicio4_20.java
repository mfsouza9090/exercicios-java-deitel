/* (Calculador de salários) Desenvolva um aplicativo Java que determina o salário bruto 
 * de cada um de três empregados. A empresa paga as horas normais pelas primeiras 40 horas 
 * trabalhadas por cada funcionário e 50% a mais por todas as horas trabalhadas além das 40
 * horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana 
 * passada e o salário-hora de cada um. Seu programa deve aceitar a entrada dessas informações 
 * para cada empregado e, então, determinar e exibir o salário bruto do empregado.
 * Utilize a classe Scanner para inserir os dados.*/

import java.util.Scanner;

public class Exercicio4_20 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Empregado e1 = new Empregado("José Maria");
		Empregado e2 = new Empregado("Maria José");
		Empregado e3 = new Empregado("João Pedro");
		
		System.out.printf("Insira o número de horas trabalhadas de %s: ", e1.getNome());
		e1.setHorasTrabalhadas(input.nextInt());
		System.out.printf("Insira o número de horas trabalhadas de %s: ", e2.getNome());
		e2.setHorasTrabalhadas(input.nextInt());
		System.out.printf("Insira o número de horas trabalhadas de %s: ", e3.getNome());
		e3.setHorasTrabalhadas(input.nextInt());
		System.out.println();
		
		System.out.printf("Insira o salário/hora de %s: ", e1.getNome());
		e1.setSalarioHora(input.nextInt());
		System.out.printf("Insira o salário/hora de %s: ", e2.getNome());
		e2.setSalarioHora(input.nextInt());
		System.out.printf("Insira o salário/hora de %s: ", e3.getNome());
		e3.setSalarioHora(input.nextInt());
		System.out.println();
		
		System.out.printf("Salário bruto de %s: %.2f%n", e1.getNome(), e1.calculaSalarioBruto());
		System.out.printf("Salário bruto de %s: %.2f%n", e2.getNome(), e2.calculaSalarioBruto());
		System.out.printf("Salário bruto de %s: %.2f%n", e3.getNome(), e3.calculaSalarioBruto());
		
		input.close();
	}
}
