// A literal is any constant value that can be used in an assignment or other expression.

public class literals {
	// null is the ONLY OBJECT literal && is allowed to be any reference type
	Object o = null ; 
	
	Boolean bool = true ; // boolean true or false are also literals 
	
	// 32bit integers 
	Integer x = 7 ; 
	int xx = 7 ;
	
	// Long integer must end with "L" or "l"
	long y = 7L ; 
	Long yy = 5l ; 
	
	// must add cast
	Integer xxx = (int) 71L ; 
	
	// the default for floating-point is double
	double z = 123.456 ; 
	
	// to make a literal a float i must add "f" or "F"
	float zz = 7.7F ;
	
	// floating-point literals in exponential 
	double avogadro = 6.023E23 ; 
	
	
	// -------- Increments 
	
	int m = 7 ; 
	int k = m++ ; // k becomes 7 and then m becomes 8
	int i = ++m ; // m becomes 9 and the i become 9
	
	
	
	
	
}
