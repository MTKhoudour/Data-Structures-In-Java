import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scannerr {
	public static void main(String[] args) throws FileNotFoundException {
		String s = "C0de_Maestr0"; 
		Scanner in = new Scanner(s); 
		// hasNext() returns true if there is another token in the input stream
		System.out.println("in.hasNext : " + in.hasNext());
		// next() return the next token in the stream 
		System.out.println("in.next : " + in.next());
	//	System.out.println("in.next : " + in.next()); // error cuz there are no more tokens left
		System.out.println("hasNExtLine : " + in.hasNextLine());
		
		File text = new File("C:/Users/code_maestro/Desktop/k.txt"); 
		
		Scanner sc = new Scanner(text);
		System.out.println(sc.nextLine());
		
	}	
}
