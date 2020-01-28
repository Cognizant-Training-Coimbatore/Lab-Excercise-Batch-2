class Student1
{
	void display(String name, int rollnum, String phone, String address)
	{
		System.out.println(name +"\t" + rollnum +"\t" + phone +"\t" + address);
	}
}
public class question2 {

	public static void main(String[] args) {
		Student1 obj= new Student1();
		Student1 obj2= new Student1();
		obj.display("Sam",3,"9074526721","House no 2 , Coimbatore");
		obj2.display("John",8,"7772882782","House no 5 , Kerala");
	}

}
