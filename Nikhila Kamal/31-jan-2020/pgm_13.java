import java.util.Scanner;

public class pgm_13 {

	public static void main(String[] args) {
		int a[]=new int[10];

		int i;

		System.out.println("Enter first array numbers");

		Scanner sc=new Scanner(System.in);

		for(i=0;i<7;i++) {

		a[i]=sc.nextInt();
		}

		System.out.println("Enter length");

		int k=sc.nextInt();

		int sum=0;

        for(i=0;i<k;i++)
        {

		 sum=sum+a[i];

		}

        int max=sum;

        for(i=k;i<a.length;i++) 
        {

        	sum=sum-a[i-k]+a[i];

        	max=Math.max(max,sum);

        }

        System.out.println((double)max/k);

	}
	}


