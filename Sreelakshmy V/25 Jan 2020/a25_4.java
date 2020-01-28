import java.util.Scanner;

public class a25_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, number, small;
		
		Scanner scanner = new Scanner(System.in);
		
		int numbers1[] = new int[5];
		int i;
		System.out.println("enter number 0");
		number = scanner.nextInt();
		small = number;
		for(i = 1; i <5; i++) {
			System.out.println( "enter number" + i);
			number = scanner.nextInt();
			numbers1[i] = number;
			if(number > small) {
				small = number;
			}
			
		}
		for(i = 0; i < 5; i++) {
			System.out.println("numbers are" + numbers1[i]);
		}
		System.out.println("smallest number" + small);
	}

}
