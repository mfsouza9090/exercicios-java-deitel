/* (M�ltiplos de 2 com um loop infinito) Escreva um aplicativo que 
 * continue exibindo na janela de comando os m�ltiplos do inteiro 2
 * � a saber, 2, 4, 8, 16, 32, 64 e assim por diante. Seu loop n�o 
 * deve terminar (isto �, deve criar um loop infinito). O que acontece
 *  quando voc� executa esse programa? */

public class Exercicio4_33 
{
	public static void main(String[] args)
	{
		int numero = 2;
		
		 while (numero > 0)
		 {
			 numero *= 2;
			 System.out.printf("M�ltiplo de 2: %d%n", numero);
		 }
	}
}

// R: Ap�s o valor m�ximo de uma vari�vel do tipo int ser alcan�ado
// e multiplicado por 2, o resultado produzido � um inteiro negativo.
// tal comportamento pode ser justificado pelo estouro aritm�tico, quando
// o resultado de uma opera��o aritm�tica � muito grande para ser armazenado
// em uma vari�vel do tipo int, produzindo assim um comportamento imprevis�vel