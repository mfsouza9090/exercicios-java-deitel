/* (Calculador de sal�rios) Desenvolva um aplicativo Java que determina o sal�rio bruto 
 * de cada um de tr�s empregados. A empresa paga as horas normais pelas primeiras 40 horas 
 * trabalhadas por cada funcion�rio e 50% a mais por todas as horas trabalhadas al�m das 40
 * horas. Voc� recebe uma lista de empregados, o n�mero de horas trabalhadas por eles na semana 
 * passada e o sal�rio-hora de cada um. Seu programa deve aceitar a entrada dessas informa��es 
 * para cada empregado e, ent�o, determinar e exibir o sal�rio bruto do empregado.
 * Utilize a classe Scanner para inserir os dados.*/

import java.util.Scanner;

public class Exercicio4_20 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Empregado e1 = new Empregado("Jos� Maria");
		Empregado e2 = new Empregado("Maria Jos�");
		Empregado e3 = new Empregado("Jo�o Pedro");
		
		System.out.printf("Insira o n�mero de horas trabalhadas de %s: ", e1.getNome());
		e1.setHorasTrabalhadas(input.nextInt());
		System.out.printf("Insira o n�mero de horas trabalhadas de %s: ", e2.getNome());
		e2.setHorasTrabalhadas(input.nextInt());
		System.out.printf("Insira o n�mero de horas trabalhadas de %s: ", e3.getNome());
		e3.setHorasTrabalhadas(input.nextInt());
		System.out.println();
		
		System.out.printf("Insira o sal�rio/hora de %s: ", e1.getNome());
		e1.setSalarioHora(input.nextInt());
		System.out.printf("Insira o sal�rio/hora de %s: ", e2.getNome());
		e2.setSalarioHora(input.nextInt());
		System.out.printf("Insira o sal�rio/hora de %s: ", e3.getNome());
		e3.setSalarioHora(input.nextInt());
		System.out.println();
		
		System.out.printf("Sal�rio bruto de %s: %.2f%n", e1.getNome(), e1.calculaSalarioBruto());
		System.out.printf("Sal�rio bruto de %s: %.2f%n", e2.getNome(), e2.calculaSalarioBruto());
		System.out.printf("Sal�rio bruto de %s: %.2f%n", e3.getNome(), e3.calculaSalarioBruto());
		
		input.close();
	}
}
