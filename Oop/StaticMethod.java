package Oop;

public class StaticMethod {
	public int nonStaticVariable;
	public static int staticVariable;
	int defaultVariable;						// Default variable
	
	public void nonStaticMethod() {
		defaultVariable = 5;
		System.out.println("This is non static method");
	}
	
	public static void show() {
		System.out.println("This is Static method");
	}
	
	public static void StaticMethod() {
		// Can't call non static method but also called static method.And 'this' or 'super' can't use in
		// static method.
		show();
		// Can't declare non static variable but also called static variable
		staticVariable = 100;
		System.out.println("Static variable : " + StaticMethod.staticVariable);
	}
	
	public static void main(String[] args) {
		StaticMethod staticMethod = new StaticMethod();
		staticMethod.nonStaticMethod();			// Calling non static method.
		StaticMethod.StaticMethod();			// Calling static method. Example: ClassName.StaticMethod();
		
		System.out.println("Defalut variable : " + staticMethod.defaultVariable);
	}
}
