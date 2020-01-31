import java.util.Scanner;

public class qstn18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner xx=new Scanner(System.in);
int a,b,c;
System.out.println("Enter the three numbers");
a=xx.nextInt();
b=xx.nextInt();
c=xx.nextInt();
if(a==b&&b==c&&c==a)
{System.out.println("All are equal\n");
	}
else if(a!=b&&b!=c&&c!=a)
{System.out.println("All are different\n");
	}
else
	System.out.println("all are neither same or equal\n");
	}

}
