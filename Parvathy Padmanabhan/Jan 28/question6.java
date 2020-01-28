import java.util.*;

public class question6 {

	public static void main(String[] args) {
		HashMap<Integer,Integer> list1 = new HashMap<Integer,Integer>();
		Scanner input = new Scanner(System.in);
		int a,i=0;;
		for(;;)
		{
		
			a= input.nextInt();
			if(a==1)
			{
				break;
				
			}
			else
			{
				list1.put(i,a);
				i++;
			}
		}
		
		System.out.println("The size of array: " +list1.size());
		System.out.println("Elements " + list1);
		System.out.println("Add new elements : (press 1 to exit)");
		for(;;)
		{
		
			a= input.nextInt();
			if(a==1)
			{
				break;
				
			}
			else
			{
				list1.put(i,a);
				i++;
			}
		}
			System.out.println("The size of array: " +list1.size());
			System.out.println("Elements " + list1);
			input.close();
	}
	

}
