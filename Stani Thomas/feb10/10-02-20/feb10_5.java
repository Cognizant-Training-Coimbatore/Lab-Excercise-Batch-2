package selenium_examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class feb10_5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String datafile="D:\\stani\\exer.csv";
		BufferedReader br=null;
		String line="";
		String cvsSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
		String[] data=line.split(cvsSplitBy);
		System.out.println(data[0]+data[1]+data[2]);
		}
	}

}
