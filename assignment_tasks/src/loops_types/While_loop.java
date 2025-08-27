package loops_types;

public class While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Print 2 to -10 
		
		int i0= 2;
		
		while (i0>=-10) { 
			
			System.out.println(i0 + " "); 
		
		    i0--;
		    
		}
		    
		    // Print 3 to 20;
		    
		    int i1= 2;
			
			while (i1<=20) { 
				
				System.out.println(i1 + " "); 
			
			    i1++;
		}
			System.out.println(i1);
			
			
			// Print -355 to -255
			
			 int i2= -355;
				
				while (i2<=-255) { 
					
					System.out.println(i2 + " "); 
				
				    i2++;
			}
				System.out.println();
				
				// Print -5 to 5 and break if the value is 3
				
				int i = -5;
		        while (i <= 5) {
		            if (i == 3) break;
		            System.out.println(i + " ");
		            i++;
		        }
		        System.out.println();


	}

}
