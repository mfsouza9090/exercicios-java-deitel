/* (Calculando o produto de n�meros inteiros �mpares) Escreva um 
 * aplicativo que calcula o produto dos n�meros inteiros �mpares 
 * de 1 a 15 */ 

public class Exercicio5_12 {

	public static void main(String[] args) 
	{
		int produto = 1;
		
		for (int contador = 1; contador <= 15; contador++)
		{
			if (contador % 2 != 0)
				produto *= contador;
		}
		
		System.out.printf("Produto dos inteiros �mpares de 1 a 15: %d%n", produto);
	}
}