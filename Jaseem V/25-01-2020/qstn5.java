package pack1;

import java.util.Scanner;

public class qstn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] names=new String[5];
Scanner sc=new Scanner(System.in);		
for(int i=0;i<5;i++)
{
System.out.println("Enter the friend's name "+1);
names[i]=sc.nextLine();
}
for(int i=0;i<5;i++)
{
System.out.println(names[i].toUpperCase());

}
}
	}
