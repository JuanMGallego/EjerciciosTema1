package ejerciciostema1;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1; //Variable declared and used to introduce the first number by the user
		int num2; //Variable declared and used to introduce the second number by the user
		int need; //Variable declared and used to be printed at the end
		int auxNeed; //Variable declared and used to be the number needed to add it to the asked one to be multiplier of num2
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		System.out.print("Introduzca un número como múltiplo: "); //Printed line to inform the user which data he/she has to introduce and where
		num2 = sc.nextInt(); //Scanner asks for a number, so it opens a space to let the user introduce the number
		
		System.out.print("Introduzca un número para comprobar si es múltiplo de " + num2 +": "); //Printed line to inform the user which data he/she has to introduce and where
		num1 = sc.nextInt(); //Scanner asks for a number to be checked, so it opens a space to let the user introduce the number
		System.out.println();//Blank line for a more visual interface
		
		auxNeed = num2 - (num1 % num2); //The rest is subtracted from num2 to know the distance to be multiplier of num2
		
		need = (num1 % num2) == 0 ? 0 : auxNeed; //In case the user introduce a multiplier of num2, the program will show a distance of 0 instead of num2.
		need = num1 == 0 ? num2 : need; //In case the user introduce "0", the distance will be -num2, and to prevent this, if the program detect it it will show it positively.
		
		System.out.println("A " + num1 + " hace falta sumarle " + need + " para ser múltiplo de " + num2); //The result will be showed together with the numbers that the user has introduced.

		sc.close(); //Scanner is closed
		
	}

}
