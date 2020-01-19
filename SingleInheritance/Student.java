package SingleInheritance;

public class Student extends Person {
	private int roll;
	
	public void setRoll(int roll) {
		this.roll = roll; 
	}
	
	public int getRoll() {
		return this.roll;
	}
	
	public void showInfo() {
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
		System.out.println("Roll : " + getRoll());
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Prince");
		student.setAge(22);
		student.setRoll(77);
		
		student.showInfo();
	}

}
