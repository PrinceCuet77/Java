package Oop;

public class ConstractorMethod {
	public String name, gender;				// Instance variable
	public int age;
	
	// This is called method overloading
	public ConstractorMethod() {					// Non parameterize constructor
		System.out.println("This is a non parameterize constractor");
	}
	
	public ConstractorMethod(String name) {
		this.name = name; 
	}
	
	public ConstractorMethod(String name, String gender) {
		this.name = name; 
		this.gender = gender;
	}
	
	public ConstractorMethod(String name, String gender, int age) {		// Parameterize constructor
		this.name = name;									// Instance variable hiding
		this.gender = gender;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("Name : " + this.name);
		System.out.println("Gender : " + this.gender);
		System.out.println("Age : " + this.age);
	}
	
	public int fiveYearAfterAge() {
		return this.age + 5;
	}
	
	public static void main(String[] args) {
		ConstractorMethod constractorMethod = new ConstractorMethod();
		System.out.println();
		
		ConstractorMethod constractorMethod2 = new ConstractorMethod("prince");
		constractorMethod2.showInfo();
		System.out.println();
		
		ConstractorMethod constractorMethod3 = new ConstractorMethod("Prince", "Male");
		constractorMethod3.showInfo();
		System.out.println();
		
		ConstractorMethod constractorMethod4 = new ConstractorMethod("Prince", "Male", 22);	// Calling 
		constractorMethod4.showInfo();
		System.out.println();
		
		System.out.println("After 5 years later my age : " + constractorMethod4.fiveYearAfterAge());
	}
}
