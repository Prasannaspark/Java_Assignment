package Stringassignments;

public class StringAss4 {
	
	
	
	String reverseString(String str)
	{
		
	     if (str == null || str.length() <= 1) {
	            return str;
	        }
	        // Recursive case: reverse the substring excluding the first character
	        // and concatenate the first character to the end of the reversed substring
	     else {
	    	 
	    	 //object
	    	 
	    	 //bject+o;
	    	 //ject+bo;
	    	 return reverseString(str.substring(1)) + str.charAt(0);
	     }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringAss4 obj=new  StringAss4();
		 String str="palindrome";
	String generalfor="";
		System.out.print("using General for loop alone= ");
		for(int i=str.length()-1;i>=0;i--) {
			
			generalfor+=str.charAt(i);
			
		}
         
		System.out.println(generalfor);
	
		
		System.out.println("***********************************");
		
	String show=obj.reverseString(str);
 System.out.print("using Recursion =    ");	
  	System.out.println(show);
		
	}

}
