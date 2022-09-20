package com.brandon.JavaAssignment3;

//import java.util.Scanner;

public class WashingMachine {

	public static void switchON() {
		System.out.println("Washing machine is on.");
	}

	public static void acceptClothes(int noOfClothes) {
		System.out.println("You are washing " + noOfClothes + " items.");
	}

	public static void acceptDetergent() {
		System.out.println("Please add detergent.");
	}

	public static void switchOFF() {
		System.out.println("Wash complete, machine switching off now.");
	}

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);

		switchON();

		System.out.println("Please enter the number of clothing items to wash: ");
		int noOfClothes = sc.nextInt();
		acceptClothes(noOfClothes);

		acceptDetergent();

		switchOFF();

		sc.close(); */

	}

}
