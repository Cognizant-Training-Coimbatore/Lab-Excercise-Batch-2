package Webdriver_day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String line="";
		String splitby=",";
		BufferedReader br=null;
		br=new BufferedReader(new FileReader("D:/emp.csv"));
		while((line=br.readLine())!=null)
		{
			String[] data=line.split(splitby);
			System.out.println(data[0]+"\t"+data[1]+"\t"+data[2]);
		}
		br.close();


	}

}
