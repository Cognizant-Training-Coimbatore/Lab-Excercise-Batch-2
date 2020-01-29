import java.util.ArrayList;

public class lab3 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Amith");
		al.add("Vijay");
		al.add("Binoy");
		al.add(0,"adhil");
		System.out.println("1st Element : "+al.get(0));
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}
