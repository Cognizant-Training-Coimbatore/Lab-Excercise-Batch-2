import java.util.Scanner;

public class qstn18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int vowels=0;
		for(int i = 0; i < str.length(); ++i)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            }
		System.out.println("Number of vowels :"+vowels);
		
}}
