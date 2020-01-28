import java.util.ArrayList;

public class program96_arrayli {

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
		public static void main(String[] args)
		{
			int no[] = new int[3];
			no[0] = 10;
			no[1] = 2;
			no[2] = 3;
			printArray(no);
			ArrayList mylist = new ArrayList();
			mylist.add("Item1");
			mylist.add("Item2");
		}
	}


