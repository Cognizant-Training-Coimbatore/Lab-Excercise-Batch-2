import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class excercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> List1=new ArrayList<String>();
		List1.add("Red");
		List1.add("yellow");
		List1.add("white");
		List1.add("blue");
		
		System.out.println("Enter position and element");
		Scanner sc=new Scanner(System.in);
		String y=sc.nextLine();
		int x=sc.nextInt();
		List1.add(x,y);
		System.out.println(List1);
		
	}

}
