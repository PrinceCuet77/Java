package AbstractClass;

public abstract class Shape {		// Abstract class whichi is not declare final and static.
	double arm1, arm2;
	
	Shape(double arm1, double arm2) {
		this.arm1 = arm1; 
		this.arm2 = arm2;
	}
	
	abstract void area();			// It must be overridden to sub class
}