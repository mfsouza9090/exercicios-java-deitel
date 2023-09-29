
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
		// passa os argumentos para os par�metros do construtor
		// da superclasse Pessoa
		super(nome, dataNascimento, rg, cpf, sexo);
		this.DataAdmissao = dataAdmissao;
		this.RegFunc = regFunc;
		this.Tipo = "Funcion�rio";
		cargo = "";
	}
	
	// m�todos get e set
	public String getDataAdmissao() { return DataAdmissao; }
	public String getRegFunc() { return RegFunc; }
	public String getCargo() { return cargo; }
	
	public void setDataAdmissao(String dataAdmissao) { this.DataAdmissao = dataAdmissao; }
	public void setRegFunc(String regFunc) { this.RegFunc = regFunc; }
	
	// este m�todo set lan�a uma exce��o caso o valor de
	// cargo (properieda) seja setado como nulo ou uma 
	// string vazia
	public void setCargo(String cargo) throws Exception
	{
		if (cargo == null || cargo == "")
		{
			// m�todo Exception da classe java.lang.Exception;
			// constr�i uma nova exce��o com a mensagem especificada
			throw new Exception("Campo obrigat�rio");
		}
		this.cargo = cargo;
	}
	
	// implementa��o do m�todo abstrato salario() da 
	// superclasse Pessoa
	public float salario()
	{
		return 1000;
	}
	
	// sobrescrita do m�todo toString da classe java.lang.Package
	public String toString()
	{
		return String.format("%sData de admiss�o: %s%nRegistro Funcional: %s%nCargo: %s",
				super.toString(),DataAdmissao, RegFunc, cargo);
	}
}