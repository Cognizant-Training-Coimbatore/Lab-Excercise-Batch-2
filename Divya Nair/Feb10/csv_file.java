import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


public class csv_file {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		String datafile="D:/divya/employee.csv";
		BufferedReader br=null;
		String line="";
		String cvsSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
				String[] data=line.split(cvsSplitBy);
				System.out.print(data[0]+ "");
				System.out.print(data[1]+ "");
				System.out.print(data[2]+ "\n");
				
				
				
		}
		
		

	}

}
