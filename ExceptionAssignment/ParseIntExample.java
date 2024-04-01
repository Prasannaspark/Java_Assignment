package ExceptionAssignment;

import java.util.Scanner;

public class ParseIntExample {
	public static void main(String[] args) {
		
		
	int val,sum=0;
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter your line");
	// only for scanner class we can use has Next function so 
	//storing the string input to the Line (as Object of Scanner class)
	Scanner Line=new Scanner(s.nextLine());
	
	try {
		
		
	while(Line.hasNext()) {
		val=Integer.parseInt(Line.next());
		sum+=val;
		
	}
		}
		
		catch(NumberFormatException e) {
			
		}
	System.out.println(sum);
	}
 
}