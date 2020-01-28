package day4a;
import day4.Q1_inherit_ouside_package_superclass;

public class Q1_inherit_outside_package_subclass extends Q1_inherit_ouside_package_superclass 
{
	void display()
	{
		System.out.println(a);
	}


public static void main(String[] args) {
	Q1_inherit_outside_package_subclass obj=new Q1_inherit_outside_package_subclass();
	obj.display();
	
	
}
}
