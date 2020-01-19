package Oop;

public class ThisKeyword {
	public String name, gender;				// Instance variable
	public int age;
	
	// This is called method overloading
	public ThisKeyword() {					// Non parameterize constructor
		System.out.println("This is a non parameterize constractor");
	}
	
	public ThisKeyword(String name) {
		this.name = name; 
	}
	
	public ThisKeyword(String name, String gender) {
		this(name); 
		this.gender = gender;
	}
	
	public ThisKeyword(String name, String gender, int age) {		// Parameterize constructor
		this(name, gender);
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("Name : " + this.name);
		System.out.println("Gender : " + this.gender);
		System.out.println("Age : " + this.age);
	}

	public static void main(String[] args) {
		ThisKeyword thisKeyword = new ThisKeyword();
		System.out.println();
		
		ThisKeyword thisKeyword2 = new ThisKeyword("prince");
		thisKeyword2.showInfo();
		System.out.println();
		
		ThisKeyword thisKeyword3 = new ThisKeyword("Prince", "Male");
		thisKeyword3.showInfo();
		System.out.println();
		
		ThisKeyword thisKeyword4 = new ThisKeyword("Prince", "Male", 22);	// Calling 
		thisKeyword4.showInfo();
		System.out.println();
	}

}
