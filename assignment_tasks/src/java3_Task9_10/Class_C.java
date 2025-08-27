package java3_Task9_10;

public class Class_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public Object CallingFromC () {
		
		Class_A.ob3 = new Class_A();
		
		Class_A ob4 = Class_A.ob3;
		
		System.out.println((Class_A.ob3).GetInteger1());
		System.out.println(Class_A.ob3.GetDouble1());
		System.out.println(Class_A.ob3.GetLong1());
		System.out.println(Class_A.ob3.GetString1());
		
for (int val : ob4.GetInteger2()) {
			
			System.out.print(val + " ");
			
		}
		
		for (int[] val2: ob4.Getintegere3()) {
			
			for (int val3: val2) {
				
				System.out.println(val3);
			}
		}
		
		
		
for (double dob : ob4.GetDouble2()) {
			
			System.out.print(dob + " ");
			
		}
		
		for (double[] dob2: ob4.GetDouble3()) {
			
			for (double dob3: dob2) {
				
				System.out.println(dob3);
			}
		}
		
for (long valeur : ob4.Getlong2()) {
			
			System.out.print(valeur + " ");
			
		}
		
		for (long[] valeur2: ob4.Getlong3()) {
			
			for (long valeur3: valeur2) {
				
				System.out.println(valeur3);
			}
		}
		
for (String Salut : ob4.GetString2()) {
			
			System.out.print(Salut + " ");
			
		}
		
		for (String[] Salut2: ob4.GetString3()) {
			
			for (String Salut3: Salut2) {
				
				System.out.println(Salut3);
			}
		}
		return ob4;


		
	}

}
