
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class prog95_details 
{
			public static void main(String[] args) {
			// TODO Auto-generated method stub
			FileOutputStream fout;
			PrintStream p;
			try
			{
				fout=new FileOutputStream("E:\\Betty Benny\\Employee.txt");
				p = new PrintStream(fout);
				Scanner sc = new Scanner(System.in);
				String name,address;
				long aadhar;
				int op=1;
				while(op==1)
				{
					System.out.println("Enter your name :");
					name = sc.nextLine();
					System.out.println("Enter your address :");
					address = sc.nextLine();
					System.out.println("Enter your aadhar number :");
					aadhar = sc.nextInt();
					System.out.println("Do you want to save? (1/0)");
					op=sc.nextInt();
					if(op==1)
					{
						p.println(name);
						p.println(address);
						p.println(aadhar);
						System.out.println("Record saved...");
					}
					else
					{
						System.out.println("Record not saved... Exiting..");
					}
				}
				p.close();
			}
			catch(Exception e)
			{
				System.err.println("Error in the file");
			}
			}
}

		
	