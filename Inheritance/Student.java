package Inheritance;

public class Student extends Person {		// Inheritance from 'Person' class
	private int roll;
	private String qualification;
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public int getRoll() {
		return this.roll;
	}
	
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	public String getQualification() {
		return this.qualification;
	}
	
	public void showInfo() {
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
		System.out.println("Roll : " + getRoll());
		System.out.println("Qualification : " + getQualification());
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Prince");
		student.setAge(22);
		student.setRoll(77);
		student.setQualification("Student");
		
		student.showInfo();
		
		System.out.println(student instanceof Student);
		System.out.println(student instanceof Person);
	}
}
