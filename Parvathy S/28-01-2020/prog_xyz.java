import java.util.ArrayList;

public class prog_xyz {
	static void printArray(int myarray[])
	{
		for(int x: myarray)
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int no[] = new int[3];
			no[0] = 10;
			no[1] = 3;
			no[2] = 16;
			printArray(no);
			ArrayList mylist = new ArrayList();
			mylist.add("item1");
			mylist.add("item2");
			mylist.add("item3");
			printArrayList(mylist);
			
			
		}

	}

}
