
public class Empregado 
{
	private String nome;
	private int horasTrabalhadas;
	private double salarioHora;
	private double salarioBruto;
	
	public Empregado (String nome, int horasTrabalhadas, double salarioHora)
	{
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioHora = salarioHora;
	}
	
	public String getNome() { return nome; }
	
	public int getHorasTrabalhadas() { return horasTrabalhadas; }
	
	public double getSalarioHoras() { return salarioHora; }
	
	public double getSalarioBruto() { return salarioBruto; }
	
	public void calculaSalarioBruto()
	{
		int horasExtras = 0;
		
		if (horasTrabalhadas > 40)
		{
			horasExtras = horasTrabalhadas - 40;
			salarioBruto += horasTrabalhadas * salarioHora + horasExtras * (salarioHora * 0.05);
		}
		else
			salarioBruto += horasTrabalhadas * salarioHora;
	}
}
