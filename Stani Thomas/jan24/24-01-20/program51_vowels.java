import java.util.Scanner;

public class program51_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
int i,l,c=0;
System.out.println("enter the string");
Scanner sc =new Scanner(System.in);
str=sc.nextLine();
l=str.length();
for(i=0;i<l;i++)
{
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	{
	c++;	
		}
	}
System.out.println("no.of vowels in string = "+c);
}
	}


