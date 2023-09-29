import java.util.*;

public class ProjetoPessoa 
{
	public static void main(String[] args) 
	{
		Professor p1 = new Professor("Carlos", "17/10/1990", 
				"32-910-304-0", "361.887.718-89", 'M', "231869", 
				"Biologia");
		
		Aluno a1 = new Aluno ("Joca", "17/10/1990", "32-910-304-0", 
				"361.887.718-89", 'M', "231869", 
				"Análise e Desenvolvimento de Sistemas");
		
		Funcionario f1 = new Funcionario("Zuenir", "17/10/1990", 
				"32-910-304-0", "361.887.718-89", 'M', "17/10/1990", 
				"231869");
		
		Noia n1 = new Noia("Nariz Platinado", "17/10/1990", "32-910-304-0", 
				"361.887.718-89", 'M');
		
		// instrução try: possibilita a definição de um
		// bloco de código para ser testado em busca de
		// erros enquanto está sendo executado
		// instrução catch: possibilita a definição de um
		// bloco de código para ser executado caso um erro
		// ocorra no bloco da instrução try.
		try
		{
			f1.setCargo("Zelador");
		}
		// "e" é uma referência a uma instância de Exception;
		// no caso, a Exception lançada pelo método setCargo(),
		// que lança uma exception
		catch(Exception e)
		{
			// printa a mensagem de erro estabelecida no método
			// setCargo()
			System.out.print(e);
		}
		
		// método AddTel() da superclasse Pessoa
		p1.AddTel("4057-2803");
		p1.AddTel("98622-6540");
		a1.AddTel("4098-2289");
		a1.AddTel("97400-9494");
		f1.AddTel("4078-4567");
		f1.AddTel("96543-9898");
		n1.AddTel("4034-6765");
		n1.AddTel("96787-5468");
		
		// lista do tipo Pessoa (superclasse); exemplo de
		// polimorfismo. Todas as subclasses descendem de
		// pessoa, por isso podem ser adicionadas a uma lista
		// do tipo Pessoa
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(p1);
		pessoas.add(a1);
		pessoas.add(f1);
		pessoas.add(n1);
		
		for (Pessoa pessoa : pessoas)
		{
			System.out.println(pessoa.toString());
			System.out.printf("Salário: %.2f%n", pessoa.salario());
			System.out.println(pessoa.ListaTel());
		}	
	}
}