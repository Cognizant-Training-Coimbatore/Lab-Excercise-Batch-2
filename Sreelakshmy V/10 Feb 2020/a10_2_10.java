package basic_commands;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a10_2_10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\Selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String datafile="D:/example1.csv";
BufferedReader br=null;
String line="";
String cvsSplitBy=",";
br=new BufferedReader(new FileReader(datafile));
while((line=br.readLine())!=null)
{
	
	String[] data=line.split(cvsSplitBy);
	System.out.println(data[0]+ data[1]+ data[2]);
	
	
}

	}

}
