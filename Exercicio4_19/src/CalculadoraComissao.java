import java.util.Scanner;

public class CalculadoraComissao 
{
	private double salarioSemanal = 200.00;
	private double totalVendas = 0;
	private double item1 = 239.99;
	private double item2 = 129.75;
	private double item3 = 99.95;
	private double item4 = 350.89;
	
	public double getSalarioSemanal() { return salarioSemanal; }
	
	public double getTotalVendas() { return totalVendas; }
	
	public double getItem1() { return item1; }
	
	public double getItem2() { return item2; }
	
	public double getItem3() { return item3; }
	
	public double getItem4() { return item4; }
	
	public void somaVendas()
	{
		Scanner input = new Scanner(System.in);
		int valor = 0;
		
		while (valor != -1) 
		{
			System.out.print("Insira o código correspondente ao item vendido ou -1 para encerrar: ");
			valor = input.nextInt();
			
			switch (valor)
			{
			case 1:
				totalVendas += item1;
				break;
			case 2:
				totalVendas += item2;
				break;
			case 3:
				totalVendas += item3;
				break;
			case 4:
				totalVendas += item4;
				break;
			case -1:
				break;
			default:
				System.out.println("Insira um código válido\n");
				break;
			}
		}
		System.out.printf("O total de vendas é: %.2f%n", totalVendas);
	}
}
