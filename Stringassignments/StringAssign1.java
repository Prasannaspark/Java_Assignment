package Stringassignments;

public class StringAssign1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stllllllub
		
		
		String a="3456"; 
//		int arr[]=new int[]
		int count=0;
		
		for(int i=0;i<a.length();i++) {
			
			if(a.charAt(i)>='A' && a.charAt(i)<='Z'){
				
			}
			
			
			
//			if(Character.isDigit(a.charAt(i)))
			else {
				count++;
			}
		}
		
		if(count==a.length()) {
			System.out.println("contains only digit");
		}
		else {
			System.out.println("conatins alpha also");
		}

	}

}
