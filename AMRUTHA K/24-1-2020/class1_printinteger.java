package demo11;

import java.util.Scanner;

class x{int z,y;
	void dispaly()
	{System.out.println("enter the fst no");
	Scanner a=new Scanner(System.in);
	int s=a.nextInt();
	z=s;
	System.out.println("enter the sec no");
	Scanner b=new Scanner(System.in);
	int c=b.nextInt();
	y=c;
	System.out.println("numbers between given numbers=");
	if (z>y) {
		for (int i=y+1;i<z;i++) {
			System.out.println(i);
		}}
		else if(y>z){for (int i=z+1;i<y;i++) {
			System.out.println(i);
		}
			
		}
		else {
			System.out.println("no number in between given numbers");
		}
	}
	}

public class class1_printinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x obj=new x();
	obj.dispaly();

	}

}
