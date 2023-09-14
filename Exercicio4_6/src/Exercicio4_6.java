
public class Exercicio4_6 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int x = 0;
		
		while (x <= 9)
		{
			++x;
			sum += x;
		}
		
		System.out.printf("A soma é: %d%n", sum);
	}
}