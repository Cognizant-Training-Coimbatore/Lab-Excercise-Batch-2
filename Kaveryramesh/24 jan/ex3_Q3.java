package demo;
class t6
{
	int a=2;
	
  }
class t5 extends t6
{
	int b=5;
  }
class t4 extends t5
{
	int c=a+b;
	void display()
	{
		System.out.println(c);
	}
  }


public class ex3_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		t4 t=new t4();
		t.display();


	}

}
