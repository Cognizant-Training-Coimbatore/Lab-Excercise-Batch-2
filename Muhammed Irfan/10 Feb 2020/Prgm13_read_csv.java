package ABC;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prgm13_read_csv {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String datafile= "C:\\Users\\Admin\\Desktop\\Selenium";
		driver.get("http://demowebshop.tricentis.com/");
		BufferedReader br=null;
		String line= "";
		String csvSplitBy="";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!= null)
				{
			      String[] data=line.split(csvSplitBy);
			     driver.findElement(By.linkText("Register")).click();
			     driver.findElement(By.name("FirstName")).sendKeys(data[0]);
			     driver.findElement(By.name("LastName")).sendKeys(data[1]);
			     driver.findElement(By.id("Password")).sendKeys(data[2]);
			     driver.findElement(By.id("ConfirmPassword")).sendKeys(data[3]);
				}
		
	}

}
