package String;

public class String4 {

	public static void main(String[] args) {
		String ch = "Bangladesh is my country"; 
		
		// Replace 'i' with 'j'
		String ch1 = ch.replace('i', 'j');
		System.out.println("Before replace : " + ch);
		System.out.println("After replace : " + ch1);
	
		// Split when space found
		String[] strings = ch.split(" "); 
		for ( String x : strings ) 
			System.out.println(x);
		
		// Another split() example 
		String ch2 = "Bangladesh_is_my country";
		
		// Split when underscore found
		String[] st = ch2.split("_");
		for ( String xString : st ) 
			System.out.println(st);
	}

}
