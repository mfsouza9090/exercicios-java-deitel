
public class Descriptografador 
{
	public static int descriptografador (int dadoCriptografado)
	{
		int contador = 0;
		int digitosAlternados = 0;
		
		while (contador < 2)
		{
			int resto = dadoCriptografado % 100;
			digitosAlternados = digitosAlternados * 100 + resto;
			dadoCriptografado /= 100;
			++contador;
		}
		
		return digitosAlternados;
	}
}
