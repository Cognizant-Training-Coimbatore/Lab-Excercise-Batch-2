import java.util.TreeSet;
import java.util.Scanner;
public class question15 {

	public static void main(String[] args) {
		TreeSet<Integer> list1 = new TreeSet <Integer>();
		Scanner input= new Scanner(System.in);
		int p;
		System.out.println("Enter first set of elements (Press -1 to stop entering) :");
		for(;;)
		{
			p = input.nextInt();
			if(p==-1)
			{
				break;
				
			}
			else
			{
				list1.add(p);
		
			}
		}
		int i,num;
		System.out.println("Enter limit:");
		i=input.nextInt();
		num= list1.ceiling(i);
		System.out.println("Strictly greater " + num);
		input.close();


	}

}
 