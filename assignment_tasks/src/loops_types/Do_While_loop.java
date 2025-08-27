package loops_types;

public class Do_While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Print 2 to -10
		
		int i = 2;
		
		do { System.out.println("the value of i is "+ i);
		
		i--;
		} while (i>=-10);
		
		System.out.println("the value of i " + i);
		
		 // Print 3 to 20
		        int i0 = 3;
		        do {
		            System.out.print(i0 + " ");
		            i0++;
		        } while (i0 <= 20);
		        
		        
		        System.out.println();
		    

		    // Print -355 to -255
	
		        int i1 = -355;
		       
		        do {
		            System.out.print(i1 + " ");
		            i1++;
		            
		        } while (i1 <= -255); 
		        
		        System.out.println(i1);
		        
		        
		   // Print -956 to -960
		        
		        int i2=-956;
		        do {
		        	System.out.println(i2+ " ");
		        	
		        	i2--;
		        } while (i2>=-960);
		 

     // Print -5 to 5 and break if the value is 3
		        
		        int i3 = -5;
		        do {
		            if (i3 == 3) break;
		            
		            System.out.print(i3 + " ");
		            i3++;
		        } while (i3 <= 5);
		        System.out.println();
		    

		 // Print -500 to -200 break if the value is -278
		        
		        int i4 = -500;
		        
		        do {
		            if (i4 == -278) break;
		            System.out.print(i4 + " ");
		            i4++;
		        } while (i4 <= -200);
		        System.out.println();


	}

}
