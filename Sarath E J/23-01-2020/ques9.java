
class Print
{
	void display(int a, String b)
	{
		System.out.println(a+" "+b);
	}
	void display(String b, int a)
	{
		System.out.println(a+" "+b);
	}
}
public class prog36 {

	public static void main(String[] args) 
	{
		
		Print obj=new Print();
		obj.display(1,"Sarath");
		obj.display("hey", 2);

	}

}
