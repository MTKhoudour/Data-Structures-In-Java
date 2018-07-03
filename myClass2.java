// Wrapper Types
// A Wrapper class is a class whose object wraps or contains primitive data types.
/*
 * Need of Wrapper Classes : 
 * 	- They convert primitive data types into objects. Objects are needed if we wish to modify the arguments passed into a method(because primitive types are passed by value)
 * 	- The classes in java.util package handles only objects and hence wrapper classes help in this case also. 
 * 	- DS in Collection framework, such as ArrayList & Vector, store only objs (refernce types) & not primitives types. 
 * 	- An object is needed to support synchronization in multithreading.
 *  
 *  
 *  Autoboxing : Automatic Conversion of primitive types of the object of their corresponding wrapper classes.ex : from int to integer
 */
public class myClass2 {
	public static void main(String[] args) {
		Boolean obj_bool = new Boolean(true); 
		System.out.println(obj_bool.booleanValue()); // true
		
		// From primitive to object 
		double x = 1.3 ; // Double data type
		Double xObj = new Double(x); // wrapping around the double object
		
		// From object to primitive 
		double xPrimitve = xObj ; 
	}
	
	
}
