package arrays_task;

public class Array_Task1 {
	
	public static void main(String[] args) {
		
		int list[]  = new int[10];
		
		list[1]= 300;
		list [7]= 400;
		list [9]= 500;
		
		System.out.println(list[1]+ " "+ list[7]+ " "+ list[9]);
		System.out.println(list.length);
		
		// for each loop
	
		for(int num:list) {
			
			System.out.print(num+ " ");
		}
	 // for loop
		
		for (int x=0; x<list.length;x++) {
			
			System.out.println( list[x]);
			
		}
		
		// reverse order for loop
		
	for (int x=list.length-1; x>=0;x--) {
			
			System.out.println( list[x]);
	}
	
	// Find out the length of the array and Print all the value 5th index to 8th index.
	
	System.out.println("the values from 5 to 8 : ");
	
	for (int x= 5; x<=8; x++) { 
		
		System.out.println(list[x]);
	}
	// Find out the length of the array and Print all the value from 8th Index to 4th index
	
System.out.println("the values from 8 to 4 : ");
	
	for (int x= 8; x>=4; x--) { 
		
		System.out.println(list[x]);
}
	
	}

}
