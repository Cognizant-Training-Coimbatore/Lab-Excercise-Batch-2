package selenium;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb10_ques5 {

	public static void main(String[] args) throws IOException 
	{
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		String datafile ="D:\\Sarath\\emp.csv";
		BufferedReader br = null;
		String line="";
		String cvsSplitBy = ",";
		
			br = new BufferedReader(new FileReader(datafile));
		
			while((line = br.readLine())!=null)
			{
				String[] data = line.split(cvsSplitBy);
				
				System.out.println(data[0]+" "+data[1]+" "+data[2]);
				
			}	
			br.close();
			
	}

}
