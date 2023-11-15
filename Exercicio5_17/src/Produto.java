
public class Produto {
	private double preco;
	private double qtdVendida;
	
	public Produto(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setQtdVendida(double qtdVendida) {
		this.qtdVendida = qtdVendida;
	}
	
}
