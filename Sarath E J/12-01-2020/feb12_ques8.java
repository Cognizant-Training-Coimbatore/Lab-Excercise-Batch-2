package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class feb12_ques8 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Admin/Downloads/testcase8.html");
		
		Actions actions = new Actions(driver);
		WebElement a = driver.findElement(By.xpath("/html/body/div/button"));
		Thread.sleep(3000);
		actions.moveToElement(a).perform();
		
		WebElement b = driver.findElement(By.xpath("/html/body/div/div/a[1]"));
    	b.click();
    	
    	driver.quit();
	}

}
