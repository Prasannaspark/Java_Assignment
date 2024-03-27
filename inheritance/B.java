package inheritance;

class B extends A{
	
int c;

void display2() {
	System.out.println(c+getM()+getN());
}

public int getC() {
	return c;
}

public void setC(int c) {
	this.c = c;
}




}
