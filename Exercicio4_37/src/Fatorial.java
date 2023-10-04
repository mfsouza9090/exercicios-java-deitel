// Exercício A: 

public class Fatorial 
{
	public static int calculaFatorial(int inteiroPositivo)
	{
		int decrementador = inteiroPositivo;
		
		while (decrementador > 1)
		{
			inteiroPositivo = inteiroPositivo * (decrementador - 1);
			--decrementador;
		}
		
		return inteiroPositivo;
	}
}
