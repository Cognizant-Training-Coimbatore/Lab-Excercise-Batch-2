package set4;

import java.util.Scanner;

public class qn_5_set4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String arr[]=new String[5];
		String upper[]=new String[5];
		Scanner input = new Scanner(System.in);
		System.out.println("enter name");
		for(i=0;i<5;i++)
		{
			arr[i]=input.nextLine();
	}
		for(i=0;i<5;i++)
		{
		upper[i]=arr[i].toUpperCase();
		}
		
		for(i=0;i<5;i++)
		
		{
		System.out.println(upper[i]);
}}
}