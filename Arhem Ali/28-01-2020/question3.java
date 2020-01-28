import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> al=new ArrayList<String>();
		al.add("Amit");
		al.add("Vijay");
		al.add("kumar");
		
		for(String s:al)
		{
			System.out.println(s);
		}
		System.out.println("Enter new value at fst position: ");
		String g= sc.nextLine();
		
		al.add(0,g);
		
		for(String s:al)
		{
			System.out.println(s);
		}

	}

}
