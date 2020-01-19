package AbstractClass;

public class Circle extends Shape {
	Circle(double arm1, double arm2) {
		super(arm1, arm2);
	}
	
	@Override
	void area() {
		double result = 3.1214 * arm1, arm2;
		System.out.println("The area of circle : " + result);
	}
	
	public static void main(String[] args) {
		Shape shape;						// We only create reference variable but not create object.
		
		shape = new Circle(5, 5);
		shape.area();
		
		shape= new Rectangle(10, 5);
		shape.area();
	}

}
