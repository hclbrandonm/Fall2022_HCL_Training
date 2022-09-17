package com.brandon.JavaAssignment2;

 class Fruit {
	String whatis = "Fruit";
	public void whatIs() {
		System.out.println("It is a(n) " + whatis);
	}
 }
class Apple extends Fruit {
	String type ="Apple";
	public void whatType() {
		System.out.println("It is a(n) " + type);
	}
}

class Gala extends Apple {
	String type = "Gala";
	public void whatType() {
		System.out.println("It is a(n) " + type + " " + super.type); //super keyword for variable
	}
}
class AppleQuantity{
	//method overloading
	public void quantity(int x) {
		System.out.println("This person wants " + x + " apples.");
	}
	
	public void quantity() {
		System.out.println("This person doesn't want apples.");
	}
}

class OtherFoods{
	//Constructor overloading
	OtherFoods(){
		System.out.println("We have vegetables available!");
	}
	
	OtherFoods(String food){
		System.out.println("We have "+ food + " available!");
	}
}

class MeatType extends OtherFoods{
	MeatType(String food,String meat1, String meat2, String meat3){
		super(food);//Using super keyword for constructor
	System.out.println("These are the types of " + food + " available:" + meat1 + "," + meat2 + "," + meat3);
}
}

public class InheritanceConcepts {

	public static void main(String[] args) {
		Fruit f = new Fruit();
		System.out.println("What kind of food is this?");
		f.whatIs();
		
		//inheritance
		System.out.println("\nWhat is it called?");
		Apple a = new Apple();
		a.whatType();
		a.whatIs();
		
		System.out.println("\nWhat kind of Apple is it?");
		Gala g = new Gala();
		//overriding
		g.whatType();
		
		//method overloading
		System.out.println("\nDo you want some apples?");
		AppleQuantity p1 = new AppleQuantity();
		AppleQuantity p2 = new AppleQuantity();
		p1.quantity(3);
		p2.quantity();
		
		//Constructor overloading
		System.out.println("\nWhat other foods do you have?");
		OtherFoods of1 = new OtherFoods();
		OtherFoods of2 = new OtherFoods("meats");
		
		//Used super keyword for constructor
		System.out.println("\nCan you repeat the last part?");
		MeatType mt = new MeatType("meats","chicken","beef","pork");
	}

}
