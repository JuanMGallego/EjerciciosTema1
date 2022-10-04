package ejerciciostema1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double mm; //Variable declared and used to introduce the number of millimeters the user wants to transform
		double cm; //Variable declared and used to introduce the number of centimeters the user wants to transform
		double m; //Variable declared and used to introduce the number of meters the user wants to transform
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		System.out.print("Introduce una distancia en milímetros: "); //Printed line to inform the user where he/she has to put the millimeters
		mm = sc.nextInt(); //Scanner asks for millimeters, so it opens a space to let the user introduce it
		
		System.out.println("Introduce una distancia en centímetros: "); //Printed line to inform the user where he/she has to put the centimeters
		cm = sc.nextInt(); //Scanner asks for centimeters, so it opens a space to let the user introduce it
		
		System.out.println("Introduce una distancia en centímetros: "); //Printed line to inform the user where he/she has to put the meters
		m = sc.nextInt(); //Scanner asks for meters, so it opens a space to let the user introduce it
		System.out.println(); //Blank line for a more visual interface
		
		mm = mm * 10; //millimeters are converted into centimeters
		m = m * 0.01; //meters are converted into centimeters
		
		cm = cm + mm + m; //total centimeters are calculated
		
		System.out.println("En total son " + cm + "centímetros"); //Final result is printed and showed to the user
		
		sc.close(); //Scanner is closed
		
	}

}
