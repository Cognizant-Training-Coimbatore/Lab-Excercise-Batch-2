import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase4 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("E://sample.html");
		
	int i=0;
	int n=0;
		List<WebElement> options = driver.findElements(By.tagName("option"));
		for(WebElement option : options)
		{ 
			n++;
			if(("Mango").equals(option.getText()))
			{
				i++;
			}
		}
		if(i==1)
		{
			System.out.println("Mango does exists");
		}
		else
			
		{
			System.out.println("Mango does not exist.");
		}
		
		
		WebElement textbox = driver.findElement(By.id("txt1"));
		textbox.sendKeys(n+"");
		int count1=0;
		List<WebElement> checkbox_count = driver.findElements(By.cssSelector("input[type='checkbox']"));
		for(WebElement op2: checkbox_count)
		{
			count1++;
		}
		
		int count2=0;
		List<WebElement> link_count = driver.findElements(By.tagName("a"));
		for(WebElement op2: link_count)
		{
			count2++;
		}
		
		int count = count1 + count2;
		
		System.out.println(count);
		
		WebElement textbox1 = driver.findElement(By.id("t2"));
		textbox1.sendKeys(count2+"");
		
		
		Random rand = new Random();
		
        int optionIndex = rand.nextInt(checkbox_count.size());
        checkbox_count.get(optionIndex).click();
        System.out.println(optionIndex);

        System.out.println(checkbox_count.get(optionIndex).getText());
  
       
        for(WebElement ele : checkbox_count)
        {
        	System.out.println(ele.getText());
        }
        int in1;
		for(in1=0;in1<checkbox_count.size();in1++) 
		{
	          
	           
			if(in1!=optionIndex) 
			{
				 
				 System.out.println(checkbox_count.get(in1).getText());
			
			}
        }
	
		
        String st = driver.getTitle();//to get title
		System.out.println(st);
		Thread.sleep(5000);
		driver.quit();

	}

}
