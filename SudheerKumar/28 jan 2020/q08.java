import java.util.ArrayList;

public class q08 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("red");
		list1.add("blue");
		list1.add("green");
		list1.add("brown");
		System.out.println(list1);
		int index=0;
		for(String s:list1)
		{
			System.out.println((index++)+":" +s);
		}
		// TODO Auto-generated method stub

	}

}
