package assignment_task22_23;

public class Calculate_tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// calculate the average
		
		
		int Math = 60;
		int science = 66;
		int physics = 48;
		int biology = 74;
	
	int total = Math + science+physics+biology;
	double average = total /4;
	
	System.out.println("Total Score is " + total+"\n"+"Average Score is " + average);
	
	// use if-else-if statement to calculate grade
	
	if (average>=90) {
		
		System.out.println("Grade A");
	}
	
	else if (average>=80) {
		
		System.out.println("Grade B");
	}
	else if(average>=60) {
		
		System.out.println("Grade C");
	}
	else {
		
		System.out.println("Grade D");
	}
	}

}
