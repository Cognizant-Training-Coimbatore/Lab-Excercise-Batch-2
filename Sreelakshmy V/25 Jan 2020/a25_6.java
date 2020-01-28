import java.util.Scanner;

public class a25_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, number, greater;
		System.out.println("enter the maximum size");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int numbers1[] = new int[n];
		int i;
		System.out.println("enter number 0");
		number = scanner.nextInt();
		greater = number;
		for(i = 1; i <n; i++) {
			System.out.println( "enter number" + i);
			number = scanner.nextInt();
			numbers1[i] = number;
			if(number > greater) {
				greater = number;
			}
			
		}
		for(i = 0; i < n; i++) {
			System.out.println("numbers are" + numbers1[i]);
		}
		System.out.println("greatest number" + greater);
	}

}