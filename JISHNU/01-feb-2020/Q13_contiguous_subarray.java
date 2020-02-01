import java.util.Scanner;

public class Q13_contiguous_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {45,65,45,87,56,78,43,23,65,87,98,89,45,22,55,77,33,23,12,67,34};
		int len=arr.length;
		System.out.println("Enter length of sub array which should be less than "+len);
		int slen;
		Scanner sc=new Scanner(System.in);
		slen=sc.nextInt();
		int sum[]=new int[len-slen];
		int high,pos;
		if(slen<len)
		{
			for(int i=0;i<len-slen;i++)
			{
				for(int j=i;j<i+slen;j++)
				{
					sum[i]=sum[i]+arr[j];
				}
			}
			high=sum[0];
			pos=0;
			for(int i=1;i<sum.length;i++)
			{
				if(high<sum[i])
				{
					high=sum[i];
					pos=i;
				}
			}
			float avg=sum[pos]/slen;
			for(int k=pos;k<pos+slen;k++)
				System.out.println(arr[k]);
		
			System.out.println("Max avg: "+avg);
				
		}
		

	}

}
