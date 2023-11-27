import java.util.Scanner;

public class Exercicio4_17 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int totalKm = 0;
		int totalGas = 0;
		int kmDirigidos = 0;
		int gasConsumida = 0;
		int flag = 0;
		
		while (flag != -1)
		{
			System.out.print("Digite os quilômetros rodados: ");
			kmDirigidos = input.nextInt();
			System.out.print("Digite a gasolina consumida: ");
			gasConsumida = input.nextInt();
			
			totalKm += kmDirigidos;
			totalGas += gasConsumida;
			
			System.out.printf("\nMédia de consumo para esta viagem: %.2f km/l\n", 
					(double) kmDirigidos / gasConsumida );
			System.out.printf("Total de quilômetros rodados até agora: %d%n", totalKm);
			System.out.printf("Total de gasolina consumida até agora: %d%n\n", totalGas);
			
			System.out.print("Digite 0 para continuar ou -1 para encerrar o programa: ");
			flag = input.nextInt();
			System.out.println();
			
			input.close();
		}
	}
}
