package Project1;
class outer
	{
		void display()
		{
			System.out.println("Inside outer class....");
		}
		class inner
		{
			void display1()
			{
				System.out.println("Inside inner class....");
			}
		}
		inner inn=new inner();
		//inn.display1();
	}
	public class Q_no_5_29 {

		public static void main(String[] args) {
			outer o=new outer();
			o.display();
		}

	}
