package arrays_task;

public class Array_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rym[]= new String[11];
		 rym[1]= "Phone";
		 rym[3]= "electricity";
		 rym[6]= "TV";
		 
		 System.out.println(rym.length);
	
	
		 for (String list :rym) {
		
		
		
		System.out.println( "the list of rym is "+ list);
		
		System.out.println("the value of index number 3 is "+ rym[3]);
		System.out.println("the value of index number 5 is "+ rym[5]);
		
			
	}
		 
		for (int x =0; x>= rym.length-1; x++) {
			
			System.out.println("the list of rym is "+ rym);
		}

		// reverse order
		
		for (int x = rym.length-1; x>=0; x--) {
			
			System.out.println(rym[x]);
		}
		
		// Print all values 5th index to 8th index
		
		System.out.println("the values from 5 to 8 : ");
		
		for (int x = 5; x<=8; x++) {
			
			System.out.println(rym[x]);
		}
		// Print all the values from 8th Index to 4th index
		
		System.out.println("the values from 8 to 4 : ");
			
			for (int x= 8; x>=4; x--) { 
				
				System.out.println(rym[x]);
		}
			
	}

}
