package Task_Java_Practice3;

import java.text.Format;

public class Task_8 {
	
	// 1)  5 return type methods with arguments 
	
	
	public static int addition(int x, int y, int z) {
		
		return x+y+z;
		
	
	}
	
	public static String welcomeMsg(String message) {
		
		return message;
		
	}
	
	public static double Multiplication(double a, double b) {
		
		double result;
		
		return  result = a*b;
	}
	
	public static char GetLetters(char lettre) {
		
		return lettre;
	}
	
	public static boolean great(int number) {
		
		return number% 2 == 0;
	}
	
	

	// Main method calling
	
	public static void main (String[] args) {
		
		
	System.out.println("the addition is  :"+ addition(5,6,2));
	
	System.out.println(welcomeMsg("Hello Rym"));
		
	System.out.println(Multiplication(10,2));		
	System.out.println(GetLetters('A'));
	System.out.println(great(20));
		
		
	//Array returns
		
	System.out.println(tableau("Rym", 40, true));
		
	System.out.println(IntArray(35));
	System.out.println(Rym(null));
	
	System.out.println(Adam(3, 10));
		
		int x = 10;
		
		int y = x;
		
	
	 Object [] def = tableau("rym" , 18, true);  // Object[]
	 
	 //for (Object x : def ) {
		 System.out.println(x);
	// }
	
	}

	
	// 2 ) 4 methods Return type with arguments array and object
	
		//1.  one dim object method
		
		public static Object[] tableau(String name , int size, boolean status) {
			
			 Object[] abc = {name, size, status};
			 
			 return abc;
			 
		}
		
		
		//2. one dim integer array return
		
		public static int[] IntArray(int age) {
			
			int[]arr = new int[age];
			
			for (int i = 0; i < age; i++) 
				
			arr[i] = i*2;
			return arr;
			
		}
		
		//3. two dim String array return
		
		public static String[][] Rym(String name) {
			
			String[][] matrix = new String[2][2];
			
			return new String[][] { 
				
				{"January", "March"},
				
				{"Feburuary", "April"}
				
			};
		
		}
		
		//4. two dim object return
		
		public static Object[][] Adam(int row, int col) {
			
			Object [][]mat = new Object [row][col];
			
			for (int i = 0; i <row; i++) 
				for (int j =0; j<col; j++)
					mat[i][j]= "cell["+ i + "][" + j + "]";
			return mat;
		
			
			}
		
		// Main Method Calling (look up )
		
		
		
	
	public static String[]schoolGrade(){
		
		return new String[] {"Grade 1", "Grade 2"};
		
	}
	
	
	
	
	
	
}
