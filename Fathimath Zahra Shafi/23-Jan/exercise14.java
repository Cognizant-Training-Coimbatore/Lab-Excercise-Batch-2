class student 
{
	String name;
	int roll_no;
	
	student()
	{
		name="john";
		roll_no=2;
	}
	
	void display() {
		System.out.println("name :"+name);
		System.out.println("roll no: " +roll_no);
	}
	
}



public class exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s = new student();	
		s.display();

	}

}
