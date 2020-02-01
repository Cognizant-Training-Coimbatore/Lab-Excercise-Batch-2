package seleniumDriver_demo;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Feb1qstn1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/sample.html.htm");
		
		Select product= new Select(driver.findElement(By.xpath("/html/body/select")));
		int size=product.getOptions().size();
		int i;
		for(i=0;i<size;i++)
		{
			product.selectByIndex(i);
			String s=product.getFirstSelectedOption().getText();
			if(s.equals("Mango"))
			{
				System.out.println(s+" is in combo box.");
				break;
			}
		}
		System.out.println("No. of combo box is "+product.getOptions().size());
		
		List<WebElement> checkboxes= driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println("No.of checkboxes is "+checkboxes.size());
		

		WebElement textbox1=driver.findElement(By.id("txt1"));
		textbox1.sendKeys(""+product.getOptions().size());
		
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("No.of links is "+links.size());
		
		WebElement textbox=driver.findElement(By.id("t2"));
		textbox.sendKeys(""+links.size());
		
		Random rand=new Random();
		int randomnumber= rand.nextInt(3);
		String ch="check"+randomnumber;

		WebElement check=driver.findElement(By.id(ch));
		check.click();
/*		List<WebElement> hobbies=driver.findElements(By.cssSelector("input[type='checkbox']"));
		for (WebElement checkbox: hobbies) 
			   System.out.println(checkbox.getText());
*/			   
		System.out.print("Hobbies not selected ");
			if(randomnumber==1)
		{
			System.out.print("Music"+" , ");
			System.out.print("Spiritual");
		}
		else if(randomnumber==2)
		{
			System.out.print("Sports"+" , ");
			System.out.print("Spiritual");
		}
		else
		{
			System.out.print("Sports"+" , ");
			System.out.print("Music");
		}
			
		System.out.println("\nTitle\t:\t"+driver.getTitle());
		Thread.sleep(6000);
		driver.quit();
	}
}