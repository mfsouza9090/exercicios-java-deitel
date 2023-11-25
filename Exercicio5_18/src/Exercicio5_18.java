/*(Programa de juros compostos modificado) Modifique o aplicativo na 
 * Figura 5.6 para utilizar apenas inteiros para calcular os juros
 * compostos. [Dica: trate todas as quantidades monet�rias como n�meros 
 * inteiros em centavos. Ent�o, divida o resultado em suas partes d�lar 
 * e centavos utilizando as opera��es divis�o e resto, respectivamente. 
 * Insira uma v�rgula entre as partes d�lar e centavos.] */ 


public class Exercicio5_18 {

	public static void main(String[] args) {
		int amount;
		int principal = 100000; 
		double rate = 0.05;
		
		System.out.printf("%s%20s %n", "Year", "Amount on deposit");
		
		for (int year = 1; year <= 10; ++year) {
			// converte o resultado para int e armazena
			// na vari�vel amount
			amount = (int) (principal * Math.pow(1.0 + rate, year));
			
			// obt�m a parte inteira
			int dollars = amount / 100;
			// obt�m a parte decimal
			int cents = amount % 100;

			System.out.printf("%4d%,17d.", year, dollars); 
			
			// adiciona um 0 caso a parte decimal seja menor 
			// que 10 (nesse caso, n�o fosse a instru��o abaixo,
			// o 0 n�o seria mostrado)
			if (cents < 10) {
				System.out.printf("0%d\n", cents);
			}
			else {
				System.out.printf("%d\n", cents);
			}
		}
	} 

}
