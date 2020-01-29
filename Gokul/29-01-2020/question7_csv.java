import java.io.BufferedReader;
import java.io.FileReader;

public class question7_csv {

	public static void main(String[] args)throws Exception
	{
		String datafile="c:\\Users\\Admin\\Desktop\\data.csv";
		BufferedReader br=null;
		String line="";
		String csvSplitBy =",";
			
		int count=0;
		br=new BufferedReader(new FileReader(datafile));
		while((line = br.readLine())!= null)
		{
			String[] data=line.split(csvSplitBy);
			count++;
			System.out.println(data[0]+data[1]+data[2]);
			
		}
		System.out.println("The number of lines :"+count);

	}

}
