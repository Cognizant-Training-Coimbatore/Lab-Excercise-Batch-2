import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class sample_url {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/sample.html");
		String s=driver.getTitle();
		System.out.println(s);
		
		Select product=new Select(driver.findElement(By.xpath("/html/body/select")));
		int size=product.getOptions().size();
		int i;
		try
		{
		for(i=0;i<size;i++)
		{
			product.selectByIndex(i);
			Thread.sleep(1000);
			String st=product.getFirstSelectedOption().getText();
			if(st.contentEquals("Mango"))
			{
				System.out.println("Mango Exist");
			}
			
				
			
		}
		}
		catch(Exception e)
		{
			System.out.println("Mango does not exist");
		}
		
		System.out.println(size);
		java.util.List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The number of links is:"+links.size());
		java.util.List<WebElement> check=driver.findElements(By.tagName("select"));
		System.out.println("The number of checkbox is:"+check.size());
		
		WebElement count=driver.findElement(By.id("t2"));
		count.sendKeys(String.valueOf(links.size()));
		Random random = new Random();
		int index = random.nextInt(3);  
		System.out.println("Index is "+index);
		WebElement checkBox = driver.findElement(By.xpath("")); 
		Select check1 = new Select(checkBox);
		check1.selectByIndex(index);
		
		
		
		
		driver.quit();

	}
}
	


