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
		int marca = 0;
		String piStr = "";
		
		System.out.println(" ------------------------------------");
		System.out.printf("|      %-6s |      %-15s |", "Termo", "Valor de pi");
		System.out.println();
		System.out.println(" ------------------------------------");
		
		for (int i = 1; i <= 200000; i++) {
			if (i % 2 != 0){
				pi -= perimetro / diametro;
			}
			else {
				pi += perimetro / diametro;
			}
			
			System.out.printf("|      %6d | %20.14f |", i, pi);
			System.out.println();
			
			piStr = String.format("%.5f", pi);
			
			System.out.println();
			System.out.println(piStr);
			System.out.println();
			
			if (piStr == "3,14159"){
				marca = i;
			}
			
			diametro += 2;
		}
		
		System.out.println(" ------------------------------------");
		System.out.println();
		System.out.printf("Marca: %d", marca);
	}
	
}
