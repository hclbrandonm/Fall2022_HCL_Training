package com.brandon.JavaAssignment3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bookstore {

	public static void logIn(String ID, String pw) {
		String password = "bbbb";
		String userId = "username";
		if ((Pattern.matches(password, pw) == true) && (Pattern.matches(userId, ID) == true)) {
			System.out.println("You have logged in.\n");
		} else {
			System.out.println("Incorrect login credentials.\n");
		}
	}

	public static String search(String title, String keyword) {
		String itemTitle = "Journey to the center of the earth";
		String searchResult = "";
		Pattern pattern = Pattern.compile(keyword, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(itemTitle);
		boolean matchFound = matcher.find();

		if ((Pattern.matches(itemTitle, title) == true) || (matchFound == true)) {
			searchResult = itemTitle;
			// System.out.println(searchResult);
		} else {
			System.out.println("No matches found");
		}

		return searchResult;
	}

	public static ArrayList shoppingCart(String searchResult) {
		ArrayList cart = new ArrayList();
		cart.add(searchResult);
		System.out.println("Cart Items:");
		for (int i = 0; i < cart.size(); i++) {
			System.out.println(cart.get(i));
		}
		return cart;
	}

	public static void orderConfirmation(String confirmation, String address, String billing) {
		if (confirmation.equalsIgnoreCase("yes")) {
			String orderAddress = address;
			String orderBilling = billing;
			System.out.println("\nOrderConfirmation:\n" + "Customer Address: " + orderAddress + "\nBilling Address: "
					+ orderAddress);
		} else {
			System.out.println("\nOrder Confirmation: Please confirm or review order.");

		}
	}

	public static void orderReceipt(String address, String billing, ArrayList shopCart, double cost) {
		System.out.println("\nElectronic Receipt:");
		System.out.println("Shipping Address: " + address);
		System.out.println("Billing Address: " + billing);
		System.out.println("Items:");
		for (int i = 0; i < shopCart.size(); i++) {
			System.out.println(shopCart.get(i));
		}
		System.out.println("Cost: $" + cost);
	}

	public static void logOut() {
		System.out.println("\nYou have logged out.");
	}

	public static void main(String[] args) {
		/*String address = "123 Example St Dallas, TX";
		String billingAddress = "456 Sample Blv Frisco, TX";
		logIn("username", "bbbb");
		ArrayList items = shoppingCart(search("Journey to the center of th earth", "earth"));

		orderConfirmation("yes", address, billingAddress);
		orderReceipt(address, billingAddress, items, 10.99);
		logOut();*/

	}

}
