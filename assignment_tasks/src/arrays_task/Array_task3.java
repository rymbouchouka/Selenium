package arrays_task;

public class Array_task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Create a string array with no limitation

		@SuppressWarnings("unused")
		String[] cities = {"Tokyo", "Paris", "Algiers", "Berlin", "Philadelphia"};
		
		for (String favoriteCities: cities) {
			
			System.out.println(favoriteCities);
		}
		
		 // Print value at index 2 and index 3
        
		System.out.println("Value at index 2: " + cities[2]);
        System.out.println("Value at index 3: " + cities[3]);

        // Print values from index 1 to last index using for loop
        
        System.out.println("\nValues from index 1 to last index:");
        for (int i = 1; i <= cities.length-1; i++) {
            System.out.println(cities[i]);
        }

		
		
	}

}
