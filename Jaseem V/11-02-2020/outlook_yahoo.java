package repository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class outlook_yahoo {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\Desktop\\Java Programs\\selenium examples\\src\\repository\\outlook-yahoo.properties");
		Properties proper=new Properties();
		proper.load(file);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Java Programs"
				+ "\\selenium examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(proper.getProperty("url"));
		driver.findElement(By.id(proper.getProperty("uid"))).sendKeys(proper.getProperty("uidv"));
		
		driver.findElement(By.id(proper.getProperty("next"))).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
