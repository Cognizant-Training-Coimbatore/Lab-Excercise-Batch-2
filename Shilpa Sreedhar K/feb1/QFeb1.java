import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QFeb1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/sample.html");
		Select product= new Select(driver.findElement(By.xpath("//select")));
		product.selectByVisibleText("Mango");
		int total=product.getOptions().size();
		String y=Integer.toString(total);
		WebElement x= driver.findElement(By.id("txt1"));
		x.sendKeys(y);
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 int total1=links.size();
		 System.out.println("no of links: " +total1);
		 List<WebElement> boxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		 int numberOfBoxes = boxes.size();
		 System.out.println("no of checkboxes: " +numberOfBoxes);
		 String y1=Integer.toString(total1);
			WebElement x1= driver.findElement(By.id("t2"));
			x1.sendKeys(y1);
			Random read=new Random();
			int h=read.nextInt(3);
			if(h==1)
			{
				driver.findElement(By.id("check1")).click();
				System.out.println("music,spiritual");
			}
			else if(h==2)
			{
				driver.findElement(By.id("check2")).click();
				System.out.println("sports,music");
			}
			else
			{
				driver.findElement(By.id("check3")).click();
				System.out.println("music,spiritual");
			}
			String title=driver.getTitle();
			System.out.println("Title is: " +title);
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
