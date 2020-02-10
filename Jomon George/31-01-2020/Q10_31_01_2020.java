package Exercise;

import java.util.Scanner;

class inputs{
	Scanner scanner = new Scanner(System.in);
	int[] input() {
		
		System.out.print("Enter No of elements: ");
		int count = scanner.nextInt();
		int[] arr=new int[count];
		System.out.print("Enter the elements: ");
		for(int i=0;i<count;i++)
		{
			 arr[i]=scanner.nextInt();
		}
		return arr;
	}
}
public class Q10_31_01_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inputs obj = new inputs();
		int[] arr1 = obj.input();
		int[] arr2 = obj.input();
		int[] arr3 = new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i] = arr1[i] * arr2[i];
		}
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i] + " ");
		}	
	}

}
