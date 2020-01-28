package demo;
class student2
{
	String name;
	
	student2()
	{
		name="unknown";
		
	}
	student2(String n)
	{
		name=n;
	}

void display()
{
   System.out.println(name);	
 }
}



public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student2 s=new student2();
		s.display();
		student2 s1=new student2("kavery");
		s1.display();

	}

}
