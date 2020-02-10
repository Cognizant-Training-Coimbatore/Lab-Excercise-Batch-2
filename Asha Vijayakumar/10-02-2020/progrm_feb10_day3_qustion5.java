import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;



public class progrm_feb10_day3_qustion5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String datafile="E:/asha/detailsss.csv";
		BufferedReader br=null;
		String line="";
		String csvSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
			String[] data =line.split(csvSplitBy);
			System.out.println(data[0]+"");
			System.out.println(data[1]+"");
			System.out.println(data[2]+"\n");
			
			
			
			
		}
	}

}
