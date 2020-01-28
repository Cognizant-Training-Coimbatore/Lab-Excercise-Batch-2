package demo;
class student1
{
	int rollno;
	String name;
	String add;
	 String phone;
	 

void display()
{
 System.out.println(rollno);	
 System.out.println(name);	
 System.out.println(add);	
 System.out.println(phone);	
}
}
public class program35_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 obj1=new student1();
		student1 obj2=new student1();
		obj1.name="Sam";
		obj1.rollno=2;
		obj1.add="aghagha,fgafytf,kerala\npin-635245";
		obj1.phone= "82752661456";
		obj2.name="john";
		obj2.rollno=6;
		obj2.add="knbhkj,gshgshgs,hsghgxvvxbv,kerala,pin-652478";
		obj2.phone= "9753887650";
		
		obj1.display();
		obj2.display();
		 
		
	}

}
