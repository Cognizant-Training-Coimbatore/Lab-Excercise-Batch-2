import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class pgm32_readfromCsv {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String datafile="E:/mydata.csv";
		BufferedReader br = null;
		String line ="";
		String cvsSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
		String[] data=line.split(cvsSplitBy);
		System.out.println(data[0]+data[1]+data[2]);
		}

	}

}
