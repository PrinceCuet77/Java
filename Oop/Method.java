package Oop;

public class Method {
	public String name, gender;
	public int age;
	
	void setInfo(String name, String gender, int age) {				// Parameterize method
		this.name = name; 
		this.gender = gender;
		this.age = age;
	}
	
	void showInfo() {												// Non parameterize method
		System.out.println("Name : " + this.name);
		System.out.println("Gender : " + this.gender);
		System.out.println("Age : " + this.age);
	}
	
	public static void main(String[] args) {
		Method method = new Method(); 
		method.setInfo("Prince", "Male", 22);					// Method calling
		method.showInfo();
	}
}
