package SuperKeyword;

public class Student extends Person {
	private int roll;
	String hairColor;
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public int getRoll() {
		return this.roll;
	}
	
	public Student(String name, int age, int roll) {
		super(name, age);							// Parent class constructor call using 'super' keyword
		setRoll(roll);
		this.hairColor = "Red";
	}
	
	public void showStudentInfo() {
		super.showPersonInfo();						// Parent class method call using 'super' keyword
		System.out.println("Roll : " + getRoll());
		System.out.println("Person's hair color : " + super.hairColor);// Parent class instance variable call
		System.out.println("Student's hair color : " + this.hairColor);
	}
	
	public static void main(String[] args) {
		Student student = new Student("Prince", 22, 77);
		student.showPersonInfo();
		System.out.println();
		
		student.showStudentInfo();
	}

}
