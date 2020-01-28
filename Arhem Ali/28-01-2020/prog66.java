import java.util.ArrayList;

public class prog66 {

	static void printarray(int myarray[])
	{
		for(int x:myarray)
		{
			System.out.println(x);
		}
	}
	static void printarraylist(ArrayList list1)
	{
		for(Object obj:list1)
		{
			System.out.println(obj);
		}
	}
	public static void main(String[] args) 
	{
		int no[]=new int[3];
		no[0]=10;
		no[1]=2;
		no[2]=3;
		printarray(no);
		ArrayList mylist=new ArrayList();
		mylist.add("item1");
		mylist.add("item2");
		mylist.add("item3");
		printarraylist(mylist);
		

	}

}
