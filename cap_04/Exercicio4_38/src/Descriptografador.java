public class Descriptografador 
{
	public static int descriptografador(int dadoCriptografado)
	{
		int contador = 0;
		int digitosAlternados = 0;
		int multiploDeDez = 1000;
		int dadoOriginal = dadoCriptografado;
		int dadoDescriptografado = 0;
		
		while (contador < 2)
		{
			int resto = dadoOriginal % 100;
			digitosAlternados = digitosAlternados * 100 + resto;
			dadoOriginal /= 100;
			++contador;
		}
		
		System.out.println(digitosAlternados);
		
		contador = 0;
		
		// o procedimento � semelhante ao estabelecido
		// no m�todo criptografador da classe Criptografador;
		// a �nica diferen�a � a opera��o matem�tica para 
		// reestabelecer o valor dos d�gitos originais
		while (contador < 4)
		{
			int digitoUnico;
			
			digitoUnico = digitosAlternados / multiploDeDez;
			digitosAlternados %= multiploDeDez;
			// os d�gitos isolados 7, 8 e 9 produzem os resultados 10, 11 e 12, 
			// que, sem a opera��o m�dulo, geram distor��o no valor final
			// do dado descriptografado. o bloco abaixo garante que o valor final
			// do dado descriptografado seja leg�timo
			if (digitoUnico > 6 || digitoUnico < 10 )
			{
				dadoDescriptografado += ((digitoUnico - 7 + 10) % 10) * multiploDeDez;
			}
			else 
			{
				dadoDescriptografado += (digitoUnico - 7 + 10) * multiploDeDez;
			}
			
			multiploDeDez /= 10;
			++contador;
			System.out.println(dadoDescriptografado);
		} 
		
		return dadoDescriptografado;
	}
}