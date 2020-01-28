import java.util.ArrayList;
import java.util.List;

public class prgd28_q6_inc_size {

	public static void main(String[] args)
	{
		List<String> a1=new ArrayList<String>(3);
		a1.add("school");
		a1.add("college");
		a1.add("university");
		System.out.println("original list");
		System.out.println(a1);
		((ArrayList<String>) a1).ensureCapacity(2);
		System.out.println("recreated lists");
		a1.add("teacher");
		a1.add("students");
		a1.add("principal");
		a1.add("staff");
		a1.add("non-staff");
		System.out.println(a1);
	}

}
