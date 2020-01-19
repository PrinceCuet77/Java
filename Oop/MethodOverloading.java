package Oop;

public class MethodOverloading {
	// Method overloading
	public void add(int first, int second) {
		System.out.println("The sum is : " + (first + second));
	}
	
	public void add(int first, int second, int third) {
		System.out.println("The sum is : " + (first + second + third));
	}
	
	public void add(float first, float second) {
		System.out.println("The sum is using float data type : " + (first + second));
	}
	
	public void add(double first, double second) {
		System.out.println("The sum is using double data type : " + (first + second));
	}
	
	// Variable length argument
	public void add(int ... num) {
		for ( int x : num ) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		MethodOverloading methodOverloading = new MethodOverloading();
		methodOverloading.add(4, 5);
		methodOverloading.add(4, 5, 6);
		methodOverloading.add(4.4, 5.5);
		methodOverloading.add(4.4f, 5.5f);
		methodOverloading.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}
}
