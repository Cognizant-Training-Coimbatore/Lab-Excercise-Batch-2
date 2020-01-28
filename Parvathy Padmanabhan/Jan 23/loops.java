import java.util.Scanner;
public class loops {

	public static void main(String[] args) {
		int num;
		Scanner input= new Scanner(System.in);
		num=input.nextInt();
		for(int i=0; i<num;i++)
		{
			System.out.print(i);
		}
		input.close();
		

	}

}
