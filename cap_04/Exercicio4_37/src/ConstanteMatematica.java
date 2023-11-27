// Exercício B:

public class ConstanteMatematica 
{
	public static double calculaConstante(int termos)
	{
		double e = 1;
		int contador = 1;
		
		while (contador <= termos)
		{
			e += 1 / (double) Fatorial.calculaFatorial(contador);;
			++contador;
		}
		
		return e;
	}
}
