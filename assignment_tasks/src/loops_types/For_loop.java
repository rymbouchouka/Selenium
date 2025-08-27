package loops_types;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Print 2 to -10
		
		for (int x=2; x >=-10;x--) {
			
			System.out.println("the value of x is" + x);
		}
		
		// Print 3 to 20
		
      for (int y=3; y <= 20 ;y++) {
			
			System.out.println("the value of y is " + y);
		}
      
      
      // Print -355 to -255
		
      for (int a=-355; a <= -255 ;a++) {
			
			System.out.println("the value of a is " + a);
	}
      
      // Print -956 to -960
      
      for (int b=-956; b >=-960;b--) {
			
			System.out.println("the value of b is" + b);
		}
      
      
      // Print -5 to 5 and break if the value is 3
      
      for (int  z = -5; z<=5; z++) {
    	  
    	  if (z==3)break;
    	  
    	  System.out.println("the value of z is " + z);
      }
      
      // Print-500 to -200  and break if the value of the variable is -278
      
          for (int  i = -500; i<=200; i++) {
    	  
    	  if (i==-278)break;
    	  
    	  System.out.println("the value of i is " + i);
      
          }
	}
}
