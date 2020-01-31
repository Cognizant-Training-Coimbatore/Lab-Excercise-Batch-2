package jan31;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		int i;
		System.out.println("Enter first array numbers");
		Scanner scanner=new Scanner(System.in);
		for(i=0;i<7;i++) {
		a[i]=scanner.nextInt();}
		System.out.println("Enter length");
		int k=scanner.nextInt();
		int sum=0;
        for(i=0;i<k;i++) {
		 sum=sum+a[i];
		}
        int max=sum;
        for(i=k;i<a.length;i++) {
        	sum=sum-a[i-k]+a[i];
        	max=Math.max(max,sum);
        }
        System.out.println((double)max/k);
	}

}
