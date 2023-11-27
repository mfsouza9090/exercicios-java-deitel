
public class Cliente 
{
	private int numConta;
	private int saldoInicial;
	private int despesas;
	private int credito;
	private int limiteCredito;
	
	public Cliente (int numConta, int saldoInicial, int despesas, int credito, int limiteCredito)
	{
		this.numConta = numConta;
		this.saldoInicial = saldoInicial;
		this.despesas = despesas;
		this.credito = credito;
		this.limiteCredito = limiteCredito;
	}
	
	public int getNumConta() { return numConta; }
	
	public int getSaldoInicial() { return saldoInicial; }
	
	public int getDespesas() { return despesas; }
	
	public int getCredito() { return credito; }
		
	public int getLimiteCredito() { return limiteCredito; }

	public void setNumConta(int numConta) { this.numConta = numConta; }
	
	public void setSaldoInicial (int saldoInicial) { this.saldoInicial = saldoInicial; }
	
	public void setDespesas (int despesas) { this.despesas = despesas; }
	
	public void setCredito (int credito) { this.credito = credito; }
	
	public void setLimiteCredito (int limiteCredito) { this.limiteCredito = limiteCredito; }
	
	public void novoSaldo(int saldoInicial, int despesas, int credito, int limiteCredito)
	{
		int novoSaldo = saldoInicial + despesas - credito;
		
		System.out.printf("Novo saldo: %d%n", novoSaldo);
		
		if (novoSaldo > limiteCredito)
			System.out.println("Limite de crédito excedido");
	}
}
