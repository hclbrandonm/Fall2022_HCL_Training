package com.brandon.JavaAssignment2;

import java.util.Scanner;

public class UserOperations {

	// Arithmetic Operations
	public static void arithmetic(double x, double y) {
		double sum = x + y;
		double sub = x - y;
		double mult = x * y;
		double div = x / y;
		System.out.println("\n" + x + " + " + y + " = " + sum);
		System.out.println(x + " - " + y + " = " + sub);
		System.out.println(x + " x " + y + " = " + mult);
		if (y == 0) {
			System.out.println("Error! Dividing by 0 \n");
		} else {
			System.out.println(x + " / " + y + " = " + div + "\n");
		}
	}

	// Unary Operations
	public static void unary(int x, int y) {
		int minx = -x;
		int miny = -y;
		int decx = x;
		int decy = y;
		int incx = x;
		int incy = y;
		System.out.println("After minus(-) operator: " + x + " and " + y + " are now " + minx + " and " + miny);
		System.out
				.println("After decrement(--) operator: " + x + " and " + y + " are now " + --decx + " and " + --decy);
		System.out.println(
				"After increment(++) operator: " + x + " and " + y + " are now " + ++incx + " and " + ++incy + "\n");
	}

	// Relational Operations
	public static void relational(int x, int y) {
		if (x == y) {
			System.out.println(x + " is equal to " + y);
		} else {
			System.out.println(x + " is not equal to " + y);
		}

		if (x > y) {
			System.out.println(x + " is greater than " + y);

		} else if (x < y) {
			System.out.println(x + " is less than " + y);
		}

		if (x >= y) {
			System.out.println(x + " is greater than or equal to " + y);
		}

		if (x <= y) {
			System.out.println(x + " is less than or equal to " + y);

		}

	}

	// Logical Operators
	public static void logical(int x, int y) {
		if (x > 0 && y > 0) {
			System.out.println("&& Operator: Both " + x + " and " + y + " are greater than 0.");
		}

		if (x > 0 || y > 0) {
			System.out.println("|| Operator: At least one of " + x + " and " + y + " are greater than 0.");
		}

		if (x > 0 ^ y > 0) {
			System.out.println("XOR Operator: Only one of " + x + " and " + y + " are greater than 0.");
		}

	}

	public static void main(String[] args) {
		// taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		sc.close();
		// performing operations
		arithmetic(num1, num2);
		unary(num1, num2);
		relational(num1, num2);
		System.out.println();
		logical(num1, num2);

		// Using command line argument
		int argsIndex = 0;
		Integer clArg = Integer.parseInt(args[argsIndex]);
		if (clArg % 2 == 0) {
			System.out.println();
			System.out.println("The command line argument " + clArg + " is even.");
		} else {
			System.out.println();
			System.out.println("The command line argument " + clArg + " is odd.");
		}

	}

}
