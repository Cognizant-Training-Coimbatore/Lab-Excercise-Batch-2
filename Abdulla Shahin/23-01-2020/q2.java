class student2
{
	int roll,phone;
	String name,address;
	void assign(String a,int b,int c,String d)
	{
		name=a;
		roll=b;
		phone=c;
		address=d;
		System.out.println(name+" "+roll+" "+phone+" "+address);
	}
}
public class q2 {

	public static void main(String[] args)
	{
		student2 obj = new student2();
		obj.assign("Sam", 1, 223344, "ksd");
		student2 obj2 = new student2();
		obj2.assign("John", 2, 225577, "kgd");


	}

}
