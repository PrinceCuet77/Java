package CallByReference;

public class CallByReference {
	String name;
	
	public void method(CallByReference r) {
		r.name = "Prince77";
	}
}
