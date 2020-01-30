package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4_clicl_link_enterthestore 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io/");
		WebElement store=driver.findElement(By.linkText("Enter the Store"));
		store.click();
		String s=driver.getTitle();
		Thread.sleep(3000);
		System.out.println(s);
		driver.quit();

	}

}
