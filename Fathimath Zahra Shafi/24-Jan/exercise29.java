import java.util.Scanner;

public class exercise29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,sum=0,count=0;
		float avg=0;
		
		do {
			Scanner scanner=new Scanner(System.in);
			x=scanner.nextInt();
			
			if(x==-999)
			break;
			
			count++;
			sum+=x;
			
			
		} while(x!=-999);

		avg=sum/count;
		
		System.out.println("sum of numbers: " +sum);
		System.out.println("average of numbers: " +avg);
		
		
	}

}
