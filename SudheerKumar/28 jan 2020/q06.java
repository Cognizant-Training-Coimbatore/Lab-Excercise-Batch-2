import java.util.ArrayList;
public class q06 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("red");
		list1.add("blue");
		list1.add("green");
		list1.add("brown");
		System.out.println(list1);
		list1.ensureCapacity(6);
		list1.add("violet");
		list1.add("orange");
		System.out.println(list1);
		
		// TODO Auto-generated method stub

	}

}
