package Kvalentpackage;

abstract  class Quad {
	int l;
	int w;
	
	abstract int  area(int a,int b);
	
	
	public Quad() {
		
	}

	public Quad(int l, int w) {
		super();
		this.l = l;
		this.w = w;
	}




	public int getH() {
		return l;
	}

	public void setH(int l) {
		this.l = l;
	}

	public int getB() {
		return w;
	}

	public void setB(int w) {
		this.w = w;
	}
	
	

}
