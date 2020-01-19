package AbstractClass;

public class Rectangle extends Shape {
	Rectangle(double arm1, double arm2) {
		super(arm1, arm2);
	}
	
	@Override
	void area() {
		double result = arm1 * arm2; 
		System.out.println("The area of Rectangle : " + result);
	}
}
// If we can't override all the abstract method of parent class then call that class as abstract class.