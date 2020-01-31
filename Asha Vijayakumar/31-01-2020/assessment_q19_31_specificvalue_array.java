import java.util.Scanner;

public class assessment_q19_31_specificvalue_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,flag;
		System.out.println("Enter an array limit:");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements:");
		for(i=0;i<a.length;i++)
		{
			a[i]=scanner.nextInt();
		}
		int num=3;
		for(i=0;i<a.length;i++)
		{
			if(num==a[i])
			{
				System.out.println("Element found");
				break;
				
				
				
			}
			else
			{
				System.out.println("Given element is not present in the array");
				break;
				
			}
			
		}
	}

}
