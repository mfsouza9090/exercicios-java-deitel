/* (O que h� de errado com esse c�digo?) O que h� de errado com a 
 * seguinte instru��o? Forne�a a instru��o correta para adicionar 
 * 1 � soma de x e y.
 * 
 * System.out.println(++(x + y)); */

public class Exercicio4_34 
{
	public static void main(String[] args) 
	{
		int x = 1;
		int y = 1;
		
		System.out.println((++x + y));
	}
}

// R: � necess�rio relacionar o operador de incremento pr�-fixo
// � vari�vel x, de modo que seu novo valor (obtido ap�s o incremento)
// j� seja usado na opera��o aritm�tica corrente