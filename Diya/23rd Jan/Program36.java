class student2
{
	student2()
	{
		System.out.println("Unknown");
	}
	student2(String a)
	{
		System.out.println(a);
	}
}
public class Program36 {

	public static void main(String[] args) {
		student2 obj1 = new student2();
		student2 obj2 = new student2("John");

	}

}
