package new_demo_pack;

import java.util.Scanner;

public class ex4_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String[] str=new String[5];
		System.out.println("Enter ur 5 friends name");
		Scanner s=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			str[i]=s.nextLine();
		}
		for(i=0;i<5;i++)
		{
			System.out.println(str[i]);
		}

	}

}

