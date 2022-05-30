package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch01 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	try {	 
	String vect [] = sc.nextLine().split("");
	int position = sc.nextInt();
	System.out.println(vect[position]);
	
	}
	catch (InputMismatchException a) {
		System.out.println("Invaled Position");
	}
	catch (ArrayIndexOutOfBoundsException a) {
		System.out.println("Input Erro");
	}
	System.out.println("End of program");
	
	
		sc.close();
	}

}
