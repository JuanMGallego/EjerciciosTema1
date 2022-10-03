package ejerciciostema1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num; //Variable declared and used to introduce the number by the user
		int need; //Variable declared and used to be printed at the end
		int auxNeed; //Variable declared and used to be the number needed to add it to the asked one to be multiplier of 7

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un número para comprobar si es múltiplo de 7: ");
		num = sc.nextInt();
		System.out.println();

		auxNeed = 7 - (num % 7);

		need = auxNeed == -7 ? 7 : auxNeed;
		need = (num % 7) == 0 ? 0 : auxNeed;

		System.out.println("A " + num + " hace falta sumarle " + need + " para ser múltiplo de 7");

		sc.close();

	}

}
