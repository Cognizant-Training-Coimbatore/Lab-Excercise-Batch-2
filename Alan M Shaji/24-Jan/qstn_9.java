import java.util.Scanner;

public class qstn_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string\t:\t");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
				count++;
		System.out.println("No of Vowels\t:\t"+count);
		sc.close();
	}

}
