class sample1
{
	static int i;// if the static is not given, the value of i will be re-inititalized
	void display()
	{
		i++;
		System.out.println(i);
	}
}
public class program44_static_variable {

	public static void main(String[] args) {
		sample1 obj1=new sample1();
		obj1.display();
		sample1 obj2=new sample1();
		obj2.display();// if no static is given to i ,the output of this will be 1
	}

}
