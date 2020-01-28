import java.util.ArrayList;

public class program56_enhancedForLOop {

	static void pritnArray(int myarray[]) {
		for(int x:myarray) {
			System.out.println(x);
		}
	}
	static void printArrayList(ArrayList list1) {
		for(Object obj : list1) {
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		int no[]= new int[3];
		no[0]=10;
		no[1]=2;
		no[2]=12;
		pritnArray(no);
		ArrayList mylist = new ArrayList();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		mylist.add("Item4");
		printArrayList(mylist);

	}
}