
package repository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Outlook_Yahoo {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\src\\repository\\Outlook_Yahoo.properties");
		Properties prop = new Properties();
		prop.load(file);
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.name(prop.getProperty("uid"))).sendKeys(prop.getProperty("uidv"));
		driver.findElement(By.xpath(prop.getProperty("btn1"))).click();
		driver.findElement(By.name(prop.getProperty("pwd"))).sendKeys(prop.getProperty("pwdv"));
		driver.findElement(By.xpath(prop.getProperty("btn2"))).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
