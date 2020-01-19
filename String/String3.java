package String;

public class String3 {

	public static void main(String[] args) {
		String chString = "Bangladesh is my country"; 
		String chString2 = "    Bangladesh is my country     "; 
		
		// Removing all space only in first and last side but not in middle space
		System.out.println(chString2.trim()); 
		
		// Printing first character 
		System.out.println("Index '0' is : " + chString.charAt(0));
		
		// Printing ASCII value of any index in string 
		System.out.println("The ANCII value of index '3' is : " + chString.codePointAt(3));
		
		// Finding the index of the character in string
		System.out.println("Index of 'n' is : " + chString.indexOf('n'));
		
		// Finding the index of the string in string 
		System.out.println("Index of \"is\" is : " + chString.indexOf("is"));
		
		// Finding the last index of the character in string
		System.out.println("Last index of 'n' is : " + chString.lastIndexOf('n'));
		
		// Finding the last index of the string in string
		System.out.println("Last index of \"is\" is : " + chString.lastIndexOf("is"));
	}

}
