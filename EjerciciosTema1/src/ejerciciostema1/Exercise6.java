package ejerciciostema1;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int seconds; //Variable declared and used to introduce the number of seconds the user wants to transform
		int minutes; //Variable used to store the minutes calculated
		int hours; //Variable used to store the hours calculated

		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables

		System.out.print("Introduce una cantidad de segnudos: "); //Printed line to inform the user where he/she has to put the seconds
		seconds = sc.nextInt(); //Scanner asks for seconds, so it opens a space to let the user introduce it
		System.out.println(); //Blank line for a more visual interface

		hours = seconds / 3600; //dividing the seconds by 3600 will give us the hours
		minutes = (seconds % 3600) / 60; //obtaining the rest of the previous operation will give us the rest of the seconds that can't reach to be an hour, so dividing them by 60 will give us the minutes
		seconds = seconds % 60; //to obtain the seconds without creating another variable, we wait until the end to not interfere in the other operations and only having to take the rest of the minutes operation
		
		System.out.println("En total serían " + hours + " horas " + minutes + " minutos y " + seconds + " segundos"); //The final result will be printed and showed to the user
		
		sc.close(); //Scanner is closed
		
	}

}
