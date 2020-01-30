package project1;
class outerclass
{
	public void display()
	{
		System.out.println("outer class");
	}
	class innerclass
	{
		public void display()
		{
			System.out.println("inner class");
		}
	}
	}


public class ex7_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				// TODO Auto-generated method stub
		outerclass xx=new outerclass();
		outerclass.innerclass xxx=xx.new innerclass();
		xx.display();
		xxx.display();
			}

		}



