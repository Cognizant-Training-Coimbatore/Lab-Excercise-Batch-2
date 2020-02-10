package exercise_jan31;

import java.util.Scanner;

public class pgm9_primesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, sum=0;
        Scanner get = new Scanner(System.in);
        System.out.println();
        int i=2;
        int count=0;
        while(count<=100)
        {
        	int flag=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    flag=1;
            }
            if(flag==0)
            {
                System.out.print(i+" ");
                sum=sum+i;
                count++;
            }
            i++;
        }
        System.out.println("\n+Sum = "+sum);
	}

}
