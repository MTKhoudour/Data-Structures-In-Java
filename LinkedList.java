//package linkedLists;

class Node{
	Node next ; 
	int data ; 
	
	Node(int _data){
		data = _data ; 
		next = null ; 
	}

}

public class LinkedList {
	static Node head ; 
	
	static void printList(LinkedList list){
		Node x = head ; 
		if(x == null){
			System.out.println("List is empty");
			return ;
		}else{
			while(x != null){
				System.out.print(x.data + " -> ");
				x = x.next ; 
			}
			System.out.println("null");
		}
		
	}

	static void push(int _data){
		Node newNode = new Node(_data); 
		newNode.next = head ; 
		head = newNode ;
	}
	
	static void pushAfter(Node prev, int _data){
		if(prev.next == null){
			System.out.println("You are at the end of the list");
			return ;
		}else {
			Node newNode = new Node(_data); 
			newNode.next = prev.next ;
			prev.next =  newNode ;
		}
	}

	static void pushLast(int data){
		Node last = head ; 
		if(head == null){
			head = new Node(data); 
			return ;
		}else {
			Node myNode = new Node(data); 
			myNode.next = null ; 
			while(last.next != null)
				last = last.next ; 
			
			last.next = myNode ; 
		}
	}
	
	static boolean isEmpty(){
		return head == null ; 
	}
	
	static void deleteNode(int position){
		while(!isEmpty()){ // Check if the list is empty !
			Node temp = head ;
			
			if( position == 0 ){
				head = temp.next ; 
				return ; 
			}
			
			for(int i=0; temp!=null && i<position-1; i++)
				temp = temp.next ; 
			
			if( temp == null || temp.next == null ){
				System.out.println("The position does NOT exist. (Obviously the list remains the same.)");
				return ; 
			}
		
			Node x = temp.next.next ; 
			temp.next = x ;
			
		}
		System.out.println("The linked list is empty.");
		
	}

	static void deleteKey(int key){
	     while(!isEmpty()){
	          Node temp = head , prev = null ; 

	          if(temp != null && temp.data == key){
	               head = temp.next ; 
	               return ; 
	          }

	          while(temp != null && temp.data != key){
	               prev = temp ; 
	               temp = temp.next ;
	          }

	          if(temp == null) return ; 

	          prev.next = temp.next ;
	     
	     }

	     System.out.println("The list is empty.");
	}

	static int getLength(Node x){ 
	     return ( x == null )?  0 : getLength(x.next) + 1  ; 
	}

	static int getLengthIte(){
	     Node x = head ; 
	     int counter = 0 ; 
	     while(x != null ){
	          counter++ ; 
	          x = x.next ; 
	     }

	     return counter ; 
	}
	
	static boolean search(int xData){
		Node temp = head ; 
			while(temp != null){
				if (temp.data == xData )  
					return true ; 
				temp = temp.next ;
			}
			return false ;
	}
	
	static boolean searchRec(Node head ,int xData){

	    Node x = head ; 
	    while(x != null){
	    	return (head.data == xData)? true : searchRec(x.next,xData) ;
	    }
	    return false ;
	}
	
	public static void main(String[] args) {

		 
		LinkedList theList = new LinkedList();
		
		theList.head = new Node(1);
		
		theList.push(0);
		theList.push(-1);
		theList.push(-2);
		theList.push(-3);
		
		theList.pushAfter(theList.head,222); 
		theList.pushLast(99);
		
		printList(theList); 
		/*
		theList.deleteNode(0); 
		printList(theList); 
		
		System.out.println();
		theList.deleteNode(9); 
		printList(theList); 
		
		System.out.println();
		theList.deleteKey(-2); 
		printList(theList); 
		*/

		System.out.println("(Recursive way)Length is " + theList.getLength(head));
		System.out.println("(Iterative way)Length is : " + theList.getLengthIte());
		
		System.out.println("(Recursive way) Found : " + theList.search(111)) ;
		System.out.println("(Iterative way) Found : " + theList.searchRec(head, 222)) ;
		
		
		
	}
}
