package selenium_new;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class csv {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
String datafile="file:///D:/data.csv";
driver.get("http://demowebshop.tricentis.com");
BufferedReader br=null;
String line="";
String cvsSplitBy=",";

br=new BufferedReader(new FileReader(datafile));
while ((line=br.readLine())!=null)
{
	
	String[] data=line.split(cvsSplitBy);
	
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.name("Firstname")).sendKeys(data[0]);
	driver.findElement(By.name("Lastname")).sendKeys(data[1]);
	driver.findElement(By.name("Password")).sendKeys(data[2]);
	System.out.println(data[0]+data[1]+data[2]);
}

	}

}
