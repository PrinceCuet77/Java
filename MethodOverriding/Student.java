package MethodOverriding;

public class Student extends Person {
	private int id;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	/* 1. If I want to override any method two class must be inherited.
	 * 2. Name, No of parameter, Data type, Return type all the things must be same. 
	 * 3. If a class called 'final' or 'static' then inheritance don't occur so no method overrides.
	 * 4. Constructor class can't be overridden.
	 * 5. 'static' or 'final' method don't override.
	 */
	
	@Override
	public void showInfo() {
		System.out.println("Student class : ");
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
		System.out.println("Id : " + getId());
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Prince");
		student.setAge(22);
		student.setId(77);
		
		student.showInfo();
		System.out.println();
		
		Person person = new Person(); 
		person.setName("Prince77");
		person.setAge(22);
		
		person.showInfo();
	}
	
	/* Q: Overloading vs Overriding
	 * -------------> Overloading <-------------------
	 * 1. Parameter must be different,
	 * 2. It occurs within the same class,
	 * 3. Inheritance is not involved.
	 * 4. Return type may or not be same.
	 * 5. One method doesn't hide another.
	 * 
	 * ---------------> Overriding ------------------
	 * 1. Parameter must be same.
	 * 2. It occurs within different class.
	 * 3. Inheritance is involved.
	 * 4. Return type may be same.
	 * 5. One method hide another method.
	 */
	
	// Multiple inheritance can't possible in Java because multiple inheritance creates diamond problem.

}
