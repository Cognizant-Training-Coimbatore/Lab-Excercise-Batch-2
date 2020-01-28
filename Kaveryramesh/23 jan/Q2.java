package demo;

class student1
{
	int roll_no;
  String phone_no;
  String name;
  String address;
   
  student1(String name)
  { 
	  
	  
	  if(name=="sam")
	  {
		  name="sam";
	  roll_no=1;
	  phone_no="9745477224";
	  address="kochi";
	  }
	  
      else
	  {   name="john";
		  roll_no=2;
		  phone_no="97454772432";
		  address="thrissur";
	  }
	  
  }
  
  void display()
  {     
	  
	  System.out.println(name);
	  System.out.println(roll_no);
	  System.out.println(phone_no);
	  System.out.println(address);
  }
  
}


public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student1 s = new student1("sam");
		student1 s1 = new student1("john");
		
		s.display();
		s1.display();

	}

}
