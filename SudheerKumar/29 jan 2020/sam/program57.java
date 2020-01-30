import java.io.BufferedReader;
impprt java.io.FileReader;
import java.io.IOException;
public class program57 {

	public static void main(String[] args) throws IOException {
		String datafile=D:/"mydata.csv";
		BufferReader br=null;
		String line="";
		String cvsSplitBy=",";
		br=new BufferReader(new FileReader(datafile));
		while((line=br.readLine())   !=null)
		{
		String[] data=line.split(cvsSplitBy);
		System.out.println(data[0]+data[1]+data[2]);
		}


	}

}
