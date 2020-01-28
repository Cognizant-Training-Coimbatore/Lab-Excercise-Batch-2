import java.util.Scanner;

public class j25_q9_sequential_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int arr[] = new int[10];
	 System.out.println("Enter the 10 elements in an array");
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be searched in the array");
		int ele = sc.nextInt();
		int n=0;
		for(int i=0;i<10;i++)
		{
			if(arr[i] == ele) 
			{
				System.out.println("The element "+ele +" exist in "+i +"th index of the given array");
			 n++;
			}
			
		}
		if(n==0) 
		{
           System.out.println("The element "+ ele +" doesnot exist in given array");
	     }
	}

}
