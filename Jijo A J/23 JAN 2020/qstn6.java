class student2
{
	
	String name;
	student2()
	{
		name="UNKNOWN";
	}
	student2(String n)
	{
		name=n;
	}
	void display1()
	{
		System.out.println("name : "+name);
	}
	}
public class qstn6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student2 xx=new student2();
xx.display1();
student2 xxx=new student2("ALAN");
xxx.display1();
	}

}
