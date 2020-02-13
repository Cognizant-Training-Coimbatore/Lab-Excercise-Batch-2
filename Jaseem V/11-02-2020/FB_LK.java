package repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_LK {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\Desktop\\Java Programs\\selenium examples\\src\\repository\\FB_LK.properties");
		Properties prop=new Properties();
		prop.load(file);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Java Programs"
				+ "\\selenium examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id(prop.getProperty("uid"))).sendKeys(prop.getProperty("uidv"));
		driver.findElement(By.id(prop.getProperty("pwd"))).sendKeys(prop.getProperty("pwdv"));
		driver.findElement(By.xpath(prop.getProperty("btn"))).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
