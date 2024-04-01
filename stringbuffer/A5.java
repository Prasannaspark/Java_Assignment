package stringbuffer;
public class A5 {

	public static void main(String[] args) 
	{
		String hi = "Hi, ";
		String mom = "mom.";
		System.out.println(hi.concat(mom));
		String s3 = hi+mom;
		System.out.println(s3);
		
		StringBuffer strbuf = new StringBuffer();
		strbuf.append(hi);
		strbuf.append(mom);
		System.out.println(strbuf);
	}

}