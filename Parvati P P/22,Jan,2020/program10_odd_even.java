import java.util.Scanner;
public class program10_odd_even {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no...");
		num=sc.nextInt();
		if (num >0){
		System.out.println("Poistive..");}
		if(num <0)
			System.out.println("Negative..");
		if(num==0)
			System.out.println("No. is zero..");

	}

}
