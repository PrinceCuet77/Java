package Oop;

// There are four core concepts of OOP(Object oriented programming).
// 1. Encapsulation
// 2. Inheritance
// 3. Polymorphism
// 4. Abstraction

// Encapsulation is calling instance variable as private and make getter and setter method of that private 
// variables.

public class Encapsulation {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
	 	return this.age;
	}
	
	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		encapsulation.setName("Prince");
		encapsulation.setAge(24);
		
		System.out.println("Name is : " + encapsulation.getName());
		System.out.println("Age is : " + encapsulation.getAge());
	}
}
