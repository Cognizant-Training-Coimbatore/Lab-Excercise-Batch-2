import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> al=new ArrayList<String>();
		al.add("Amit");
		al.add("Vijay");
		al.add("kumar");
		al.add(1,"Sachin");
		System.out.println("enter position: ");
		int b=sc.nextInt();
		System.out.println("value at position :"+al.get(b));
		
		
	}

}
