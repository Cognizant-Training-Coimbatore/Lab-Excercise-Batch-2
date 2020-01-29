package samplepackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class j29_q7_ReadCSV {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String datafile = "E:/mydata.csv";
BufferedReader br = null;
String input = "";
int count =0;
br = new BufferedReader(new FileReader(datafile));
while((input = br.readLine())!=null)
{
	count++;
}
System.out.println("Count : "+ count);
	}

}
