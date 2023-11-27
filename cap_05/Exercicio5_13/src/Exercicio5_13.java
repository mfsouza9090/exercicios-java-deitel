/* (Fatoriais) Fatoriais costumam ser utilizados em problemas
 * de probabilidade. O fatorial de um inteiro positivo n 
 * (escrito como n! e pronunciado como “fatorial de n”) é igual
 * ao produto dos números inteiros positivos de 1 a n. Escreva 
 * um aplicativo que calcula os fatoriais de 1 a 20. Utilize o 
 * tipo long. Exiba os resultados em formato tabular. Que 
 * dificuldade poderia impedir você de calcular o fatorial de 100? */ 

public class Exercicio5_13 
{
	public static void main(String[] args) 
	{
		System.out.println(" #-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
		System.out.printf("|   %8s   |      %-13s   |%n", "Fatorial", "Resultado");
		System.out.println(" #-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
		
		for (int contador = 1; contador <= 20; contador++)
		{
			long fatorial = contador;
			int decrementador = contador;
			
			while (decrementador > 1)
			{
				fatorial = fatorial * (decrementador - 1);
				--decrementador;
			}
			
			System.out.printf("|  %4d!       | %-19d  |%n", contador, fatorial);
		}
		
		System.out.println(" #-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
	}
}
