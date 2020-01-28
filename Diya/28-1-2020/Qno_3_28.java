import java.util.ArrayList;

public class Qno_3_28 {

	public static void main(String[] args) {
		ArrayList<Integer>list1=new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(0,400);
		for(Integer s:list1)
		{
			System.out.println(s);
		}


	}

}
