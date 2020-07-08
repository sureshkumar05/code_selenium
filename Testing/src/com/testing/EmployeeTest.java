package com.testing;

class Employee{

	private String name;
	private int age;
	private String designation;
	private double salary;

	public Employee(String name) {
		this.name = name;
	}
	
	public void setAge(int empAge) {
		age = empAge;
	}
	
	public void setDesignation(String empDesignation) {
		designation = empDesignation;
	}
	
	public void setSalary(double empSalary) {
		salary = empSalary;
	}
	
	public void printEmployee() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Designation: "+designation);
		System.out.println("Salary: "+salary);
	}
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee empOne = new Employee("Jhon Smith");
		Employee empTwo = new Employee("Tom Jerry");

		empOne.setAge(25);
		empOne.setDesignation("Software Engg");
		empOne.setSalary(30000);
		empOne.printEmployee();
		
		empTwo.setAge(32);
		empTwo.setDesignation("Senoir Software Engg");
		empTwo.setSalary(50000);
		empTwo.printEmployee();
		
	}

}
