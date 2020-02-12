package feb11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_LK {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		FileInputStream file=new FileInputStream("E:\\javanewwork space\\selenium examples\\src\\feb11\\FB_lik.properties");
		Properties prop=new Properties();
		prop.load(file);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id(prop.getProperty("uid"))).sendKeys(prop.getProperty("uidv"));
		driver.findElement(By.id(prop.getProperty("pwd"))).sendKeys(prop.getProperty("pwdv"));
		driver.findElement(By.xpath(prop.getProperty("btn"))).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
