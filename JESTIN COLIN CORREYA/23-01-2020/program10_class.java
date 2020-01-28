package demo;



class test
{
	int x;
	void assign(int p)
	{
		x=p;
	}
	void display()
	{
		System.out.println(x);
		//System.out.println(p);//
	}
	
}
public class program10_class 
{

	public static void main(String[] args) 
	
		// TODO Auto-generated method stub
		{
			test obj=new test();
			obj.assign(10);
			obj.display();
		}
		
		

	}


