import java.util.Scanner;

public class program19_find_element {

	public static void main(String[] args) 
	{
		int k=0;
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the numbers");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element to be found");
		int element=sc.nextInt();
	for(int i=0;i<5;i++)
	{
		if(element==arr[i])
		{
		k=1;	
			System.out.println("Element "+element+" found at "+i);
		}
	}
	if(k!=1)
		System.out.println("No element found");
	}

}
