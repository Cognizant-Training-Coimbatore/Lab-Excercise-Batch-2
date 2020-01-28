class student
{
	String s1;
	int a;
void display()
{
	System.out.println("name: "+s1);
	System.out.println("roll_no: "+a);
}
}
public class prog34_class_string
{

	public static void main(String[] args) 
	{
		student obj=new student();
		obj.s1="John";
		obj.a=8;
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
