
// A very simple counter

public class counter {
	private int count ;
	
	// Default Constructor
	public counter(){
		
	}
	
	public counter(int x){
		count = x ; 
	}
	
	public int getCount(){
		return count; 
	}
	
	public void incrementCounter(){
		count++ ;
	}
	
	public void incrementCounter(int x){
		count += x ; 
	}
	
	public void Reset(){
		count = 0 ; 
	}
	
	
}
