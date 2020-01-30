package demo;
class t1
{
	int a=2;
	
  }
class t2 extends t1
{
	int b=5;
  }
class t3 extends t2
{
	int c=a+b;
	void display()
	{
		System.out.println(c);
	}
  }


public class program_23_multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		t3 t=new t3();
		t.display();

	}

}
