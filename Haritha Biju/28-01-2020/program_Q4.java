import java.util.ArrayList;

//Write a Java program to retrieve an element (at a specified index)
//from a given array list. 
public class program_Q4
{

	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(0);
		System.out.println(list);
		int element = (int) list.get(0);
		System.out.println("First element : "+element);
	}

}
