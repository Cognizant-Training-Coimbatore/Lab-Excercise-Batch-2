class Student_1
{
	int roll_no;
	long phone_no;
	String address;
	void assign(int roll_no1,long phone_no1,String address1)
	{
		roll_no=roll_no1;
		phone_no=phone_no1;
		address=address1;
		
				
	}
	void display()
	{
		System.out.println(" "+roll_no + " "+ phone_no +" "+ address);
	}
	
}
public class programq2_std {

	public static void main(String[] args) 
	{
		Student_1 s1=new Student_1();
		Student_1 s2=new Student_1();
		s1.assign(7, 989878089, "Houseno");
		s2.assign(8,687787980, "faltno");
		s1.display();
		s2.display();

	}

}
