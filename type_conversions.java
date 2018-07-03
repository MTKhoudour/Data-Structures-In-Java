// Casting is an operation that allows us to change the type of a value. 
// meaning that we take a vlue of a one type and CAST it into an equivalent value of anther type.
// we have 2 types : explicit casting && implicit casting 
public class type_conversions {

	public static void main(String[] args) {
		// Explicit Casting 
		double d = 6.023 ; 
		int i =(int) d ; // casting from int to double is called widening cast, as the double is more broad that the int type, so no losing information 
		System.out.println("i = " + i); // i = 6
		double d2 = i ; 
		System.out.println("d2 = " + d2); // d2 = 6.0
		
		// from string to an int 
		String s = "2018" ; 
		int k = Integer.parseInt(s); 
		// from an int to string 
		String m = Integer.toString(k);  
		
		
		// Implicit Casting 
		int ii = 7 ; 
		double dd = ii ; 
		// ii =  dd ; // Compilor error : possible loss of precision we must add cast (int) to fix it. 
		ii = (int) dd ; 
		
		
		// Combine an explicit cast && an implicit cast to perform a floating-point division 
		System.out.println( "(double) 7/4 = " + (double) 7/4  );
		System.out.println( "(double) (7/4) = " + (double) (7/4) );
		
			
		
		
		
	}
	
}
