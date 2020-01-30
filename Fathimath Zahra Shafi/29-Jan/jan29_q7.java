package project1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class jan29_q7 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

	int count=0;
	String datafile = "C:\\Users\\Admin\\Documents\\mydata.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";
	br = new BufferedReader(new FileReader(datafile));
	while ((line = br.readLine()) != null)
	{
	        count+=1;
	       
	}
System.out.println("no. of lines: " +count);
	}
}