// Exercício C:

public class ConstanteMatematicaPotencia 
{
	public static double calculaConstantePotencia(int base, int termos)
	{	
		double ex = 1 + base;
		double acumulador = base;
		int contador = 2;
		int contadorAuxiliar = 1;
		
		while (contador <= termos)
		{	
			while (contadorAuxiliar > 0)
			{
				acumulador *= base;
				--contadorAuxiliar;
			}
	
			ex += acumulador / (double) Fatorial.calculaFatorial(contador);
			++contador;
			++contadorAuxiliar;
		}
		
		return ex;
	}
}