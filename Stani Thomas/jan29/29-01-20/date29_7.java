package abc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class date29_7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int c=0;
		String datafile="D:/mydata.csv";
		BufferedReader br=null;
		String line="";
		String cvsSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null) 
		{
			c++;
			String[] data=line.split(cvsSplitBy);
			System.out.println(data[0]+data[1]+data[2]);
			 
	}
		System.out.println("no.of lines = "+c);
	}
}
