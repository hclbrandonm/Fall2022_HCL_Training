package com.brandon.JavaAssignment3;

class Vehicle {
	int vehicleNo = 1;
	String model = "Ram";
	String manufacturer = "Dodge";
	String color = "Red";

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class Truck extends Vehicle {
	int loadingCapacity = 100;

	public int getLoadingCapacity() {
		return loadingCapacity;
	}

	public void setLoadingCapacity(int loadingCapacity) {
		this.loadingCapacity = loadingCapacity;
	}

}

public class VehicleClass {

	public static void main(String[] args) {
		Truck t1 = new Truck();

		t1.setColor("Silver");
		t1.setLoadingCapacity(50);

		System.out.println("Vehicle #:" + t1.vehicleNo + " Manufacturer:" + t1.manufacturer + " Model:" + t1.model
				+ " Color:" + t1.getColor() + " Loading Capacity(tons):" + t1.getLoadingCapacity());

	}

}
