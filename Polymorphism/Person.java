package Polymorphism;

public class Person extends Teacher {
	@Override
	public void display() {
		System.out.println("Display in Person class");
	}
	
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.display();
		
		t = new Person();	// It's called polymorphism
		t.display();
	}

}
// Polymorphism is calling many forms. Two types : 1) Compile time/Static binding 2) Run time/Dynamic binding
// The reference of parent class refers the object of the sub class or child class.