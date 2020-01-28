class student2
{
	String name;
	int mob;
	String add;
	
	student2()
	{
		name="john";
		mob=123;
		add="house";
	}
	student2(String s,int a,String r)
	{
		
		name=s;
		mob=a;
		add=r;
		
	}
	void display()
	{
		System.out.println("Name= "+name+" \nmobile= "+mob+" \nAddress= "+add);
	}
	
	
}
public class student32 {

	public static void main(String[] args) 
	{
			student2 obj1 = new student2();
			student2 obj2 = new student2("sam",22,"home");
			obj1.display();
			obj2.display();
			
		

	}

}
