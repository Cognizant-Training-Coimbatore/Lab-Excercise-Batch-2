package gokul;
class student
{
	void assign(String name,int roll_no)
	{
	int rl=roll_no;
	String s=name;
	System.out.println("Name : "+name);
	System.out.println("Roll. no: "+roll_no);
	}
}

public class program32_student 
{

	public static void main(String[] args) 
	{
	student s=new student();
			s.assign("John",12);
			
	}

}
