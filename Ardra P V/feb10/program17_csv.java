package webDriverDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program17_csv {
 
	public static void main(String[] args) throws IOException,InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
		//Launch the chrome browser
		String datafile="file:///D:/test/data.csv";
		BufferedReader br=null;
		
		WebDriver driver=new ChromeDriver();
		
		 String line="";
		 String cvsSplitBy=",";
		 br= new BufferedReader(new FileReader(datafile));
		 while ((line=br.readLine())!=null) {
			 driver.get("http://demowebshop.tricentis.com/");
			 driver.findElement(By.linkText("Log in")).click();
			 driver.findElement(By.linkText("Register")).click();
			 driver.findElement(By.name("Firstname")).sendKeys(data[0]);
			 driver.findElement(By.name("LastName")).sendKeys(data[1]);
			 driver.findElement(By.name("Password")).sendKeys(data[2]);
			 driver.findElement(By.name("ConfirmPassword")).sendKeys(data[2]);
			 String[] data=line.split(cvsSplitBy);
			 System.out.println(data[0]+data[1]+data[2]);
		 }
	}

}
