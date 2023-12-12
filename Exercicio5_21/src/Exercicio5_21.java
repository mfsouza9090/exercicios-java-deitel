/* (Triplos de Pitágoras) Um triângulo retângulo pode ter lados 
 * cujos comprimentos são todos inteiros. O conjunto de três 
 * valores inteiros para os comprimentos dos lados de um triângulo 
 * retângulo é chamado de triplo de Pitágoras. Os comprimentos dos 
 * três lados devem satisfazer a relação de que a soma dos quadrados 
 * de dois dos lados é igual ao quadrado da hipotenusa. Escreva um 
 * aplicativo para exibir uma tabela dos triplos de Pitágoras para 
 * side1, side2 e hypotenuse, todos não maiores que 500. Utilize um 
 * loop for triplamente aninhado que tenta todas as possibilidades. 
 * Esse é um método de computação de “força bruta”. Você aprenderá 
 * nos cursos de ciência da computação mais avançados que para muitos 
 * problemas interessantes não há uma abordagem algorítmica conhecida 
 * além do uso de força bruta absoluta. */ 

import java.lang.Math;

public class Exercicio5_21 {

	public static void main(String[] args) {
		System.out.println("+----------------------------+");
		System.out.printf("|     %19s    |%n", "Ternos Pitagóricos");
		System.out.println("+----------------------------+");
		System.out.printf("| %5s | %5s | %10s |%n", "side1", "side2", "hypotenuse");
		System.out.println("+----------------------------+");
		
		// as três variáveis de controle são do tipo double para
		// que seja possível usar Math.pow
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
