import java.util.Scanner;

public class program4_sum_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]=new int[4];
		int result=0;
		System.out.println("Enter 4 values: ");
		int i;
		for(i=0;i<4;i++) {
        java.util.Scanner scanner=new Scanner(System.in);
        x[i]=scanner.nextInt();}
		for(i=0;i<4;i++) {
			result=result+x[i];
		}
        System.out.println("Sum of 4 number :" +result);
        System.out.println("average of number is : " +result/4);
	}

}
