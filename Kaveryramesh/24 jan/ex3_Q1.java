package demo;
class A2
{
  int a=10;	
}
class b extends A2
{
	int b=20;
	void display()
	{
		System.out.println("FRom class a-"+a+"\nFrom class b-"+b);
	}
  }

public class ex3_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		b b1 =new b();
b1.display();
	}

}
