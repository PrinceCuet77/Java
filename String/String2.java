package String;

public class String2 {
	public static void main(String[] args) {
		String firstName = "Rezoan"; 
		String lastName = " Shakil"; 
		
		String fullName1 = firstName + lastName; 
		System.out.println("Full name : " + fullName1);
		
		// Concatenation using concat() method
		String fullName2 = firstName.concat(lastName);
		System.out.println("Full name : " + fullName2);
		
		String[] name = {"Rezoan", "Shakil", "Prince"};
		
		// Print name string using foreach loop 
		for ( String ch : name ) 
			System.out.println(ch);
		
		// Print name string using for loop 
		for ( int i = 0; i < name.length; i++ ) 
			System.out.println(name[i]);
		
		// Print name string using while loop 
		int i = 0; 
		while ( i < name.length ) {
			System.out.println(name[i]);
			i++;
		}
		
		System.out.println("Upper case : " + fullName1.toUpperCase());
		System.out.println("Lower case : " + fullName1.toLowerCase());
		
		boolean b = firstName.startsWith("Rez"); 
		System.out.println(b ? "Start with \"Rez\"" : "Start not with \"Rez\"");
		
		b = lastName.endsWith("kil");
		System.out.println(b ? "Ends with \"kil\"" : "Not ends with \"kil\"");
	}
}
