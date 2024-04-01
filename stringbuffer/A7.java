package stringbuffer;
import java.io.*;
import java.util.*;

public class A7 {
	
	static boolean areAnagram(char[] str1, char[] str2)
	{
		int n1 = str1.length;
		int n2 = str2.length;

		if (n1 != n2)
			return false;

		Arrays.sort(str1);
		Arrays.sort(str2);

		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String1 :");
		String string1=scan.nextLine();
		System.out.println("Enter String2 :");
		String string2=scan.nextLine();
		string1 = string1.replace(" ","");
		string2 = string2.replace(" ","p");
		char[] str1=string1.toCharArray();
		char[] str2=string2.toCharArray();
		scan.close();
		if (areAnagram(str1, str2))
			System.out.println("The two strings are"
							+ " anagram of each other");
		else
			System.out.println("The two strings are not"
							+ " anagram of each other");
	}
}