import java.util.Scanner;

public class prgm19_count_odd_n0 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int[] arr = new int[5];
	System.out.println("Enter 5 numbers");
	for(int i=0;i<5;i++)
	{
		int value = sc.nextInt();
		arr[i] = value;
	}
    for(int i=0;i<5;i++)
    {
    	if(arr[i]%2!=0) {
    		System.out.println(arr[i]);
    	}
    }
	}

}
