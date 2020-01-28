import java.util.Scanner;

public class count_odd_nums {

	public static void main(String[] args) {
		System.out.println("enter numbers");
		int x,i ;
		int count=0;
		for(i=0;i<=4;i++)
		{
			Scanner scanner=new Scanner(System.in);
			x=scanner.nextInt();
			if(x%2 !=0) {
				count++;
			}
		}
		System.out.println("count of odd numbers" + count);
	
	
		
	}

}
