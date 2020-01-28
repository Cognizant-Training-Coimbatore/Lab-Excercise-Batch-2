import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class update_array_element {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> map1=new ArrayList<String>();
		map1.add("Divya");
		map1.add("Diya");
		map1.add("Bindu");
		map1.add("Rajan");
		System.out.println("The elements are:"+map1);
		System.out.println("Enter the position which is to be replaced:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		map1.set(n,"Navya");
		System.out.println("The updated elements are:"+map1);

	}

}
