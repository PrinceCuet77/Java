package HierarchialInheritance;

public class Teacher extends Person {
	private int teacherId;
	private int salary;
	
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	
	public int getTeacherId() {
		return this.teacherId;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void teacherInfo() {
		System.out.println("Teacher's Info : ");
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
		System.out.println("Teacher ID : " + getTeacherId());
		System.out.println("Salary : " + getSalary());
	}
}
