package webdriverdemo;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exercise_mango{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/sample.html");
		Select product=new Select(driver.findElement(By.xpath("/html/body/select")));
		product.selectByVisibleText("Mango");
		int size=product.getOptions().size();
		int count=0;
		WebElement text=driver.findElement(By.id("txt1"));
		text.sendKeys("7");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		 System.out.println("number of links are"+links.size());
		List<WebElement> check=driver.findElements(By.cssSelector("input[type='checkbox']"));
		for(WebElement cno:check)
		{
			count++;
		}
		System.out.println("number of checkboxes are : "+count);
		WebElement text2=driver.findElement(By.id("t2"));
		text2.sendKeys("3");
		
		Random rand= new Random();
		int ind=rand.nextInt(check.size());
		
		check.get(ind).click();
		System.out.println(ind);
		if(ind==1)
		{
			System.out.println("music,spiritual");
		}
		else if(ind==2)
		{
			System.out.println("sports,spiritual");
		}
		else if(ind==3)
		{
			System.out.println("sports,music");
		}
		else
		{
			
		}
		
		String name=driver.getTitle();
		
		System.out.println("title is : "+name);
		Thread.sleep(5000);
		driver.quit();
		
		
		}	
		
	

}
