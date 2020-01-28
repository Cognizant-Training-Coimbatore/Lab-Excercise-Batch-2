import java.util.Scanner;

public class qstn_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string\t:\t");
		String str=sc.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
			rev+=str.charAt(i);
		System.out.println("Reverse\t:\t"+rev);
		sc.close();
	}

}
