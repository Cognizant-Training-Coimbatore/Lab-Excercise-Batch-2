package set4;

import java.util.Scanner;

public class qn_6_set4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner input = new Scanner(System.in);

        
        System.out.println("enter array");
        int num = input.nextInt();

        int array[] = new int[num];

        

        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = input.nextInt();
           sum=sum+array[i];
}
        int average =sum/num;
        System.out.println("sum: " +sum);
        System.out.println("average" +average);
}}