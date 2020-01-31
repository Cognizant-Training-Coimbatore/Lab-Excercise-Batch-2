import java.util.Scanner;

public class assessment_q4_reverse_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st,reverse="";
		int i,length;
		
		
		
		System.out.println("Enter a string:");
		Scanner scanner=new Scanner(System.in);
		st=scanner.nextLine();
		length=st.length();
		System.out.println("Reversal of the given string is");
		for(i=length-1;i>=0;i--)
		{
			reverse=reverse+st.charAt(i);
			
		}
		System.out.println(reverse);
		
		
		
		
		

	}

}
