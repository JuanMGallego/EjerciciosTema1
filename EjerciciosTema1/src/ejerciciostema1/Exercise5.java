package ejerciciostema1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a; //Variable declared and used to introduce the 'a' variable of the polynomial by the user
		double b; //Variable declared and used to introduce the 'b' variable of the polynomial by the user
		double c; //Variable declared and used to introduce the 'c' variable of the polynomial by the user
		double x; //Variable declared and used to introduce the 'x' variable of the polynomial by the user
		double y; //Variable declared and used to store the polynomial result

		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables

		System.out.println("PROGRAMA PARA DESPEJAR 'Y' DEL POLINOMIO: y=ax^2+bx+c"); //title
		System.out.println(); //Blank line for a more visual interface

		System.out.print("Introduzca el valor de 'a': "); //Printed line to inform the user which data he/she has to introduce and where
		a = sc.nextDouble(); //Scanner asks for a number, so it opens a space to let the user introduce it

		System.out.print("Introduzca el valor de 'b': "); //Printed line to inform the user which data he/she has to introduce and where
		b = sc.nextDouble(); //Scanner asks for a number, so it opens a space to let the user introduce it

		System.out.print("Introduzca el valor de 'c': "); //Printed line to inform the user which data he/she has to introduce and where
		c = sc.nextDouble(); //Scanner asks for a number, so it opens a space to let the user introduce it

		System.out.print("Introduzca el valor de 'x': "); //Printed line to inform the user which data he/she has to introduce and where
		x = sc.nextDouble(); //Scanner asks for a number, so it opens a space to let the user introduce it
		System.out.println(); //Blank line for a more visual interface

		y = a * (x * x) + b * x + c; //Equation to calculate 'y' in the polynomial
		
		System.out.println("El valor de y es: " + y); //Final result is printed
		
		sc.close(); //Scanner is closed

	}

}
