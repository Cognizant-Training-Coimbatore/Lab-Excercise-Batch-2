package day3exercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\amrutha\\java\\seleniumfile\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/delete_customer.php");
	    driver.findElement(By.name("cusid")).sendKeys("1212@1");
	    driver.findElement(By.name("submit")).click();
	    Thread.sleep(2000);
	   Alert alert=driver.switchTo().alert();
	   alert.accept();
	   Thread.sleep(2000);
	   driver.quit();
	    
	}

}
