package demo;
import packNEW.program_30_Q3;
//write a program to access methods in one package class 
//to another package sub class
class another extends program_30_Q3
{
	void disp()
	{
		display();
	}
}
public class program_30_Q3_subclass_in_different_package 
{

	public static void main(String[] args)
	{
		another an=new another();
		an.disp();
	

	}

}
