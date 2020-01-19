package String;

public class String1 {

	public static void main(String[] args) {
		String ch1 = "Prince"; 
		String ch2 = new String("prince");
		char[] ch3 = {'p', 'r', 'i', 'n', 'c', 'e'};
		
		System.out.println("Variable type string ch1 : " + ch1 + " and length is : " + ch1.length());
		System.out.println("Object type string ch2 : " + ch2 + " and length is : " + ch2.length());
		System.out.println("Character type string ch3 : " + ch3 + " and length is : " + ch3.length);
		
		// Checking two string using '==' sign
		if ( ch1 == ch2 ) 
			System.out.println("Equals");
		else 
			System.out.println("Not equals");
		
		// Checking two string using equals() method 
		if ( ch1.equals(ch2) ) 
			System.out.println("Equals");
		else 
			System.out.println("Not equals");
		
		// Checking two string using contains() 
		if ( ch1.contains("Pri") ) 
			System.out.println("\"Pri\" contains in ch1");
		else 
			System.out.println("\"Pri\" is not contained in ch1");
		
		// Checking two string using equalsIgnorCase() 
		if ( ch1.equalsIgnoreCase(ch2) ) 
			System.out.println("Equals");
		else 
			System.out.println("Not equals");
		
		// Checking a string empty or not 
		if ( ch1.isEmpty() ) 
			System.out.println("String ch1 is empty");
		else 
			System.out.println("String ch1 is not empty");
	}

}
