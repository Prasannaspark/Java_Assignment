package Stringassignments;

import java.util.*;


public class AnagramAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String a1="software";
		char s1[]=a1.toCharArray();
		Arrays.sort(s1); 
		String a2="swearoft";
		char s2[]=a2.toCharArray();
		Arrays.sort(s2);
	
        int count=0;
		if(a1.length()!=a2.length()) {
			System.out.println("not a anagram");
			}
		
		
		for(int i=0;i< a1.length();i++){
			 count=0;

			 for(int j=0;j<a1.length();j++) {
				 if(s1[i]==s2[j]) {
					 count++;
				 }
			 }
			
		}
		
		if(count==a1.length()-1) {
			System.out.println("anagram");
		}
		
		else {
			System.out.println("no");
		}

	}

}
