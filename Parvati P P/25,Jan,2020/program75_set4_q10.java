package Package2;
class smallest{
	
	public int getSmallest(int arr[],int count)
	{
		int temp,i,j;
	}
		for(i=0;i<6;i++)
		{
			for(j=i+1;j<6;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
				arr[i]=a[j];
				arr[j]=temp;
				
			}
		}
	}
}
import java.util.Scanner;

public class program75_set4_q10 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
smallest sc=new smallest();
		getSmallest(arr,5);

	}

	
	

}
