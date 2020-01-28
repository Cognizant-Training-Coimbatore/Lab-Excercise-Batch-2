import java.util.Scanner;

public class exercise31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int count=0,i,l;
		char ch;
		System.out.println("enter a string");
		Scanner scanner=new Scanner(System.in);
		str=scanner.nextLine();
		l=str.length();
		for(i=0;i<l;i++)
			
		{
			ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			count++;
		

	}

		System.out.println("no. of vowels in string: "+count);
}
}