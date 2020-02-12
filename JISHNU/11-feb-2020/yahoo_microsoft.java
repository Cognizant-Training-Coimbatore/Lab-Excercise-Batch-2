package feb11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo_microsoft {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		FileInputStream file=new FileInputStream("E:\\javanewwork space\\selenium examples\\src\\feb11\\yahoo_ms.properties");
		Properties prop=new Properties();
		prop.load(file);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id(prop.getProperty("user"))).sendKeys(prop.getProperty("userv"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("but1"))).click();
		Thread.sleep(10000);
		driver.quit();
	}

}
