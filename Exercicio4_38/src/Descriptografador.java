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
		
		contador = 0;
		
		// o procedimento é semelhante ao estabelecido
		// no método criptografador da classe Criptografador;
		// a única diferença é a operação matemática para 
		// reestabelecer o valor dos dígitos originais
		while (contador < 4)
		{
			int digitoUnico;
			
			digitoUnico = digitosAlternados / multiploDeDez;
			digitosAlternados %= multiploDeDez;
			dadoDescriptografado += (digitoUnico - 7 + 10) * multiploDeDez;
			multiploDeDez /= 10;
			++contador;
		} 
		
		return dadoDescriptografado;
	}
}