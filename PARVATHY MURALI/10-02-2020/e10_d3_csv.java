package project_selenium;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class e10_d3_csv {

	public static void main(String[] args) throws IOException {
		
		String datafile="D:/parvathy_m/data.csv";
		BufferedReader br=null;
		String line="";
		String cvsSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
			String[] data=line.split(cvsSplitBy);
			System.out.print(data[0]+" ");
			System.out.print(data[1]+" ");
			System.out.print(data[2]+"\n");
			
			
		}

	}

}
