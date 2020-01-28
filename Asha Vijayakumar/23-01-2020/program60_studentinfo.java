class stud
{
	String name;
	int roll_no;
	void display(int roll_no,String name)
	{
		System.out.println(+ roll_no);
		System.out.println(name);
		
	}
	
}
public class program60_studentinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud obj = new stud();
		obj.display(2,"john");

	}

}
