/*(Programa de juros compostos modificado) Modifique o aplicativo na 
 * Figura 5.6 para utilizar apenas inteiros para calcular os juros
 * compostos. [Dica: trate todas as quantidades monetárias como números 
 * inteiros em centavos. Então, divida o resultado em suas partes dólar 
 * e centavos utilizando as operações divisão e resto, respectivamente. 
 * Insira uma vírgula entre as partes dólar e centavos.] */ 


public class Exercicio5_18 {

	public static void main(String[] args) {
		double amount; 
		double principal = 1000.0; 
		double rate = 0.05;
		
		System.out.printf("%s%20s %n", "Year", "Amount on deposit");
		
		for (int year = 1; year <= 10; ++year) { 
			amount = principal * Math.pow(1.0 + rate, year);
			System.out.printf("%4d%,20.2f%n", year, amount); 
		}
	} 

}
