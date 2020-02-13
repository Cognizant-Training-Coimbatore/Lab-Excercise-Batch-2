package project_selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_flipcart 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("884878898");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("fdgffghfy*");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Harry potter and the order or phoenix book");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Harry Potter and the Order of the Phoenix: Book 5")).click();
		Thread.sleep(2000);
		driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	
		driver.switchTo().window(tabs.get(2));
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();

//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		Thread.sleep(5000);
		
		driver.quit();

	}

}
