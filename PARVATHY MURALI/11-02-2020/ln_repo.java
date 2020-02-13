package repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ln_repo {

		public static void main(String[] args) throws IOException, InterruptedException {
			{
			FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\java parvathym\\project_selenium\\src\\repository\\in.properties");
			Properties prop=new Properties();
			prop.load(file);
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.findElement(By.xpath(prop.getProperty("sign"))).click();
			driver.findElement(By.id(prop.getProperty("uid"))).sendKeys(prop.getProperty("uidv"));
			driver.findElement(By.id(prop.getProperty("pwd"))).sendKeys(prop.getProperty("pwdv"));
			driver.findElement(By.xpath(prop.getProperty("btn"))).click();
			Thread.sleep(5000);
			driver.quit();

	}

		}
		}
		