/* (Calculando o valor de pi) Calcule o valor de S a partir 
 * de uma série infinita. Imprima uma tabela que mostre o valor 
 * aproximado de pi calculando os 200.000 primeiros termos dessa
 * série. Quantos termos você tem de utilizar antes de primeiro 
 * obter um valor que começa com 3,14159? */ 
public class Exercicio5_20 {

	public static void main(String[] args) {
		double perimetro = 4;
		int diametro = 3;
		double pi = 4;
		boolean sinal = true;
		int marca = 0;
		
		// cabeçalho da tabela
		System.out.println(" ------------------------------------");
		System.out.printf("|      %-6s |      %-15s |%n", "Termo", "Valor de pi");
		System.out.println(" ------------------------------------");
		
		// calcula os termos da série
		for (int i = 1; i <= 200000; i++) {
			// se i for ímpar, subtraia de pi o quocioente da
			// divisão entre perímetro e diâmetro
			if (i % 2 != 0){
				pi -= perimetro / diametro;
			}
			// caso contrário, some a pi o quociente da divisão
			// entre perímetro e diâmetro
			else {
				pi += perimetro / diametro;
			}
			
			System.out.printf("|      %6d | %20.14f |", i, pi);
			System.out.println();
			
			// converte pi em uma string representando um double
			// com cinco casas decimais
			String piStr = String.format("%.5f", pi);
			boolean eIgual = piStr.equals("3,14159");
			
			// armazena a iteração em que o valor de pi foi
			// 3,14159 pela primeira vez
			if (sinal && eIgual){
				marca = i;
				sinal = false;
			}

			diametro += 2;
		}
		
		System.out.println(" ------------------------------------");
		System.out.println();
		System.out.printf("Marca: %d", marca);
	}
	
}
