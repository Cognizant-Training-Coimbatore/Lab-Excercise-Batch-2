package demo;
class a1
{
	int x=10;
  }
class b1 extends a1{
	int x=100;
	void display()
	{
		System.out.println(super.x);//otherwise it will display 100
	}
}

public class program_25_super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        a1 a=new a1();
        b1 b=new b1();
        
        b.display();
	}

}
