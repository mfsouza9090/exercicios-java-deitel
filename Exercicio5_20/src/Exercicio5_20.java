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
		
		System.out.println(" -----------------------------------");
		System.out.printf("|  %6s |    %-20s |", "Termo", "Valor de pi");
		System.out.println();
		System.out.println(" -----------------------------------");
		
		for (int i = 1; i <= 2000; i++) {
			if (i % 2 != 0){
				pi -= perimetro / diametro;
			}
			else {
				pi += perimetro / diametro;
			}
			
			System.out.printf("|      %d | %.14f |", i, pi);
			System.out.println();
			
			diametro += 2;
		}
	}
	
}
