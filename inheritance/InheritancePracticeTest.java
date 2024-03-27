package inheritance;
class A1{
	void display() {
		System.out.println("class A1");
		
	}
}

class B1 extends A1{
	
	void display() {
		
		super.display();
		System.out.println("class B1");
	}
	
}

public class InheritancePracticeTest {

  public static void main(String[] args) {
		B1 obj=new B1();
		obj.display();
	
	}

}
