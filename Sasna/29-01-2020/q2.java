package excercise;



interface A {
	void meth1();
	void meth2();
}
	class MyClass implements A {

		@Override
		public void meth1() {
			// TODO Auto-generated method stub
			System.out.println("method1");
			
		}

		@Override
		public void meth2() {
			// TODO Auto-generated method stub
			System.out.println("method2");
			
		}
		
	}


public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		obj.meth1();
		obj.meth2();
		

	}

}
