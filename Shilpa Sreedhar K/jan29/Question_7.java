package jan29;

import java.io.BufferedReader;
import java.io.FileReader;
public class Question_7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String datafile = "E:/Ques7.csv";
		BufferedReader br = null;
		String line="";
		br = new BufferedReader(new FileReader(datafile));
		int i=0;
		while ((line = br.readLine()) != null)
		{
			i++;
		}
		System.out.println(i);
		br.close();

	}

}