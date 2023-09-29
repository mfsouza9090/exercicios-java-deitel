import java.util.*;

//classe abstrata. não instancia objetos. classe base para
// outras classes, que herdarão suas propriedades e métodos.
// pode conter métodos abstratos e comuns
public abstract class Pessoa 
{
	// propriedades 
	private String Nome;
	private String DataNascimento;
	private String Rg;
	private String Cpf;
	private char Sexo;
	protected String Tipo;
				
	// método construtor. inicializa as variáveis de instância
	// (propriedades) a partir dos argumentos passados para os
	// parâmetros
	public Pessoa(String nome, String dataNascimento, String rg, 
			String cpf, char sexo)
	{
		this.Tipo = "";
		this.Nome = nome;
		this.DataNascimento = dataNascimento;
		this.Rg = rg;
		this.Cpf = cpf;
		this.Sexo = sexo;
	}
				
	// métodos get e set. encapsulamento (controle de acesso
	// e modificação)
	public String getNome() { return Nome; }
	public String getDataNascimento() { return DataNascimento; }
	public String getRg() { return Rg; }
	public String getCpf() { return Cpf; }
	public char getSexo() { return Sexo; }
	public String getTipo() { return Tipo; }
				
	public void setNome(String nome) { this.Nome = nome; }
	public void setDataNascimento(String dataNascimento) { this.DataNascimento = dataNascimento; }
	public void setRg(String rg) { this.Rg = rg; }
	public void setCpf(String cpf) { this.Cpf = cpf; }
	public void setSexo(char sexo) { this.Sexo = sexo; }
	public void setTipo(String tipo) { this.Tipo = tipo; }
				
	// método abstrato. obriga todos os objetos de classes oriundas
	// de Pessoas a ter um método salario()
	public abstract float salario();
				
	// cria uma lista vazia
	List<String> telefones = new ArrayList<>();
				
	public void AddTel(String tel)
	{
		telefones.add(tel);
	}
				
	// formata e retorna a lista em que os telefones foram 
	// adicionados
	public String ListaTel()
	{
		StringBuilder ret = new StringBuilder();
		for (String tel : telefones)
		{
			ret.append(tel);
			ret.append("\n");
		}
			return ret.toString();
	}
				
	// sobrescrita do método toString() da classe java.lang.Package
	public String toString()
	{
		return String.format("Nome: %s%nNascimento: %s%nRG: %s%nCPF: %s%nSexo: %s%n",
					Nome, DataNascimento, Rg, Cpf, Sexo);
	}
}