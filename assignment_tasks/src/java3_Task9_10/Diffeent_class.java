package java3_Task9_10;

public class Diffeent_class {

	private static Class_A ob2;

	public static void main(String[] args) {
		
       Class_A.ob2=new Class_A();
		
		
		System.out.println(ob2.GetInteger1());
		System.out.println(ob2.GetDouble1());
		System.out.println(ob2.GetLong1());
		System.out.println(ob2.GetString1());
		
		for (int val : ob2.GetInteger2()) {
			
			System.out.print(val + " ");
			
		}
		
		for (int[] val2: ob2.Getintegere3()) {
			
			for (int val3: val2) {
				
				System.out.println(val3);
			}
		}
		
		
		
for (double dob : ob2.GetDouble2()) {
			
			System.out.print(dob + " ");
			
		}
		
		for (double[] dob2: ob2.GetDouble3()) {
			
			for (double dob3: dob2) {
				
				System.out.println(dob3);
			}
		}
		
for (long valeur : ob2.Getlong2()) {
			
			System.out.print(valeur + " ");
			
		}
		
		for (long[] valeur2: ob2.Getlong3()) {
			
			for (long valeur3: valeur2) {
				
				System.out.println(valeur3);
			}
		}
		
for (String Salut : ob2.GetString2()) {
			
			System.out.print(Salut + " ");
			
		}
		
		for (String[] Salut2: ob2.GetString3()) {
			
			for (String Salut3: Salut2) {
				
				System.out.println(Salut3);
			}
		}


		
	}}

	


