/* (Múltiplos de 2 com um loop infinito) Escreva um aplicativo que 
 * continue exibindo na janela de comando os múltiplos do inteiro 2
 * — a saber, 2, 4, 8, 16, 32, 64 e assim por diante. Seu loop não 
 * deve terminar (isto é, deve criar um loop infinito). O que acontece
 *  quando você executa esse programa? */

public class Exercicio4_33 
{
	public static void main(String[] args)
	{
		int numero = 2;
		
		 while (numero > 0)
		 {
			 numero *= 2;
			 System.out.printf("Múltiplo de 2: %d%n", numero);
		 }
	}
}

// R: Após o valor máximo de uma variável do tipo int ser alcançado
// e multiplicado por 2, o resultado produzido é um inteiro negativo.
// tal comportamento pode ser justificado pelo estouro aritmético, quando
// o resultado de uma operação aritmética é muito grande para ser armazenado
// em uma variável do tipo int, produzindo assim um comportamento imprevisível