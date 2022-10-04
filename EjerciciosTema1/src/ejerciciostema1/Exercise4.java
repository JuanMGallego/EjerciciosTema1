package ejerciciostema1;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double base; //Variable declared and used to introduce triangle's base by the user
		double height; //Variable declared and used to introduce triangle's height by the user
		double area; //Variable declared and used to store area's result
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		System.out.print("Introduzca la base del triángulo: "); //Printed line to inform the user which data he/she has to introduce and where
		base = sc.nextDouble(); //Scanner asks for a number, so it opens a space to let the user introduce it
		
		System.out.println("Introduzca la altura del triánulo: "); //Printed line to inform the user which data he/she has to introduce and where
		height = sc.nextDouble(); //Scanner asks for a number, so it opens a space to let the user introduce it
		System.out.println(); //Blank line for a more visual interface
		
		area = base * height / 2; //area is calculated using the triangle area's formula
		
		System.out.println("El área del tríangulo es de " + area + " u^2"); //Final result is printed
		
		sc.close(); //Scanner is closed
		
	}

}
