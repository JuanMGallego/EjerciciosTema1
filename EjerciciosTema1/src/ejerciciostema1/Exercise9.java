package ejerciciostema1;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1; //Variable declared and used to introduce the first number
		int num2; //Variable declared and used to introduce the second number
		boolean result; //Variable declared to store the result of the ternary operator
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		System.out.print("Introduzca un número: "); //Printed line to inform the user where he/she has to put the first number
		num1 = sc.nextInt(); //Scanner asks for the first number, so it opens a space to let the user introduce it
		
		System.out.print("Introduzca otro número: "); //Printed line to inform the user where he/she has to put the second number
		num2 = sc.nextInt(); //Scanner asks for the second number, so it opens a space to let the user introduce it
		System.out.println(); //Blank line for a more visual interface
		
		result = num1 == num2 ? true : false; //Ternary operator used to know if the numbers are the same
		
		System.out.println("¿Son iguales los números?: " + result); //Final result is printed and showed to the user 
		
		sc.close(); //Scanner is closed
		
	}

}
