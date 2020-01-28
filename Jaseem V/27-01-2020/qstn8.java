import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class qstn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=1;
		Scanner sc=new Scanner(System.in);
		while(f==1)
		{String name,address,Aadhar;
		 
			System.out.println("Enter the name\n");
			name=sc.nextLine();
			  
			System.out.println("Enter the address\n");
			address=sc.nextLine();
			  
			System.out.println("Enter the aadhar number\n");
			 Aadhar=sc.nextLine();
			 
			try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
 
 
 bufferedWriter.write("name :"+name);
            bufferedWriter.newLine();
            bufferedWriter.write("address :"+address);
            bufferedWriter.newLine();
            bufferedWriter.write("Aadhar number :"+Aadhar);
            
            
            bufferedWriter.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
 System.out.println("Do you want to save?(1/0)");
 f=sc.nextInt();
 if(f==1)
	 System.out.println( "Record saved.....exiting.......");
	}
if(f==0)		
	System.out.println( "Record not saved.....exiting.......");
if(f!=0||f!=1)
	System.out.println( "Invalid Input");
	}
}