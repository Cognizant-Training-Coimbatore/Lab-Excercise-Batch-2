import java.util.ArrayList;

public class Qstion6 {

	public static void main(String[] args) 
	{
		ArrayList<String>list=new ArrayList<String>();
		list.add("hello");
		list.add("everyone");
		list.add("welcome");
		list.add("to");
		list.add("party");
		System.out.println("size :"+list.size());
		list.ensureCapacity(15);

	}

}
