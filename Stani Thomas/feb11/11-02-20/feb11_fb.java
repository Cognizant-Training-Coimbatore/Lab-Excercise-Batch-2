package repository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb11_fb {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
FileInputStream file=new FileInputStream("D:\\stani\\java\\selenium_examples\\src\\repository\\outlook.properties");
	Properties prop=new Properties();
	prop.load(file);
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	driver.findElement(By.id(prop.getProperty("uid"))).sendKeys(prop.getProperty("uidv"));
	
	driver.findElement(By.id(prop.getProperty("pwd"))).sendKeys(prop.getProperty("pwdv"));
	driver.findElement(By.xpath(prop.getProperty("btn"))).click();
	
	}

}
