package day3;
class sample
{
	static int i;
	void display()
	{
		i++;
		System.out.println(i);;
	}
}
public class Static_variable 
{
	public static void main(String[] args) 
	{
		sample obj=new sample();
		obj.display();
		sample obj2=new sample();
		obj2.display();
	}
}
