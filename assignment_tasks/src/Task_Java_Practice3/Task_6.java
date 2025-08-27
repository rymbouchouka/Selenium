package Task_Java_Practice3; // Methods with arguments

public class Task_6 {
	
	// Method 1 String input
	
	public static void welcomeUser(String name) {

		
		
		System.out.println( "welcome, " + name );
		
	}
	
	//Method 2: Char input
	
	public static void displayGrade(char grade) {
		
		System.out.println("your grade is "+ grade);
		
	}
	
	// Method 3: Double input
	
	public static void discount(double price) {
		
		double newPrice = price * 0.5;
		
		System.out.println("new price is $ " + newPrice);
		
	}

	
	// Method 4: integer input with logic 
	
	public static void checkvotingAge( int age) {
		
		if (age >=18) {
			
			System.out.println("you are eligible to vote.");
		}
			
		else {
				
				System.out.println("you are not eligible to vote");
			}
	}
		
		// Method 5 : boolean input
		
		public static void loginstatus(boolean loggedIn) {
			
			if (loggedIn) {
				
				System.out.println("you are logged in");
				
			}
			
			else {
				
				System.out.println("you are not logged in ");
				
			}
			
		}
			
			// main method 
			
			public static void main(String[] args) {
				
				loginstatus(true);
				checkvotingAge(18);
				discount(250.75);
				displayGrade('A');
				welcomeUser("Rym");
			
		}
		
	
	
	
}
