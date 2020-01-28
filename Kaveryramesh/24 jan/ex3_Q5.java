package demo;
class shape
{
	void print()
	
	{
		System.out.println("this is shape");
	}
  }
class rectangle extends shape
{
	
	void print1()
	
	{
		System.out.println("this is rectangle shape");
	}
    }

class circle extends shape
{
	

	void print2()
	
	{
		System.out.println("this is circular shape");
	}



}
class square extends rectangle
{
	
void print3()
	
	{
		System.out.println("square is rectangle");
	}

	}
public class ex3_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		square s=new square();
		s.print();
		s.print1();
		
	}

}
