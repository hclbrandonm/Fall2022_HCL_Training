package com.brandon.JavaAssignment2;

import java.util.Scanner;

public class Loops {

	// Prints User Number in Words
	public static void printNum(int x) {
		System.out.print("The number entered is: ");
		switch (x) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 10:
			System.out.println("Ten");
			break;
		}
	}

	// Printing even numbers
	public static void printEven() {
		System.out.println("Printing even numbers between 1 and 100: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i < 100) {
				System.out.print(i + ",");
			} else if (i == 100) {
				System.out.print(i);
			}
		}
	}

	// Prints 1-5, 5 times using nested for loops
	public static void nestedFor() {
		System.out.println("\n");
		System.out.println("Printing 1-5, 5 times:");
		for (int i = 1; i <= 5; i++) {
			if (i > 1) {
				System.out.print(",");
			}
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);

			}
		}
	}

	// Prints 1-25 using while loop
	public static void whileLoop() {
		System.out.print("\n\n");
		System.out.println("Printing 1-25: ");
		int i = 1;
		while (i < 26) {
			System.out.print(i + ",");
			i++;
		}
	}

	// Prints odd nums between 50-100 using do while loop
	public static void oddNum() {
		System.out.println("\n");
		System.out.println("Printing odd numbers between 50 and 100: ");
		int i = 50;
		do {
			if (i % 2 != 0) {
				System.out.print(i + ",");
			}
			i++;
		} while (i <= 100);
	}

	// Checks prime numbers between 1 and 100
	public static boolean primeNum(int i) {
		boolean check = true;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				check = false;
				return check;
			}
		}
		return check;
	}

	// Prints prime numbers
	public static void printPrime() {
		System.out.println("\n");
		System.out.println("Printing prime numbers between 1 and 100: ");
		for (int i = 2; i < 100; i++) {
			if (primeNum(i) == true) {
				System.out.print(i);
				System.out.print(",");
			}
		}
	}

	// Prints odd numbers using continue
	public static void oddNumContinue() {
		System.out.println("\n");
		System.out.println("Printing odd numbers using continue keyword");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.print(i + ",");
		}
	}

	// Prints even numbers between 50-75 using break
	public static void evenNumBreak() {
		System.out.println("\n");
		System.out.println("Printing even numbers between 50 and 75 using break keyword: ");
		for (int i = 50; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ",");
			}
			if (i == 75) {
				break;
			}
		}
	}

	public static void main(String[] args) {

		// User input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 1 and 10:");
		int userNum = sc.nextInt();
		while (userNum > 10 || userNum < 1) {
			System.out.println("Error! Number has to be between 1 and 10.");
			System.out.println("Enter number between 1 and 10:");
			userNum = sc.nextInt();
		}
		sc.close();

		printNum(userNum);
		System.out.println();
		printEven();
		nestedFor();
		whileLoop();
		oddNum();
		printPrime();
		oddNumContinue();
		evenNumBreak();

	}

}
