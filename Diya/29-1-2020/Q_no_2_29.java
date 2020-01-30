package Project1;
	interface A
	{
		void meth1();
		void meth2();
	}
	class Myclass implements A
	{
		public void meth1()
		{
			System.out.println("Inside meth1....");
		}
		public void meth2()
		{
			System.out.println("Inside meth2....");
		}
	}
	public class Q_no_2_29 {

		public static void main(String[] args) {
			Myclass mc = new Myclass();
			mc.meth1();
			mc.meth2();
		}

	}
