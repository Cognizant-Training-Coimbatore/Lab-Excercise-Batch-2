import java.util.ArrayList;

public class program65_Array_List_three 
{
	static void printArray(int myarray[])
	{
		for(int x:myarray)
		{
			System.out.println(x);
		}
	}
	static void printArrayList(ArrayList list1)
	{
		for(Object obj:list1)
		{
			System.out.println(obj);
		}
	}
	public static void main(String[] args) 
	{
		int a[]=new int[4];
		a[0]=10;
		a[1]=12;
		a[2]=23;
		printArray(a);
		ArrayList mylist= new ArrayList();
		mylist.add("item1");
		mylist.add("two");
		mylist.add("item3");
		printArrayList(mylist);

	}

}
