package ejerciciostema1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double lenghtMet; //Variable declared and used to introduce the length in meters
		int lenghtCent; //Variable declared and used to store the length in centimeters and casted to an integer
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		System.out.print("Introduzca su longitud en metros: "); //Printed line to inform the user where he/she has to put the length in meters
		lenghtMet = sc.nextDouble();//Scanner asks for the length in meters, so it opens a space to let the user introduce it
		System.out.println(); //Blank line for a more visual interface
		
		lenghtCent = (int) (lenghtMet * 100); //length is transformed into centimeters and casted to an integer
		
		System.out.println("La longitud del lanzamiento en centímetros(teniendo solo la parte entera) es de " + lenghtCent + " cm"); //Final result is printed and showed to the user 
		
		sc.close(); //Scanner is closed
		
	}

}
