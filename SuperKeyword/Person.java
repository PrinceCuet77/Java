package SuperKeyword;

/* Super keyword use in three purpose.
 * 1. Parent class instance variable calling
 * 2. Parent class constructor calling
 * 3. Parant class method calling
 */

public class Person {
	private String name; 
	private int age;
	String hairColor;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public Person(String name, int age) {
		setName(name);
		setAge(age);
		this.hairColor = "Black";
	}
	
	public void showPersonInfo() {
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
	}
}
