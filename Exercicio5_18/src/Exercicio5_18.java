/*(Programa de juros compostos modificado) Modifique o aplicativo na 
 * Figura 5.6 para utilizar apenas inteiros para calcular os juros
 * compostos. [Dica: trate todas as quantidades monet�rias como n�meros 
 * inteiros em centavos. Ent�o, divida o resultado em suas partes d�lar 
 * e centavos utilizando as opera��es divis�o e resto, respectivamente. 
 * Insira uma v�rgula entre as partes d�lar e centavos.] */ 


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
