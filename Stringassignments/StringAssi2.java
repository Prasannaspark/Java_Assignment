package Stringassignments;

import java.util.Scanner;

public class StringAssi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		
		int vc=0;
		int cc=0;
		int count=0;
		String p="aabbbccc";
		char[] arr={'a','e','i','o','u'};
		
		
		for(int i=0;i<arr.length;i++) {
			count=0;
			for(int j=0;j<p.length();j++) {
				if(p.charAt(j)==arr[i]) {
					
					count++;
					
				}
			}
			
			System.out.println(count+" "+a);
		}
		
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a' || a.charAt(i)=='e' ||a.charAt(i)=='i' ||a.charAt(i)=='o' ||a.charAt(i)=='u') {
				vc++;
				
			}
			else {
				cc++;
			}
		}
		
		System.out.println(vc);
	System.out.println(cc);

	}

}

