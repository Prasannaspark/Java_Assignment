package ExceptionAssignment;
import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		int[] count = new int[26];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a single word : ");
		String word = scan.nextLine();
		word = word.toUpperCase();
	    int i=0;
		try {
			
		for( i=0; i<word.length();i++)
		{     
			count[word.charAt(i) - 'A']++ ;

		}
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Not a letter.\nexception encountered : " + word.charAt(i));
		}
		for(i=0; i<count.length; i++)
		{
				if(count[i] != 0) 
					System.out.println((char)(i+'A') + ": " + count[i]);
		}
		
	}
}