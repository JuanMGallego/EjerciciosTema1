package ejerciciostema1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num; //Variable declared and used to introduce the number by the user
		int need; //Variable declared and used to be printed at the end
		int auxNeed; //Variable declared and used to be the number needed to add it to the asked one to be multiplier of 7

		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables

		System.out.print("Introduzca un número para comprobar si es múltiplo de 7: "); //Printed line to inform the user which data he/she has to introduce and where
		num = sc.nextInt(); //Scanner asks for a number to be checked, so it opens a space to let the user introduce the number
		System.out.println(); //Blank line for a more visual interface

		auxNeed = 7 - (num % 7); //The rest is subtracted from 7 to know the distance to be multiplier of 7

		need = auxNeed == -7 ? 7 : auxNeed; //In case the user introduce "0", the distance will be -7, and to prevent this, if the program detect it it will show it positively.
		need = (num % 7) == 0 ? 0 : auxNeed; //In case the user introduce a multiplier of 7, the program will show a distance of 0 instead of 7.

		System.out.println("A " + num + " hace falta sumarle " + need + " para ser múltiplo de 7"); //The result will be showed together with the number that the user has introduced.

		sc.close(); //Scanner is closed

	}

}
