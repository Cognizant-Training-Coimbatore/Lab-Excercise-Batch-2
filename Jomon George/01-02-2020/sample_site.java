package webdriver_demo;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p1_1_sample_site 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/AppData/Local/Temp/sample.html");
		//Select product=new Select(driver.findElement(By.xpath("/html/body/select/option[5]")));
		Select product1=new Select(driver.findElement(By.xpath("/html/body/select")));
		int size=product1.getOptions().size();
		try
		{
			for(int i=0;i<size;i++)
			{
				product1.selectByIndex(i);
				Thread.sleep(1000);
				String s=product1.getFirstSelectedOption().getText();
				if(s.contentEquals("Mango"))
				{
					System.out.println("Mango exits");
					break;
				}

				
			}
		}
		catch(Exception e)
		{
			System.out.println("Mango does not exit");
		}
		
		System.out.println("No of elements in"+ size);
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		 System.out.println("No of links:"+links.size());
		 java.util.List<WebElement> checkbox = driver.findElements(By.tagName("select"));
		 
		 System.out.println("No of checkbox:"+checkbox.size());
		 WebElement text=driver.findElement(By.id("t2"));
		 text.sendKeys(String.valueOf(links.size()));
		 Thread.sleep(3000);
		driver.quit();
		
	}
	

}