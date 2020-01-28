import java.util.Scanner;

public class que7_copy_array {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i;
	int j;
	int size=0;
	System.out.println("Enter the size of array:");
	size=sc.nextInt();
	int numbers[] = new int[size];
	int copy[] = new int[numbers.length];
	System.out.println("Enter the elements of array:");
	for(i=0;i<=size;i++)
	{
		numbers[i]=sc.nextInt();
	}
	numbers=copy.clone();
	for(j=0;j<=numbers.length;j++)
	{
		System.out.println("Elements of array b are " +copy[j]);
	}

	}

}
