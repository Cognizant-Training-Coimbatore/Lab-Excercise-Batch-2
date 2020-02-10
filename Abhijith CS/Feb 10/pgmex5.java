package webdriverdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;

public class pgmex5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String datafile = "D:\\emp.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitby= ",";
		br = new BufferedReader(new FileReader(datafile));
		while ((line=br.readLine())!=null) 
		{
			String[] data= line.split(csvSplitby);
			System.out.println(data[0] + data[1] + data[2]);
		}
		br.close();
	}
	}
