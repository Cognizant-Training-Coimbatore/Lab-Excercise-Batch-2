package project1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class pgmd29_q7_csv {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String dfile="E:/mydata.csv";
		BufferedReader br=null;
		String line="";
		int i=0;
		br=new BufferedReader(new FileReader(dfile));	
		while ((line= br.readLine()) != null)
		{
			i++;
		}
		System.out.println(i);
		br.close();
	}

}
