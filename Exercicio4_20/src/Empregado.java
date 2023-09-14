
public class Empregado 
{
	private String nome;
	private int horasTrabalhadas;
	private double salarioHora;
	private double salarioBruto;
	
	public Empregado (String nome)
	{
		this.nome = nome;
	}
	
	public String getNome() { return nome; }
	
	public int getHorasTrabalhadas() { return horasTrabalhadas; }
	
	public double getSalarioHoras() { return salarioHora; }
	
	public double getSalarioBruto() { return salarioBruto; }
	
	public void setHorasTrabalhadas(int horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas; }
	
	public void setSalarioHora(double salarioHora) { this.salarioHora = salarioHora; }
	
	public double calculaSalarioBruto()
	{
		int horasExtras = 0;
		
		if (horasTrabalhadas > 40)
		{
			horasExtras = horasTrabalhadas - 40;
			salarioBruto = 40 * salarioHora + horasExtras * (salarioHora * 0.5 + salarioHora);
		}
		else
			salarioBruto += horasTrabalhadas * salarioHora;
		
		return salarioBruto;
	}
}
