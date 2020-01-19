package Oop;

public class StaticKeyword {
	public String name;
	public int id;
	public static String universityName;	// Static variable or class variable
	public static int count;
	
	static {								// Static variable used to intialize in static scope
		universityName = "CUET";
		count = 0;
	}
	
	public StaticKeyword(String name, int id) {
		this.name = name;
		this.id = id;
		StaticKeyword.count++;
	}
	
	public void showInfo() {
		System.out.println("Name : " + this.name);
		System.out.println("Id : " + this.id);
		System.out.println("University name : " + StaticKeyword.universityName);	// Using static variable
		System.out.println("Total Student enlisted : " + StaticKeyword.count);
	}
	
	public static void main(String[] args) {
		StaticKeyword staticKeyword = new StaticKeyword("Prince", 77);
		staticKeyword.showInfo();
		System.out.println();
		
		StaticKeyword staticKeyword2 = new StaticKeyword("Monisha", 34);
		staticKeyword2.showInfo();
		System.out.println();
		
		StaticKeyword staticKeyword3 = new StaticKeyword("Trishna", 44);
		staticKeyword3.showInfo(); 
		System.out.println();
	}
}
