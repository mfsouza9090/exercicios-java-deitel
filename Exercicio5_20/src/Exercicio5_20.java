/* (Calculando o valor de pi) Calcule o valor de S a partir 
 * de uma s�rie infinita. Imprima uma tabela que mostre o valor 
 * aproximado de pi calculando os 200.000 primeiros termos dessa
 * s�rie. Quantos termos voc� tem de utilizar antes de primeiro 
 * obter um valor que come�a com 3,14159? */ 
public class Exercicio5_20 {

	public static void main(String[] args) {
		double perimetro = 4;
		int diametro = 3;
		double pi = 4;
		boolean sinal = true;
		int marca = 0;
		
		// cabe�alho da tabela
		System.out.println(" ------------------------------------");
		System.out.printf("|      %-6s |      %-15s |%n", "Termo", "Valor de pi");
		System.out.println(" ------------------------------------");
		
		// calcula os termos da s�rie
		for (int i = 1; i <= 200000; i++) {
			// se i for �mpar, subtraia de pi o quocioente da
			// divis�o entre per�metro e di�metro
			if (i % 2 != 0){
				pi -= perimetro / diametro;
			}
			// caso contr�rio, some a pi o quociente da divis�o
			// entre per�metro e di�metro
			else {
				pi += perimetro / diametro;
			}
			
			System.out.printf("|      %6d | %20.14f |", i, pi);
			System.out.println();
			
			// converte pi em uma string representando um double
			// com cinco casas decimais
			String piStr = String.format("%.5f", pi);
			boolean eIgual = piStr.equals("3,14159");
			
			// armazena a itera��o em que o valor de pi foi
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
