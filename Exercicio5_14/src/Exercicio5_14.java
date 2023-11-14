/* (Programa de juros compostos modificado) Modifique o aplicativo 
 * de juros compostos da Figura 5.6 para repetir os passos para taxas
 * de juros de 5%, 6%, 7%, 8%, 9% e 10%. Utilize um loop for para variar 
 * a taxa de juros. */ 

public class Exercicio5_14 
{
	public static void main(String[] args) 
	{
		// código inicial fornecido pelo livro
		double amount;
		double principal = 1000.0;
		double rate = 0.05;
		
		System.out.printf("%s%20s %n", "Year", "Amount on deposit");
		
		for (int year = 1; year <= 10; ++year)
		{
			amount = principal * Math.pow(1.0 + rate, year);
			
			System.out.printf("%4d%,20.2f%n", year, amount);
		}
	}
}
