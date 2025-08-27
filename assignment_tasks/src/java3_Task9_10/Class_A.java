package java3_Task9_10;

public class Class_A {
	
	
	private static Class_A ob1;
	
	public static Class_A ob2;

	public static Class_A ob3;

	public static void main(String[] args) {
		
		Class_A.ob1=new Class_A();
		
		
		System.out.println(ob1.GetInteger1());
		System.out.println(ob1.GetDouble1());
		System.out.println(ob1.GetLong1());
		System.out.println(ob1.GetString1());
		
		for (int val : ob1.GetInteger2()) {
			
			System.out.print(val + " ");
			
		}
		
		for (int[] val2: ob1.Getintegere3()) {
			
			for (int val3: val2) {
				
				System.out.println(val3);
			}
		}
		
		
		
for (double dob : ob1.GetDouble2()) {
			
			System.out.print(dob + " ");
			
		}
		
		for (double[] dob2: ob1.GetDouble3()) {
			
			for (double dob3: dob2) {
				
				System.out.println(dob3);
			}
		}
		
for (long valeur : ob1.Getlong2()) {
			
			System.out.print(valeur + " ");
			
		}
		
		for (long[] valeur2: ob1.Getlong3()) {
			
			for (long valeur3: valeur2) {
				
				System.out.println(valeur3);
			}
		}
		
for (String Salut : ob1.GetString2()) {
			
			System.out.print(Salut + " ");
			
		}
		
		for (String[] Salut2: ob1.GetString3()) {
			
			for (String Salut3: Salut2) {
				
				System.out.println(Salut3);
			}
		}


		
		
	}
	
	// NS methods integer type
	
	public int GetInteger1() {
		
		
		return 100;
		
	}
	
	public int[] GetInteger2() {
		
		return new int[] {10,15,20};
	}
	
	public int [][]Getintegere3(){
		
		return new int [][] {{1,2},{3,4}};
		
		}
	
	// NS methods Double type 
	
	public double GetDouble1() {
		
		return 55.55;
	}
	
	public double[] GetDouble2() {
		
		return new double[] {63.25,25.244};
		
	}
	
	public double[][] GetDouble3(){
		
		return new double[][] {{25.36,47.48},{214.23,458.25}};
		
		
	}
	// NS methods String type
	public String GetString1() {
		return "Hello Rym";
		
	}
	public String[]GetString2(){
		
		return new String[] {"Hello Rym", "Hello Adam"};
	}
	
	public String[][]GetString3(){
		
		return new String[][] {{"Hello Adam","Hello Rym"},{"Hello World", "Peace and Love"}};
	}
	
	//NS Methods long type
	
	public long GetLong1() {
		
		return  (long) 2555555555.2557;
		
		
	}
	public long[]Getlong2(){
		return new long[] {(long) 100.244,(long) 2554.2145};
		
	}
	
	public long[][] Getlong3(){
		return new long[][] {{(long) 123.236,(long) 4458.23665},{(long) 124.236,(long) 147.1478}};
	} 
	
			
}
