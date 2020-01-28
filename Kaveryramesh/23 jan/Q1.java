package demo;
class student
{
	
  int roll_no;
  String name;
   
  student()
  {
	  name="John";
	  roll_no=2;
  }
  
  void display()
  {
	  System.out.println(name);
	  System.out.println(roll_no);
  }
  
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           student s=new student();
           s.display();
	}

}
