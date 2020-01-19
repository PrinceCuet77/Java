package MethodOverriding;

public class Person {
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
	
	public void showInfo() {
		System.out.println("Person class : ");
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
	}
}
