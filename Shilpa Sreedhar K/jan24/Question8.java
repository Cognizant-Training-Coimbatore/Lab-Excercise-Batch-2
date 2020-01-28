import java.util.Scanner;

class vowelcount
{
	int c=0,i;
	String st;
	char ch;
	void display()
	{
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		st=sc.nextLine();
		for(i=0;i<st.length();i++)
		{
			ch=st.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				c++;
		}
		System.out.println("no of vowels=" +c);
		
	}
}
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vowelcount obj=new vowelcount();
		obj.display();
	}

}
