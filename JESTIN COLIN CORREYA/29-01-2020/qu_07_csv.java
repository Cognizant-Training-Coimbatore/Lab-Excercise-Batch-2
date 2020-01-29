package other;

import java.io.BufferedReader;
import java.io.FileReader;

public class qu_07_csv {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String datafile="D:colinn.csv";
		BufferedReader br=null;
		String line="";
		String cvsSplitBy=",";
		int count =0;
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
			count ++;
			
		}
		System.out.println("count="+count);
		br.close();
	}
	
	

}
