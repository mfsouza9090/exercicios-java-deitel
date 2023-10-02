/* (O que há de errado com esse código?) O que há de errado com a 
 * seguinte instrução? Forneça a instrução correta para adicionar 
 * 1 à soma de x e y.
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

// R: É necessário relacionar o operador de incremento pré-fixo
// à variável x, de modo que seu novo valor (obtido após o incremento)
// já seja usado na operação aritmética corrente