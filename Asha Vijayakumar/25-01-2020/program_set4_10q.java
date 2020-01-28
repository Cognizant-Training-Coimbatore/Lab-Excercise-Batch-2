import java.util.Scanner;

public class program_set4_10q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,number,smaller;
		System.out.println("Enter the size of the array:");
		Scanner scanner = new Scanner(System.in);
		n=scanner.nextInt();
		int arr[]=new int[n];
		
		
		System.out.println("Enter the element 0");
		number=scanner.nextInt();
		smaller=number;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter element"+ i);
			number=scanner.nextInt();
			arr[i]=number;
			if(number<smaller)
			{
				smaller=number;
				
			}
		}
		for(i=0;i<n;i++)

		{
			System.out.println("Numbers are" + arr[i]);
			// TODO Auto-generated method stub
			
		}
		System.out.println("Smallest  number" + smaller);
		

	}

}

				

	


