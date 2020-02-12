package labexecise1222020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/Admin/Downloads/testcase7.htm");
		 Thread.sleep(2000);
		 WebElement a=driver.findElement(By.xpath("/html/body/img"));
		 Thread.sleep(2000);
		 
		 WebElement b=driver.findElement(By.xpath("/html/body/div"));
		 Actions act=new Actions(driver);
		 act.dragAndDrop(a, a).build().perform();
	Thread.sleep(2000);
	//driver.quit();
	
	}

}
