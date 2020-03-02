import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaclass {

	public static void main(String[] args) throws IOException 
	{
		//  Keyword driven testing 
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  String datafile = "E:/keyword.csv";
		  BufferedReader br = null;
		  String line = "";
		  String cvsSplitBy = ",";
		  br = new BufferedReader(new FileReader(datafile));
		  while ((line = br.readLine()) != null)
		  {
		  String[] data = line.split(cvsSplitBy);
		  if(data[1].equals("OpenApp"))
		  {
		  driver.get(data[2]);
		  }
		  if(data[1].equals("ClickLogin"))
		  {
		  driver.findElement(By.linkText("Log in")).click();
		  }
		  if(data[1].equals("EnterUsername"))
		  {
		  driver.findElement(By.name("Email")).sendKeys(data[2]);
		  }
		  if(data[1].equals("EnterPassword"))
		  {
		  driver.findElement(By.name("Password")).sendKeys(data[2]);
		  }
		  if(data[1].equals("ClickSignin"))
		  {
		  driver.findElement(By.xpath("//input[@value='Log in']")).click();
		  }
		  if(data[1].equals("ClickLogout"))
		  {
		  driver.findElement(By.linkText("Log out")).click();
		  }

		}
		  driver.quit();

	}

}
