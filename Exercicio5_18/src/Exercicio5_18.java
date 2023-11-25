/*(Programa de juros compostos modificado) Modifique o aplicativo na 
 * Figura 5.6 para utilizar apenas inteiros para calcular os juros
 * compostos. [Dica: trate todas as quantidades monetárias como números 
 * inteiros em centavos. Então, divida o resultado em suas partes dólar 
 * e centavos utilizando as operações divisão e resto, respectivamente. 
 * Insira uma vírgula entre as partes dólar e centavos.] */ 


public class Exercicio5_18 {

	public static void main(String[] args) {
		int principal = 100000; 
		int rate = 5;
		long factor = 100;
		long decimalFactor = 10;
		
		System.out.printf("%s%20s %n", "Year", "Amount on deposit");
		
		for (int year = 1; year <= 10; ++year) { 
			long decimal = 0;
			long whole = principal;
			
		
			for(int power = year; power > 0; power--) {
				whole = whole * (100 + rate);
			}
		
			whole /= factor;
			decimal = whole % factor;
			decimal /= decimalFactor;
			whole /= factor;
			factor *= 10;
			decimalFactor *= 10;

			System.out.printf("%4d %20d,%d%n", year, whole, decimal); 
		}
	} 

}
