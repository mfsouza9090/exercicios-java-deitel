
public class Professor extends Pessoa
{
	// propriedades da subclasse Professor
	private String RegFunc;
	private String Formacao;
	
	// método construtor; herda as propriedades da 
	// superclasse pessoa
	public Professor(String nome, String dataNascimento,
			String rg, String cpf, char sexo,
			String regFunc, String formacao)
	{
		// chama o construtor da superclasse Pessoa
		super(nome, dataNascimento, rg, cpf, sexo);
		this.RegFunc = regFunc;
		this.Formacao = formacao;
		this.Tipo = "Professor";
	}
	
	// métodos get e set
	public String getRegFunc() { return RegFunc; }
	public String getFormcacao() { return Formacao; }
	
	public void setRegFunc(String regFunc) { this.RegFunc = regFunc; }
	public void setFormacao(String formacao) { this.Formacao = formacao; }
	
	// implementação do método abstrato salario() da 
	// superclasse Pessoa
	public float salario()
	{
		return 1000;
	}

	public String toString()
	{
		return String.format(super.toString(), 
				"%nRegistro Funcional: %s%nFormação: %s%n", 
				RegFunc, Formacao);
	}
}
