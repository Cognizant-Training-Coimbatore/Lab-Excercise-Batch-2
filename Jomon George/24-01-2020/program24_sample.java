package demo;

import java.lang.Math; 
import java.util.Scanner;

class range
{
	range(int a , int b) {
		for(;a<b-1;a++)
			System.out.println((a+1) +" ");
	}
}
class multipleTable
{
	multipleTable(int n)
	{
		for(int j=1;j<=10;j++)
		{
			for(int i=1;i<=n;i++)
			{
				System.out.print( i + " * " + j + " = " + (i*j) +"\t" );
			}
			System.out.print("\n");
		}
	}
}
class maxMinAvg{
	
	Scanner scanner = new Scanner(System.in);
	int max,min,avg,sum=0;;
	int[] input() {
		
		System.out.print("Enter No of elements: ");
		int count = scanner.nextInt();
		int[] arr=new int[count];
		System.out.print("Enter the elements: ");
		for(int i=0;i<count;i++)
		{
			 arr[i]=scanner.nextInt();
		}
		return arr;
	}
	void result(int arr[])
	{
		max=arr[0];
		min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
			sum+=arr[i];
		}
		avg=sum/(arr.length);
		System.out.println("Max : " + max + "\tMin : " + min + "\t Average : " + avg);
	}
}

class guess{
	Scanner scanner = new Scanner(System.in);
	int guess= (int)(Math.random() * 10),flag=0;
	void display()
	{
//		System.out.println(Math.random());
		System.out.print("Pick a number between 0 and 9 and enter the guess (3 chances).\nAttempt 1 : ");
		if( guess == scanner.nextInt())
		{
			flag=0;
		}
		else 
		{
			System.out.print("Attempt 2 : ");
			if(guess == scanner.nextInt())
			{
				flag=0;
			}
			else {
				System.out.print("Attempt 3 : ");
				if(guess == scanner.nextInt())
				{
					flag=0;
				}
				else
					flag=1;
			}
		}
		if(flag == 0)
			System.out.println("You Won");
		else
			System.out.println("You Fail. The Answer is : " + guess);
	}
}

class pattern{
	void display()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}
}
class negTriple9
{
	Scanner scanner = new Scanner(System.in);
	int sum,avg,n,i;
	void input() {
		System.out.print("Enter numbers until -999 : ");
		while((n=scanner.nextInt()) != -999)
		{
			sum+=n;
			i++;
		}
		avg=sum/i;
		System.out.println("Sum : " + sum + "\tAverage : " + avg);
	}
}

class strRev{
	strRev(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev =rev+str.charAt(i);
		}
		System.out.println("Reverse String : " + rev);
	}
}
class noOfVowel{
	int count;
	noOfVowel(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' )
				count++;
		}
		System.out.println("No of Vowels : " + count);
	}
}

class rand{
	rand()
	{
		System.out.println("Random Numbers (1 - 100) : " + (int)(Math.random()*100 + 1));
	}
}

class palindrome{
	int i,j,flag=0;
	palindrome(String str)
	{
		for(i=0,j=str.length()-1;i<=j;i++,j--)
		{

				if(str.charAt(i)==str.charAt(j))
					flag=0;
				else
					flag=1;
		}
		if(flag ==0)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}

public class program24_sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
//		range Q1 = new range(scanner.nextInt(),scanner.nextInt());
//		multipleTable Q2 = new multipleTable(scanner.nextInt());
//		maxMinAvg Q3 = new maxMinAvg();
//		Q3.result(Q3.input());
//		guess Q4 = new guess();
//		Q4.display();
//		pattern Q5 = new pattern();
//		Q5.display();
//		negTriple9 Q6 = new negTriple9();
//		Q6.input();
//		strRev Q7 = new strRev("jomon");
//		noOfVowel Q8 = new noOfVowel("jomonae");
//		rand Q9 = new rand();
		palindrome Q10 = new palindrome("amal");
	}

}
