class student1
{
	String name , addr;
	int roll_no;
	int ph_no;
	void assign(String a, String b , int c , int d) 
	{
		name = a;
		addr = b;
		roll_no = c;
		ph_no = d;
	}
	void display()
	{
		System.out.println("Name :" + name +" Address : " + addr + " roll no : " + roll_no + " phone : " + ph_no);
	}
}
public class exercise2_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 obj1 = new student1();
		student1 obj2 = new student1();
		obj1.assign("Sam", "chennai" , 5, 132465988);
		obj2.assign("John", "Kochi" , 10, 321654985);
		obj1.display();
		obj2.display();
	}

}
