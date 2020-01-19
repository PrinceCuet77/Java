package CallByReference;

public class CallByReferenceTest {
	
	public static void main(String[] args) {
		CallByReference callByReference = new CallByReference();
		callByReference.name = "Prince";
		
		System.out.println("Before call by reference : ");
		System.out.println("Name : " + callByReference.name);
		
		callByReference.method(callByReference);
		System.out.println("After call by reference : ");
		System.out.println("Name : " + callByReference.name);
	}
}