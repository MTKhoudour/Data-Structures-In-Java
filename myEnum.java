// We use enums to represent choices of a finite set 
// The member enum can only be defined inside a top-level class or interface or in a static context
public class myEnum {
	
	public enum Lights {
		RED, ORANGE, GREEN ; 
	};
	
	static Lights light ; 
	
	// Constructor
	public myEnum(Lights light){
		this.light = light ;
	}
	
	// traffic_Lights()
	public void traffic_Lights(){
		switch (light){
			case RED:
				System.out.println("stop !!");
				break ; 
			case ORANGE:
				System.out.println("Be careful dude !! ");
				break ; 
			case GREEN : 
				System.out.println("Go Go Go !!!");
				break; 
		}
	}
	
	// another examples of enums : Shirt Sized
	public enum Shirts {
		
		S("SMALL"), M("MEDIUM"), L("LARGE"), XL("EXTRA LARGE"); 
		
		String shirt ; 
		
		Shirts (String s){
			this.shirt = s ; 
		}
		
		String getSize(){
			return shirt ; 
		}
		
	}
	
	
	public static void main(String[] args) {
		Lights r = Lights.RED; 
		System.out.println( r + "\n" );
		
		myEnum e = new myEnum(r); 
		
		e.traffic_Lights();  
		
		// Another Trick :3
		String s = "GREEN"; 
		
		myEnum e1 = new myEnum(light.valueOf(s)); 
		e.traffic_Lights();
		
		// the name() returns a string
		String r2 = r.name(); 
		System.out.println(r2);
		
		// ordianl() returns an int which is the position 
		Lights o = Lights.ORANGE ; 
		System.out.println("orange is ordinal " + o.ordinal());
		
		// hashCode() returns a hash code 
		System.out.println(o.hashCode());
		
		Lights trafficLights[] = Lights.values(); 
		
		for(Lights light : trafficLights){
			System.out.println(light + " is at index : " + light.ordinal());
		}
		
		
		// ------------ Shirts 
		
		Shirts []sizes = Shirts.values(); 
		
		for(Shirts size : sizes){
			System.out.println("Size " + size + " is for " + size.getSize());
		}
		
		
	}// Main
}
