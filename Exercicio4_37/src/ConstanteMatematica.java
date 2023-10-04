
public class ConstanteMatematica 
{
	public static double calculaConstante(int termos)
	{
		double e = 1;
		int contador = 1;
		
		while (contador <= termos)
		{
			int fatorial = Fatorial.retornaFatorial(contador);
			e += 1 / (double) fatorial;
			++contador;
		}
		
		return e;
	}
}
