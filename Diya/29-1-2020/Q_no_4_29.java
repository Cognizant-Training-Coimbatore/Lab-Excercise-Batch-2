package Project1;
	interface test
	{
		void square(int x);
	}
	class arithmetic implements test
	{

		@Override
		public void square(int x) 
		{
			System.out.println("Area...."+x*x);
		}
	}
	class TotestInt extends arithmetic
	{
		arithmetic ar = new arithmetic();
		TotestInt(int y)
		{
			ar.square(y);
		}
	}
	public class Q_no_4_29 {

		public static void main(String[] args) {
			TotestInt tti=new TotestInt(5);
		}

	}
