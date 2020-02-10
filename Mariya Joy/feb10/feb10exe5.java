package basic_commands;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class feb10exe5 {

	public static void main(String[] args) throws IOException
	{
		String datafile="D:/Mariya/exe5.csv";
		BufferedReader br=null;
		String line="";
		String cvsSplitBy=",";
		br =new BufferedReader(new FileReader(datafile));
		while((line= br.readLine())!=null)
               {
			     
	              String[] data=line.split(cvsSplitBy);
	              System.out.println(data[0]);
	              System.out.println(data[1]);
	              System.out.println(data[2]);

	              
               }


	}

}
