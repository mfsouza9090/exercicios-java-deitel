
public class Exercicio4_18 
{
	public static void main(String[] args)
	{
		Cliente c1 = new Cliente(231869, 1000, 300, 800, 1000);
		Cliente c2 = new Cliente(241970, 1000, 800, 1000, 500);
		
		c1.novoSaldo(c1.getSaldoInicial(), c1.getDespesas(), c1.getCredito(), c1.getLimiteCredito());
		c2.novoSaldo(c2.getSaldoInicial(), c2.getDespesas(), c2.getCredito(), c2.getLimiteCredito());
	}
}
 