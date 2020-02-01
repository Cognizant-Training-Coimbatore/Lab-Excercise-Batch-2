package webdriverdemo;

import java.awt.Dimension;
import java.awt.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ques10 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/sample.html");
		
	
		
		Select product = new Select(driver.findElement(By.xpath("/html/body/select")));
		java.util.List<WebElement> man = driver.findElements(By.xpath("/html/body/select/option[5]"));
		if(man.size() != 0)
		{
		
			System.out.println("MANGOO!!!!!");
		}
		else
		{
		
			System.out.println("SORRYYY");
		}
		int total = product.getOptions().size();
		System.out.println("Number of combo boxes = "+total);
		
		WebElement comb = driver.findElement(By.id("txt1"));
		comb.sendKeys("7");
		
		java.util.List<WebElement> link = driver.findElements(By.tagName("a"));

		System.out.println("No of links = " +link.size()); 
		
		int count=0;
		java.util.List<WebElement> boxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		for(WebElement we1:boxes)
		{
			count++;
		}
		System.out.println("Number of checkboxes : "+count);
		
		
		WebElement com = driver.findElement(By.id("t2"));
		com.sendKeys("3");
		
		
		Random rand = new Random();
		int ra=rand.nextInt(3);
		String s = "check"+ra;
		WebElement ch = driver.findElement(By.id(s));
		ch.click();
		java.util.List<WebElement> check = driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		
		if(ra == 1)
		{
			System.out.println("music");
			System.out.println("spiritual");
		}
		else if(ra==2)
		{
			System.out.println("sports");
			System.out.println("spiritual");
		}
		else
		{
			System.out.println("music");
			System.out.println("sports");
		}
		String title = driver.getTitle();
		System.out.println("Title : "+title);
		
		
	}

}
