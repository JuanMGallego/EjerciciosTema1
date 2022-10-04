package ejerciciostema1;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ticketChild; //Variable declared and used to introduce the number of child tickets the user wants to buy
		int ticketAdult; //Variable declared and used to introduce the number of adult tickets the user wants to buy
		double price; //Variable declared and used to store the price before the discount
		double finalPrice; //Variable declared and used to store the price with/without the discount
		
		final double CHILD_PRICE = 15.50; //Constant used to apply the price of child tickets
		final double ADULT_PRICE = 20; //Constant used to apply the price of adult tickets
		final double DISCOUNT = 0.95; //Constant used to apply the discount
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		System.out.print("Introduza el número de entradas para niños que desea: "); //Printed line to inform the user where he/she has to put the number of child tickets
		ticketChild = sc.nextInt(); //Scanner asks for child tickets, so it opens a space to let the user introduce it
		
		System.out.print("Introduza el número de entradas para adultos que desea: "); //Printed line to inform the user where he/she has to put the number of adult tickets
		ticketAdult = sc.nextInt(); //Scanner asks for adult tickets, so it opens a space to let the user introduce it
		System.out.println(); //Blank line for a more visual interface
		
		price = ticketChild * CHILD_PRICE + ticketAdult * ADULT_PRICE; //Price calculated before the discount
		
		finalPrice = price >= 100 ? price * DISCOUNT : price; //If the price is over 100 the discount will be applied, if not, the final price will be the same as before
		
		System.out.printf("El precio final es de %.2f euros.", finalPrice); //Final price is printed and it will only show the two first decimals
		
		sc.close(); //Scanner is closed
		
	}

}
