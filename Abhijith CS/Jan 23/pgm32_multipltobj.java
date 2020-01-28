class Student1
{
	String name,addres;
	int roll_no;
	long ph;
	void display()
	{
		System.out.println(name);
		System.out.println(addres);
		System.out.println(roll_no);
		System.out.println(ph);
	}
}
public class pgm32_multipltobj {

	public static void main(String[] args) 
	{
		Student1 st1 = new Student1();
		Student1 st2 = new Student1();
		st1.name="Abhijith";
		st1.addres="Rose Garden";
		st1.roll_no=1;
		st1.ph=1234567890;
		st2.name="Irfan";
		st2.addres="Rose Villa";
		st2.roll_no=2;
		st2.ph=1234567899;
		st1.display();
		st2.display();
	}

}
