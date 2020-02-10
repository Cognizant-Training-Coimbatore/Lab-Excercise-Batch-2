import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program11_web_driver_q {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/sample.html");
		String s=driver.getTitle();
		System.out.println(s);
		Select product=new Select(driver.findElement(By.xpath("/html/body/select")));
		product.selectByVisibleText("Mango");
		String[] options = driver.findElement(By.xpath("/html/body/select")).getText().split("\n");
		int num=options.length;  //no.of items in combobox
		System.out.println(num);
		String str=Integer.toString(num);
		WebElement text=driver.findElement(By.xpath("//*[@id=\"txt1\"]")); 
		text.sendKeys(str);
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println("No. of checkboxes is: "+checkboxes.size());
		List<WebElement>link=driver.findElements(By.tagName("a"));
		int m=link.size();
		String n=Integer.toString(m);
		driver.findElement(By.id("t2")).sendKeys(n);
		System.out.println("No. of links.."+m);
		Thread.sleep(5000);
Random read=new Random();
int b=read.nextInt(2);
if(b==0)
{
	driver.findElement(By.id("check1")).click();;
	System.out.println("music,spiritual");
}
if(b==1)
{
	driver.findElement(By.id("check1")).click();;
	System.out.println("sports,spiritual");
}
if(b==2)
{
	driver.findElement(By.id("check1")).click();;
	System.out.println("sports,music");
}


	}

}
