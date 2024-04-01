package stringbuffer;
import java.util.Scanner;

public class A6 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String input = scanner.nextLine();
	    System.out.print(input.charAt(0));
	    for(int index=0; index<input.length();index++)
	    {
	    	if(input.charAt(index) == ' ')
	    	{
	    		System.out.print(input.charAt(index + 1));
	    	}
	    	else continue;
	    }
	}
}