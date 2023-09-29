public class Noia extends Pessoa
{
	public Noia(String nome, String dataNascimento,
			String rg, String cpf, char sexo)
	{
		super(nome, dataNascimento, rg, cpf, sexo);
		this.Tipo = "Nóia";
	}
	
	public float salario()
	{
		return 0;
	}
}