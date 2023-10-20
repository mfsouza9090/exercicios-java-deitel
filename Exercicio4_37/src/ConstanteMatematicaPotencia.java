
public class ConstanteMatematicaPotencia 
{
	public static double calculaConstantePotencia(int termos)
	{
		
		int x = 2;
		double ex = 1 + x;
		int contador = 1;
		
		while (contador < termos)
		{
			int fatorial = Fatorial.calculaFatorial(contador);
			
			ex += x * x / (double) fatorial;
		}
		
		return 0;
	}
}
