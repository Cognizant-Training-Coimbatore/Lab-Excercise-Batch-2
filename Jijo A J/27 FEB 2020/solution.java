import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class solution {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("E:\\JIJO A J\\ECLIPSE2\\SBA_SELENIUM\\Book1.csv"));  
	    sc.useDelimiter(",");   //sets the delimiter pattern  
	    while (sc.hasNext())  //returns a boolean value  
	    {  
	    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    	driver= new ChromeDriver();
	    	driver.get("https://www.redbus.in/");
	    	driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Chennai");
	    	
	  	  driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys("Madurai");
	  	  Thread.sleep(1000);
	    	
	    	driver.quit();
 }   
	    sc.close();
}
	}


