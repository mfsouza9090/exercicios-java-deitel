/* (A canção “The Twelve Days of Christmas”) Escreva um aplicativo 
 * que utiliza instruções de repetição e switch para imprimir a canção 
 * “The Twelve Days of Christmas”. Uma instrução switch deve ser 
 * utilizada para imprimir o dia (“primeiro”, “segundo” etc.). Uma instrução 
 * switch separada deve ser utilizada para imprimir o restante de cada verso. 
 * Visite o site en.wikipedia.org/wiki/The_Twelve_Days_of_Christmas_(song) 
 * para obter a letra da música. */ 

public class Exercicio5_29 {

	public static void main(String[] args) {
		int dias = 1;
		
		while (dias <= 12)
		{
			switch (dias) {
			case 1:
				System.out.println("On the first day of Christmas,");
				break;
			case 2:
				System.out.println("On the second day of Christmas,");
				break;
			case 3:
				System.out.println("On the third day of Christmas,");
				break;
			case 4:
				System.out.println("On the fourth day of Christmas,");
			    break;
			case 5:
				System.out.println("On the fifth day of Christmas,");
				break;
			case 6:
				System.out.println("On the sixth day of Christmas,");
				break;
			case 7:
				System.out.println("On the seventh day of Christmas,");
			    break;
			case 8:
				System.out.println("On the eighth day of Christmas,");
				break;
			case 9:
				System.out.println("On the ninth day of Christmas,");
				break;
			case 10:
				System.out.println("On the tenth day of Christmas,");
				break;
			case 11:
				System.out.println("On the eleventh day of Christmas,");
				break;
			case 12:
				System.out.println("On the twelfth day of Christmas,");
			}
			
			switch (dias) {
			case 1:
				System.out.println("my true love gave to me\n"
						         + "A partridge in a pear tree.\n");
				dias++;
				break;
			case 2:
				System.out.println("my true love gave to me\n"
						         + "Two turtle doves,\n"
						         + "And a partridge in a pear tree.\n");
				dias++;
				break;
			case 3:
				System.out.println("my true love gave to me\n"
						         + "Three French hens,\n"
						         + "Two turtle doves,\n"
						         + "And a partridge in a pear tree.\n");
				dias++;
				break;
			case 4:
				System.out.println("my true love gave to me\n"
						         + "Four calling birds,\n"
						         + "Three French hens,\n"
						         + "Two turtle doves,\n"
						         + "And a partridge in a pear tree.\n");
				dias++;
			    break;
			case 5:
				System.out.println("my true love gave to me\n"
				                 + "Five golden rings,\n"
				                 + "Four calling birds,\n"
				                 + "Three French hens,\n"
				                 + "Two turtle doves,\n"
				                 + "And a partridge in a pear tree.\n");
				dias++;
				break;
			case 6:
				System.out.println("my true love gave to me\n"
						         + "Six geese a-laying,\n"
		                         + "Five golden rings,\n"
		                         + "Four calling birds,\n"
		                         + "Three French hens,\n"
		                         + "Two turtle doves,\n"
		                         + "And a partridge in a pear tree.\n");
				dias++;
				break;
			case 7:
				System.out.println("my true love gave to me\n"
								 + "Seven swans a-swimming,\n"
				          		 + "Six geese a-laying,\n"
				          		 + "Five golden rings,\n"
				          		 + "Four calling birds,\n"
				          		 + "Three French hens,\n"
				          		 + "Two turtle doves,\n"
				          		 + "And a partridge in a pear tree.\n");
				dias++;
			    break;
			case 8:
				System.out.println("my true love gave to me\n"
								 + "Eight maids a-milking,\n"
						 		 + "Seven swans a-swimming,\n"
						 		 + "Six geese a-laying,\n"
						 		 + "Five golden rings,\n"
						 		 + "Four calling birds,\n"
						 		 + "Three French hens,\n"
						 		 + "Two turtle doves,\n"
						 		 + "And a partridge in a pear tree.\n");
				dias++;
				break;
			case 9:
				System.out.println("my true love gave to me\n"
						 		 + "Nine ladies dancing,\n"
							     + "Eight maids a-milking,\n"
							     + "Seven swans a-swimming,\n"
							     + "Six geese a-laying,\n"
							     + "Five golden rings,\n"
							     + "Four calling birds,\n"
							     + "Three French hens,\n"
							     + "Two turtle doves,\n"
							     + "And a partridge in a pear tree.\n");
				dias++;
				break;
			case 10:
				System.out.println("my true love gave to me\n"
						         + "Ten lords a-leaping,\n"
				 		 		 + "Nine ladies dancing,\n"
				 		 		 + "Eight maids a-milking,\n"
				 		 		 + "Seven swans a-swimming,\n"
				 		 		 + "Six geese a-laying,\n"
				 		 		 + "Five golden rings,\n"
				 		 		 + "Four calling birds,\n"
				 		 		 + "Three French hens,\n"
				 		 		 + "Two turtle doves,\n"
				 		 		 + "And a partridge in a pear tree.\n");
				dias++;
				break;
			case 11:
				System.out.println("my true love gave to me\n"
						         + "Eleven pipers piping,\n"
				          	     + "Ten lords a-leaping,\n"
				          	     + "Nine ladies dancing,\n"
				          	     + "Eight maids a-milking,\n"
				          	     + "Seven swans a-swimming,\n"
				          	     + "Six geese a-laying,\n"
				          	     + "Five golden rings,\n"
				          	     + "Four calling birds,\n"
				          	     + "Three French hens,\n"
				          	     + "Two turtle doves,\n"
				          	     + "And a partridge in a pear tree.\n");
				dias++;
				break;
			case 12:
				System.out.println("my true love gave to me\n"
								 + "Twelve drummers drumming,\n"
				          	     + "Eleven pipers piping,\n"
				          	     + "Ten lords a-leaping,\n"
				          	     + "Nine ladies dancing,\n"
				          	     + "Eight maids a-milking,\n"
				          	     + "Seven swans a-swimming,\n"
				          	     + "Six geese a-laying,\n"
				          	     + "Five golden rings,\n"
				          	     + "Four calling birds,\n"
				          	     + "Three French hens,\n"
				          	     + "Two turtle doves,\n"
				          	     + "And a partridge in a pear tree.");
				dias++;
			}	
		}
	}

}
