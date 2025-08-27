package Task_Java_Practice3;

public class Task_7 {
	
	// 1) Return type methods without arguments
	
	// integer return
	
	public static int sum() {
		
		int a = 10 , b = 20;
		 
		return a+b;
		
	}
	
	// double return
	
	public static double discount() {
		
		double price = 250.69;
		
		return  price*0.1;
		
	}
	
	// String Return
	
	public static String name() {
		
		return "Rym Bouchouka";
		
	}
	
	// Boolean return
	
	public static boolean reminder() {
		
		int x = 40;
		return x % 2 == 0;
	}
	
	// char Return
	
	public static char grade() {
		
		return 'A';
		
	}

	//Calling the Methods
	
	public static void main(String[]args) {
		
		System.out.println("Grade: "+ grade());
		System.out.println("th reminder is " + reminder());
		System.out.println("hello " + name());
		System.out.println("the discount is " + discount());
		System.out.println("the sum is " + sum());
		
	// second part 
		
		for (Object obj: tableau()) {
			
			System.out.println(obj);
		}
		
		for (int numero: IntArray()) {
			
			System.out.println(numero);
		}
		
		for (String[] row: Rym()) {
			
			for (String val: row) {
			
		System.out.print(val + " ");
		}
			System.out.println();
		}
		
		for (Object[] ligne: Adam()) {
			
		for (Object valeur : ligne) {
				
				System.out.print( valeur+ " ");
			}
			
			System.out.println();
		}
	}
	
	// 2 ) 4 methods Return type without arguments array and object
	
	//1.  one dim object method
	
	public static Object[]tableau() {
		
		return new Object[] {"Rym", 100, true};
	}
	
	
	//2. one dim integer array return
	
	public static int[] IntArray() {
		
		return new int[] {5,10,15};
	}
	
	//3. two dim String array return
	
	public static String[][] Rym() {
		
		return new String[][] { 
			
			{"January", "March", "May"},
			
			{"Feburuary", "April", "Jun"}
			
		};
	
	}
	
	//4. two dim object return
	
	public static Object[][] Adam() {
		
		return new Object[][] {
			{"Kindergarden", 2},
			{"first Grade", 1}
		};
		
		}
	
	// Main Method Calling (look up )
	
	
	
	
	}

