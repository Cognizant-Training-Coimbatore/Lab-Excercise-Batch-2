package labexecise1222020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/Admin/Downloads/testcase8.htm");
		WebElement ab= driver.findElement(By.xpath("/html/body/div/button"));
		 Actions act=new Actions(driver);
		 act.moveToElement(ab).build().perform();
		 driver.findElement(By.linkText("Flipkart")).click();
		 Thread.sleep(2000);
		    driver.quit();
		 
	}

}
