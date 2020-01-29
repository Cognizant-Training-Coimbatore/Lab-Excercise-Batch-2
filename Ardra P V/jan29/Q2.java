package apache;

public interface Q2 {
	void meth1();
	void meth2();

}
class example1 implements Q2 {

	
	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println(a*a);
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println(a*b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2A x=new Q2A();
		x.meth1();
		x.meth2();
		

	}
}



