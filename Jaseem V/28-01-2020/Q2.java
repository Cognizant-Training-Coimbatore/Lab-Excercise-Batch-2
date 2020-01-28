



import java.util.ArrayList;
import java.util.Iterator;
public class Q2
{

static void printArray(int myarray[])
{
	for(int x:myarray)
	{
		System.out.println(x);
		
	}
}
static void printarrayList(ArrayList List1)
{
	for(Object obj:List1)
	{
		System.out.println(obj);
	}
}


	public static void main(String[] args)
	{
		
		ArrayList mylist = new ArrayList();
		mylist.add("Green");
		mylist.add("Red");
		mylist.add("Blue");
		mylist.add("White");
		printarrayList(mylist);
		Iterator It1 = mylist.iterator();
		System.out.println("Using Iterator object....");
		while(It1.hasNext())
		{
			Object obj =It1.next();
			System.out.println(obj);
		}

	}

}

