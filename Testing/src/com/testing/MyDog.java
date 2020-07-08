package com.testing;

public class MyDog {
	int age;
	String color;
	
	void barking() {
		System.out.println("Barking");
	}
	
	void sleeping() {
		System.out.println("Sleeping");
	}
	
	void setDog(int a, String b) {
		age = a;
		color = b;
	}
	
	void printDog() {
		System.out.println("This dog age is " + age + " color is " + color);
	}

	public static void main(String[]args) {
		
		MyDog d1 = new MyDog();
		MyDog d2 = new MyDog();
		d1.setDog(10, "Black");
		d1.printDog();
		d2.setDog(13, "Brown");
		d2.printDog();
	}
}
