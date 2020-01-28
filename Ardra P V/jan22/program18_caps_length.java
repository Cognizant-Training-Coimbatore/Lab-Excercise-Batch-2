import java.util.Scanner;

public class program18_caps_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
                String y;
				System.out.println("Enter the value of y");
				Scanner scanner=new Scanner(System.in);
				y=scanner.nextLine();
				String x=y.toUpperCase(); 
				int length=y.length();
				System.out.println("Uppercase string is : " +x);
				System.out.println("Length of string is : " +length);
		        }

}
