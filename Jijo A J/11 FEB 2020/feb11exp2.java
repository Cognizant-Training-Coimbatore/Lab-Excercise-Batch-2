import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb11exp2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("E:\\JIJO A J\\ECLIPSE\\D3\\src\\props.properties");
		Properties p=new Properties();
		p.load(file);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(p.getProperty("url1"));
		driver.findElement(By.id(p.getProperty("uid1"))).sendKeys(p.getProperty("usr"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("btn1"))).click();
		
		driver.findElement(By.id(p.getProperty("pwd1"))).sendKeys(p.getProperty("password"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(p.getProperty("btn2"))).click();
		Thread.sleep(4000);

		driver.quit();

	}

}
