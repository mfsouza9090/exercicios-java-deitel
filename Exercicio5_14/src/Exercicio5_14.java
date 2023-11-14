/* (Programa de juros compostos modificado) Modifique o aplicativo 
 * de juros compostos da Figura 5.6 para repetir os passos para taxas
 * de juros de 5%, 6%, 7%, 8%, 9% e 10%. Utilize um loop for para variar 
 * a taxa de juros. */ 

public class Exercicio5_14 
{
	public static void main(String[] args) 
	{
		double amount;
		double principal = 1000.0;
		double rate = 0.05;
		
		System.out.printf("%s%20s %n", "Year", "Amount on deposit");
		
		for(int counter = 1; counter <= 6; counter++)
		{
			for (int year = 1; year <= 10; ++year)
			{
				amount = principal * Math.pow(1.0 + rate, year);
				
				System.out.printf("%4d%,20.2f%n", year, amount);
			}
			
			System.out.println();
			
			// se usassse += para somar 0.01 ao valor da variável
			// rate a cada iteração do loop for externo, os resultados
			// eventualmente seriam imprecisos. por isso optei pela 
			// instrução de seleção múltipla
			switch (counter)
			{
			case 1:
				rate = 0.06;
				break;
			case 2:
				rate = 0.07;
				break;
			case 3:
				rate = 0.08;
				break;
			case 4: 
				rate = 0.09;
				break;
			case 5:
				rate = 0.1;
			}
		}
	}
}
