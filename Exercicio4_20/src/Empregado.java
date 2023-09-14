
public class Empregado 
{
	private String nome;
	private int horasTrabalhadas;
	private double salarioHora;
	private double salarioBruto;
	
	public Empregado (String nome, double salarioHora)
	{
		this.nome = nome;
		this.salarioHora = salarioHora;
	}
	
	public String getNome() { return nome; }
	
	public int getHorasTrabalhadas() { return horasTrabalhadas; }
	
	public double getSalarioHoras() { return salarioHora; }
	
	public double getSalarioBruto() { return salarioBruto; }
	
}
