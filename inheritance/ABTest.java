package inheritance;

public class ABTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A a=new A();
		B b=new B();
		
		a.setM(10);
		a.setN(10);
		b.setM(5);
		b.setN(10);
		b.setC(10);
		
	   System.out.println("a.display1");
	   a.display1();
//	   System.out.print("b.display1"+" ");
//	   b.display1();
	   System.out.print("b.display2"+" ");
	   b.display2();
	   
	
	   
		
	}

}
