package repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_libkedn {

	public static void main(String[] args) throws InterruptedException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\Java programs\\selenium exampls\\src\\repository\\facebook_libkedn.properties");
		Properties prop=new Properties();
		prop.load(file);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java programs\\selenium exampls\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id(prop.getProperty("userid"))).sendKeys(prop.getProperty("useridv"));
		driver.findElement(By.id(prop.getProperty("pswd"))).sendKeys(prop.getProperty("pswdv"));
		driver.findElement(By.xpath(prop.getProperty("button"))).click();
		Thread.sleep(5000);
		driver.quit();
				
	}


	}


