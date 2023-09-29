
public class ProjetoPessoa 
{
	public static void main(String[] args) 
	{
		Professor p1 = new Professor("Carlos", "17/10/1990", "32-910-304-0", 
				"361.887.718-89", 'M', "231869", "Biologia");
		
		Funcionario f1 = new Funcionario("Carlos", "17/10/1990", "32-910-304-0", 
				"361.887.718-89", 'M', "17/10/1990", "231869");
		
		try
		{
			f1.setCargo("Maconheiro de plantão");
		}
		catch(Exception e)
		{
			System.out.print(e);
		}	
		
		System.out.print(f1.getCargo());
	}
}
