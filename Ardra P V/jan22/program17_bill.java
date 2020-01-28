import java.util.Scanner;

public class program17_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter the value of a");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		if(a>0 && a<101)
		{
			System.out.println("Bill is free" );
		}
		else if(a>=101 && a<=200) {
			System.out.println("Bill is :" +a);
		}
		else if(a>=201 && a<=300) {
			System.out.println("Bill is :" +a*2);
		}
		else if(a>=301 && a<=400) {
			System.out.println("Bill is :" +a*3);
		}
		else if (a>401){
			int p=a;
			int y=p/10;
			int z=a*4;
			int q=z+y;
			System.out.println("Bill is :" +q);
		}
	}

}
