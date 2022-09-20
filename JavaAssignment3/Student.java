package com.brandon.JavaAssignment3;

//import java.util.Scanner;

public class Student {

	public static void average(double grd1, double grd2, double grd3) {
		double avgGrade = (grd1 + grd2 + grd3) / 3;
		if (avgGrade > 50) {
			System.out.println("Average Score " + avgGrade + ": PASS");
		} else {
			System.out.println("Average Score " + avgGrade + ": FAIL");
		}
	}

	public static void input(String name) {
		System.out.println("Name: " + name);

	}

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Please enter student grades: ");
		double grd1 = sc.nextDouble();
		double grd2 = sc.nextDouble();
		double grd3 = sc.nextDouble();
		System.out.println("Please enter student name: ");
		sc.nextLine();
		String name = sc.nextLine();
		sc.close();

		input(name);
		average(grd1, grd2, grd3);*/

	}

}
