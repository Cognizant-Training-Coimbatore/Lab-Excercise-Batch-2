package project1;

import project1.outer.inner;

class outer
{
	void display()
	{
		String name="Gopika";
		System.out.println("Name  :"+name);
	}
	class inner
	{
		void display1()
		{
			String place="Trivandrum";
			System.out.println("Place  :"+place);
		}
	}
}
public class prgd29_q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  outer obj=new outer();
  outer.inner obj1=obj.new inner();
  
  obj.display();
  obj1.display1();
	}

}
