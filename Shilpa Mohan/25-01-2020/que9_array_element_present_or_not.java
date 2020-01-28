import java.util.Scanner;

public class que9_array_element_present_or_not {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i;
		int a=0;
		int flag=0;
		int num=0;
		int numbers[] = new int[10];
		System.out.println("Enter the elements of the array:");
		for(i=0;i<=9;i++)
		{
			numbers[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search:");
		a=sc.nextInt();
		for(i=0;i<=9;i++)
		{
			if(numbers[i]==a)
			{
				flag=1;
				num=i;
			}
		
		}
			if(flag==1)
			{
			System.out.println("The element is present at position " +num);
			}
			else
			{
				System.out.println("The element is not present");
			}
			
		}

		

		
		
	}


