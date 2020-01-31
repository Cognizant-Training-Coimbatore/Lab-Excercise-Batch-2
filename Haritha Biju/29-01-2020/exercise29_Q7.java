import java.io.BufferedReader;
import java.io.FileReader;

public class exercise29_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String datafile ="D:\\hello.csv";
		BufferedReader br = null;
		
		int count = 0;
		try
		{	
			br = new BufferedReader(new FileReader(datafile));
		
			while(( br.readLine())!=null)
			{
				count++;
				
			}	
			System.out.println("no of lines : " +count);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
