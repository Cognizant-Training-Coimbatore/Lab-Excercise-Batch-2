import java.util.Scanner;

class multiplication_table {
	void numberBetween(int a) {
		for(int i = 1; i < a; i++) {
			System.out.println(i + " * " + a + " = " + i*a );
		}
	
}
}
public class program45_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		System.out.println("enter the integer");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		multiplication_table obj = new multiplication_table();
		obj.numberBetween(num1);
		
	}

}
