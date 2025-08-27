package Task_Java_Practice3;

public class Task_5 {

	// Method 1 : Integer addition
	
	public static void Addinteger() {
		
		int a = 10, b=20;
		
		int sum= a+b;
		System.out.println("addition of integers is "+ sum);
		
	}
	
	     //Method 2: subtraction
	
	public static void subtractDoubles() {
		
		double x = 15.5, y = 5.2;
		
		double result = x-y;
		
		System.out.println("result of subtraction is "+ result);
		
		
	}
	
	// method 3: String 
	
	public static void rym() {
		
		String name = "Rym";
		
		System.out.println("Hello" + name + ", have a nice day");
		
	}
	// method 4 : Boolean logic
	
	public static void checkEligibility() {
		
		int age = 18;
		boolean isEligible = age >= 18;
		
		if(age>=18) {
			
			System.out.println("you are Eligible.");
		} 
		
		else { 
			System.out.println("you are not Eligible.");
				
			}
		
		}
		
		// method 5 : Character 
	
	public static void diplayGrade() {
		
		char grade = 'A';
		System.out.println("your grade is "+ grade);
		
			
	}
	
	// Main method calling 
	
	public static void main (String[] args) {
		
		diplayGrade();
		checkEligibility();
		subtractDoubles();
		rym();
		Addinteger();
		
		
	}
	

}
