package demo;
class sample6
{
	int i=6;
    }
class sample61 extends sample6
{   
	void display()
	{
		System.out.println(i);
	}
   }

public class program_23_single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sample61 obj1=new sample61();
		
		obj1.display();

	}

}
