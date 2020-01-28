class student
{
	String name;
	int roll_no;
	

void assign(String a,int b)
{
	name=a;
	roll_no=b;
}


void display()
{
	System.out.println(name);
	System.out.println(roll_no);
}
}
public class pgm34_string_class {

	public static void main(String[] args)
	{
		student obj=new student();
		obj.assign("john",2);
		obj.display();
	}

}

