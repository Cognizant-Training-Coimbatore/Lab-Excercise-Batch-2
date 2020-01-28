import java.util.Scanner;

class list_number {
	void numberBetween(int a, int z) {
		for(int i = a; i < z; i++) {
			System.out.println(i);
		}
	}
}
public class program44_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		System.out.println("enter the first integer");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("enter the second integer");
		num2 = sc.nextInt();
		
		list_number obj = new list_number();
		obj.numberBetween(num1, num2);
	}

}
