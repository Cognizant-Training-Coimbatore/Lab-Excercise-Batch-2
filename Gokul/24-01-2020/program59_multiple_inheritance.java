package gokul;
class c
{
	int x=100;
}
class d extends c
{
	int y=100;
}
class e extends d
{
	void display()
	{
		System.out.println(x+" "+y);
	}
}

public class program59_multiple_inheritance {

	public static void main(String[] args) 
	{
    e obj=new e();
    obj.display();
	}

}
