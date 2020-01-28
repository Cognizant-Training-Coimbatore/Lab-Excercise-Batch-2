import java.util.ArrayList;
import java.util.Scanner;

public class Qstion4 {

	public static void main(String[] args) 
	{
		ArrayList<String>list=new ArrayList<String>();
		list.add("hello");
		list.add("everyone");
		list.add("welcome");
		list.add("to");
		list.add("party");
		System.out.println("enter the the position of the element that you want");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("the element in the given position is :"+list.get(n-1)+"-");
		
	}

}
