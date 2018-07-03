// Strings && stuff 
public class myClass1 {
	
	public static void main(String[] args) {
		// Define a string 
		String str = "Code Maestro";
		
		// Char indexing ,from 0 to n-1 
		System.out.println(str.indexOf(5)); // we'll get -1 ,because there is no 5 in my str 
		System.out.println(str.indexOf("m")); // -1 its case sensitive baby !! pay attention !! 
		System.out.println(str.indexOf("M")); // we'll get 5, letter M is at index 5
		
		// Concatenation Strings 
		
		String s1 = "Bella "; 
		String s2 = " Ciao !!";
		
		String s = s1 + s2 ; 
		System.out.println(s); // Casa de Papel fan.. :p !! 
		
		// The StringBuilder Class
		
		
		StringBuilder sb = new StringBuilder("Hope"); 
		sb.setCharAt(0, 'D'); // Changes the char at index 0 to 'D' 
		System.out.println(sb); // Dope
		
		sb.insert(4, s2); // inserts a copy of s2 at index 4
		System.out.println(sb); // Dope Ciao !! 
		
		sb.append(s2); // appends s2 at the end of sb ,Dope Ciao !! Ciao !! 
		System.out.println(sb);
		
		sb.reverse(); // reverse sb
		System.out.println(sb); 
		
		sb.toString(); // Returns a String instance based on the current character sequence
		
		
		
		
		
	}
	
	
}
