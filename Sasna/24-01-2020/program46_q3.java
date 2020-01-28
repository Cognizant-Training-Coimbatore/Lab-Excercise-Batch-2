import java.util.Scanner;

class ReadTenIntegers {
	int min;
	int max;
	int average;
	int sum =0;
	void maximum (int[] arr) {
		arr[0] = min;
		for(int i = 0; i < 10 ; i++) {
		if (arr[i] < arr[0]) {
			min = arr[i];
		}
		}
		System.out.println("minimum :" + min);
	}
	
	void minimum (int[] arr) {
		arr[0] = max;
		for (int i =0; i < 10; i++) {
		if (arr[i] > arr[0]) {
			max = arr[i];
		}
		}
		System.out.println("maximum :" + max);
	}	


	void find_average (int[] arr) {
		for (int i =0; i < 10; i++) {
			sum+=arr[i];
			average = sum/10;
		}
	System.out.println("average :" + average);

}
}

public class program46_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		System.out.println("enter the elements");
		Scanner sc = new Scanner(System.in);
		 for(int i=0; i<10; i++) {
	         array[i] = sc.nextInt();
		 }
		ReadTenIntegers obj = new ReadTenIntegers();
		obj.maximum(array);
		obj.minimum(array);
		obj.find_average(array);
	}

}
