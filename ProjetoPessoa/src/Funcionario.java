
public class Funcionario extends Pessoa
{
	// propriedades
	private String DataAdmissao;
	private String RegFunc;
	private String cargo;
	
	// construtor da classe Funcionario
	public Funcionario(String nome, String dataNascimento,
			String rg, String cpf, char sexo, String dataAdmissao,
			String regFunc)
	{
		// passa os argumentos para os parâmetros do construtor
		// da superclasse Pessoa
		super(nome, dataNascimento, rg, cpf, sexo);
		this.DataAdmissao = dataAdmissao;
		this.RegFunc = regFunc;
		this.Tipo = "Funcionário";
		cargo = "";
	}
	
	// métodos get e set
	public String getDataAdmissao() { return DataAdmissao; }
	public String getRegFunc() { return RegFunc; }
	public String getCargo() { return cargo; }
	
	public void setDataAdmissao(String dataAdmissao) { this.DataAdmissao = dataAdmissao; }
	public void setRegFunc(String regFunc) { this.RegFunc = regFunc; }
	
	// este método set lança uma exceção caso o valor de
	// cargo (properieda) seja setado como nulo ou uma 
	// string vazia
	public void setCargo(String cargo) throws Exception
	{
		if (cargo == null || cargo == "")
		{
			// método Exception da classe java.lang.Exception;
			// constrói uma nova exceção com a mensagem especificada
			throw new Exception("Campo obrigatório");
		}
		this.cargo = cargo;
	}
	
	// implementação do método abstrato salario() da 
	// superclasse Pessoa
	public float salario()
	{
		return 1000;
	}
	
	// sobrescrita do método toString da classe java.lang.Package
	public String toString()
	{
		return String.format("%sData de admissão: %s%nRegistro Funcional: %s%nCargo: %s",
				super.toString(),DataAdmissao, RegFunc, cargo);
	}
}