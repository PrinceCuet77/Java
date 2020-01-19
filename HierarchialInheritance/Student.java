package HierarchialInheritance;

public class Student extends Person {
	private int studentId;
	private int marks;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public int getMarks() {
		return this.marks;
	}
	
	public void studentInfo() {
		System.out.println("Student's Info : ");
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
		System.out.println("Student ID : " + getStudentId());
		System.out.println("Student Marks : " + getMarks());
	}
	
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setName("Rezoan Shakil");
		teacher.setAge(30);
		teacher.setTeacherId(01);
		teacher.setSalary(50000);
		teacher.teacherInfo();
		
		System.out.println();
		
		Student student = new Student();
		student.setName("Prince");
		student.setAge(22);
		student.setStudentId(77);
		student.setMarks(90);
		student.studentInfo();
	}

}
