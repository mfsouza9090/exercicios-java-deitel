/*(Programa de juros compostos modificado) Modifique o aplicativo na 
 * Figura 5.6 para utilizar apenas inteiros para calcular os juros
 * compostos. [Dica: trate todas as quantidades monetárias como números 
 * inteiros em centavos. Então, divida o resultado em suas partes dólar 
 * e centavos utilizando as operações divisão e resto, respectivamente. 
 * Insira uma vírgula entre as partes dólar e centavos.] */ 


public class Exercicio5_18 {

	public static void main(String[] args) {
		int amount = 0; 
		int principal = 100000; 
		int rate = 5;
		
		System.out.printf("%s%20s %n", "Year", "Amount on deposit");
		
		for (int year = 1; year <= 10; ++year) { 
			int parteDecimal;
			amount = 0;
		
			for(int power = year; power > 0; power--) {
				if(power == 1) {
					amount += principal * (100 + rate);
				}
				else {
					amount += amount * (100 + rate);
				}
			}
			
			amount /= 100;
			parteDecimal = amount % 100;
			amount /= 100;
			
			System.out.printf("%4d %20d,%d%n", year, amount, parteDecimal); 
		}
	} 

}
