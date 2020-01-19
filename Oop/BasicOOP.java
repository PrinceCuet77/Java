package Oop;

public class BasicOOP {
	public String name, gender; 			// Member variable
	public int age;
	
	public static void main(String[] args) {
		BasicOOP teacher = new BasicOOP();		// Creating object into reference variable
		teacher.name = "Prince"; 
		teacher.gender = "Male";
		teacher.age = 22;
		
		System.out.println("Name : " + teacher.name);
		System.out.println("Genger : " + teacher.gender);
		System.out.println("Age : " + teacher.age);
	}

}
