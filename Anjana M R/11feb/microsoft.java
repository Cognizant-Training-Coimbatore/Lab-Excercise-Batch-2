package repository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class microsoft {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("E:\\Java programs\\feb11\\src\\repository\\microsoft.properties");
		Properties prop=new Properties();
		prop.load(file);
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"signinlinkhero\"]/span")).click();
		//Thread.sleep(1000);
		driver.findElement(By.id(prop.getProperty("uid"))).sendKeys(prop.getProperty("uidv"));
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.id(prop.getProperty("pwd"))).sendKeys(prop.getProperty("pwdv"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("btn"))).click();
		Thread.sleep(5000);

		driver.close();
	}

}
