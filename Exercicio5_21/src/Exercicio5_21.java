/* (Triplos de Pit�goras) Um tri�ngulo ret�ngulo pode ter lados 
 * cujos comprimentos s�o todos inteiros. O conjunto de tr�s 
 * valores inteiros para os comprimentos dos lados de um tri�ngulo 
 * ret�ngulo � chamado de triplo de Pit�goras. Os comprimentos dos 
 * tr�s lados devem satisfazer a rela��o de que a soma dos quadrados 
 * de dois dos lados � igual ao quadrado da hipotenusa. Escreva um 
 * aplicativo para exibir uma tabela dos triplos de Pit�goras para 
 * side1, side2 e hypotenuse, todos n�o maiores que 500. Utilize um 
 * loop for triplamente aninhado que tenta todas as possibilidades. 
 * Esse � um m�todo de computa��o de �for�a bruta�. Voc� aprender� 
 * nos cursos de ci�ncia da computa��o mais avan�ados que para muitos 
 * problemas interessantes n�o h� uma abordagem algor�tmica conhecida 
 * al�m do uso de for�a bruta absoluta. */ 

import java.lang.Math;

public class Exercicio5_21 {

	public static void main(String[] args) {
		System.out.println("+----------------------------+");
		System.out.printf("|     %19s    |%n", "Ternos Pitag�ricos");
		System.out.println("+----------------------------+");
		System.out.printf("| %5s | %5s | %10s |%n", "side1", "side2", "hypotenuse");
		System.out.println("+----------------------------+");
		
		// as tr�s vari�veis de controle s�o do tipo double para
		// que seja poss�vel usar Math.pow
		for (double side1 = 1; side1 <=500; side1++) {
			for (double side2 = 1; side2 <= 500; side2++) {
				for (double hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
					// se a soma dos quadrados dos catetos for igual ao quadrado
					// da hipotenusa, mostrar o conjunto na tablea
					if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(hypotenuse, 2)) {
						System.out.printf("|  %3.0f  | %5.0f | %10.0f |", side1, side2, hypotenuse);
						System.out.println();
					}
				}
			}
		}
		
		System.out.println("+----------------------------+");
	}

}
