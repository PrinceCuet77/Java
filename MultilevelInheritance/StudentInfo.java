package MultilevelInheritance;

public class StudentInfo extends Marks {
	private int studentRoll;
	
	public void setStudentRoll(int studentRoll) { 
		this.studentRoll = studentRoll;
	}
	
	public int getStudentRoll() {
		return this.studentRoll;
	}
	
	public void showInfo() {
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
		System.out.println("Student Roll : " + getStudentRoll());
		System.out.println("Theory Marks : " + getTheoryMarks());
		System.out.println("Lab Marks : " + getLabMarks());
		System.out.println("Total Marks : " + totalResult());
	}
	
	public static void main(String[] args) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setName("Prince");
		studentInfo.setAge(22);
		studentInfo.setStudentRoll(77);
		studentInfo.setTheoryMarks(55);
		studentInfo.setLabMarks(22);
		
		studentInfo.showInfo();
	}

}
