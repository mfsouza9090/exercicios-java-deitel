
public class Aluno extends Pessoa 
{
	private String Ra;
	private String Curso;
	
	// m�todo construtor da subclasse classe Aluno
	public Aluno (String nome, String dataNascimento, String rg,
			String cpf, char sexo, String ra, String curso)
	{
		super(nome, dataNascimento, rg, cpf, sexo);
		this.Ra = ra;
		this.Curso = curso;
		this.Tipo = "Aluno";
	}
	
	// m�todos get e set
	public String getRa() { return Ra; }
	public String getCurso() { return Curso; }
	
	public void setRa(String ra) { this.Ra = ra; }
	public void setCurso(String curso) { this.Curso = curso; }
	
	// implementa��o do m�todo abstrato salario() da 
	// superclasse pessoa
	public float salario()
	{
		return 100;
	}

	// sobrescrita do m�todo toString da classe 
	// java.lang.Package
	public String toString()
	{
		return String.format(super.toString(), 
				"RA: %s%nCurso: %s%n",
				Ra, Curso);
	}
}