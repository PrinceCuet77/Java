package Oop;

public class Person {
	public String name;		// member variable
	public int age;
	public static String nationality;	// Static variable
	public static int counter;
	
	// Static block is used to initialize static variable
	static {
		nationality = "Bangladeshi"; 
		counter = 0;  // By default int static variable is initialized which is '0'
	}
	
	// static method
	public static void staticMethod() {
		// Inside Person class static method call as staticMethod()
		// Outside Person class i.e main method static method call as ClassName.MethodName()
		// Only access static member and static method
		// 'this' and 'super' keyword can't be use in static method
	}
	
	// Non-parameterize constructor
	public Person() {
		System.out.println("Person class constructor");
		name = ""; 
		age = 0;
		counter++;
	}
	
	// Parameterize constructor and overloading constructor of person class
	public Person(String name, int age) {
		this.name = name; 
		this.age = age;
		counter++;
	}
	
	// Method with parameter
	public void changeName(String anotherName) {
		this.name = anotherName;
	}
	
	// Method with no parameter
	public void showInfo() {
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Nationality : " + nationality);	// Static variable 
	}
	
	public static void main(String[] args) {
		Person p = new Person("Prince", 22);		// Object
		
		System.out.println("Before changing name : ");
		p.showInfo();
		p.changeName("Shakil");
		
		System.out.println("\nAfter changing name : ");
		p.showInfo();
		
		// some object calling 
		System.out.println();
		Person p1 = new Person(); 
		Person p2 = new Person("Rezoan", 22); 
		
		// Outside the class static variable call ClassName.staticVariable that format
		System.out.println("\nTotal Object calling : " + Person.counter);  
	}

}