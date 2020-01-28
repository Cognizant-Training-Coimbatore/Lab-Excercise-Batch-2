package demo;
/*Write a program to print the names of students by creating a Student class.
 *  If no name is passed while creating an object of Student class, then the name 
 *  should be "Unknown", otherwise the name should be equal to the String value passed 
 *  while creating object of Student class. */

class Student_
{
	String name;
	Student_()
	{
		name="Unknown";
	}
	Student_(String string)
	{
		name=string;
	}
	void display()
	{ 
		System.out.println("Name : "+name);
	}
}


public class program22f_class_name_of_students
{
	public static void main(String[] args)
	{
		Student_ sc1=new Student_("Sam");
		Student_ sc2=new Student_();
		Student_ sc3=new Student_("John");
		sc1.display();
		sc2.display();
		sc3.display();
		
	}
	
}
