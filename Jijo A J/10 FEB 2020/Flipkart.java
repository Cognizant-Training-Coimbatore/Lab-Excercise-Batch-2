import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String s="http://flipkart.com";
		driver.get(s);
		WebElement register =driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		WebElement pass =driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		WebElement login =driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
		register.sendKeys("9895639874");
		pass.sendKeys("**********");
		login.click();
		Thread.sleep(5000);
		WebElement srch=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		srch.sendKeys("mobiles");
		Thread.sleep(5000);
		srch.submit();
		WebElement item1=driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));
		item1.click();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    WebElement item2=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button"));
		item2.click();
		WebElement item3=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div/div/div/div[1]/label[1]/div[2]/div/div[1]/button"));
		item3.click();
		WebElement item4=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[3]/div/div/div/div/div[2]/span[2]/button"));
		item4.click();

		
		
	}

}
