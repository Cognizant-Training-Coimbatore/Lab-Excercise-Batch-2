import java.util.*;
public class question16 {

	public static void main(String[] args) 
	{
		HashMap <Integer, Integer> list = new HashMap <Integer, Integer>();
		Scanner input= new Scanner(System.in);
		int p,i;
		System.out.println("Enter first set of elements (Press -1 to stop entering) :");
		for(;;)
		{
			System.out.println("Key");
			i=input.nextInt();
			if(i==-1)
			{
				break;
				
			}
			else
			{
				System.out.println("Value");
				p = input.nextInt();
				list.put(i,p);
		
			}
		}
		System.out.println("Size:  "+ list.size());
		input.close();
	}

}