
public class Exercicio4_19 {

	public static void main(String[] args) 
	{
		CalculadoraComissao cc1 = new CalculadoraComissao();
		
		cc1.somaVendas();
		
		System.out.printf("Total de vendas: %.2f%n", cc1.getTotalVendas());
	}

}
