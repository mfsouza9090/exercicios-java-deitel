/* ) Um varejista on-line vende cinco produtos cujos pre�os no varejo s�o como a seguir: 
 * produto 1, US$ 2,98; produto 2, US$ 4,50; produto 3, US$ 9,98; produto 4, US$ 4,49 
 * e produto 5, US$ 6,87. Escreva um aplicativo que leia uma s�rie de pares de n�meros
 * como segue:
 * a) n�mero de produto
 * b) quantidade vendida
 * Seu programa deve utilizar uma instru��o switch para determinar o pre�o de varejo de 
 * cada produto. Voc� deve calcular e exibir o valor de varejo total de todos os produtos 
 * vendidos. Utilize um loop controlado por sentinela para determinar quando o programa deve 
 * parar o loop e exibir os resultados finais. */ 

import java.util.Scanner;

public class Exercicio5_17 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sentinela = 1;
		int numProduto;
		int qtdVendida;
		double total = 0;
		
		while (sentinela > 0) {
			System.out.println("Insira o n�mero do produto:");
			numProduto = input.nextInt();
			
			System.out.println("Insira a quantidade vendida ou -1 para encerrar");
			qtdVendida = input.nextInt();
			
			switch (numProduto) {
			case 1:
				total += 2.98 * qtdVendida;
				break;
			case 2:
				total += 4.50 * qtdVendida;
				break;
			case 3:
				total += 9.98 * qtdVendida;
				break;
			case 4:
				total += 4.49 * qtdVendida;
				break;
			case 5:
				total += 6.87 * qtdVendida;
			}
		}
		
		input.close();
	}
	
}
