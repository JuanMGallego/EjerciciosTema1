package ejerciciostema1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num; //Variable declared and used to introduce the real number by the user
		double roundedNum; //Variable declared and used to be the number first with 0.5 more and then to be casted to int
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		System.out.print("Introduzca un número con decimales para ser redondeado: "); //Printed line to inform the user which data he/she has to introduce and where
		num = sc.nextDouble(); //Scanner asks for a number to be rounded, so it opens a space to let the user introduce the number
		System.out.println(); //Blank line for a more visual interface
		
		roundedNum = num + 0.5; //0.5 is added to the number entered by the user into the roundedNum variable
		
		System.out.println("Su número redondeado a entero es: " + (int)roundedNum); //Final printed line where the final number is casted to an integer
		
		sc.close(); //Scanner is closed
		
	}

}
