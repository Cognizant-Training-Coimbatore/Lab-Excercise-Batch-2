import java.util.ArrayList;

//Write a Java program to increase the size of an array list. 
public class program_Q6 
{

	public static void main(String[] args)
	{
		ArrayList mylist = new ArrayList();
		mylist.add(1);
		mylist.add(2);
		mylist.add(2);
		mylist.add(4);
		System.out.println("Initial size: "+mylist.size());
		mylist.add(4);
		mylist.add(7);
		System.out.println("Final size:  "+mylist.size());
	}

}
