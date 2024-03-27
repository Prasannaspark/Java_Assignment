package Stringassignments;

import java.util.Scanner;

public class StringAss3 {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        
        String input = scanner.nextLine();
        System.out.println("Permutations of " + input + ":");
        
        permute(input.toCharArray(), 0, input.length() - 1);
    }
 
    public static void permute(char[] arr, int start, int end) {
        if (start == end)
        {
            System.out.println(String.valueOf(arr));
        }
        else
        {
            for (int i = start; i <= end; i++)
            {
                swap(arr, start, i);
                permute(arr, start + 1, end);
                swap(arr, start, i);
            }
        }
    }
 
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
