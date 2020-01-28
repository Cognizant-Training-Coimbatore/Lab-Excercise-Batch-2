import java.util.*;
import java.io.*;
import java.lang.*;
public class Sreverse
{
public static void main(String args[])
{
	String input;
        Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	input=sc.next();
	byte [] strarry=input.getBytes();
	byte [] result=new byte[strarry.length];
        for(int i=0;i<strarry.length;i++)
	{
		result[i]=strarry[strarry.length-i-1];
	}
	System.out.println(new String(result));
}

}
