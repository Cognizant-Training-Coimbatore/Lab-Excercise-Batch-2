package reports;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb12_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase4.html.html");
	WebElement abc=	driver.findElement(By.id("c1"));
	abc.click();
	Alert alert=driver.switchTo().alert();
	String s="novels";
	alert.sendKeys("novels");
	alert.accept();
	WebElement cad=driver.findElement(By.id("t1"));
	String s1=cad.getAttribute("value");
	System.out.println(s1);
	Thread.sleep(5000);
	if(s1.contains(s))
	{
		System.out.println("Both are same");
	}
	else
	{
		System.out.println("Both are not same");
	}
	driver.quit();
	}

}
