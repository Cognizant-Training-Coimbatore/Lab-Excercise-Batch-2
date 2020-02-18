package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("file:///C:/Users/Admin/Downloads/testcase2.html");
	       Select product=new Select(driver.findElement(By.id("country")));
	       List<WebElement> l=product.getOptions();
	       
	       int x=l.size();
	       String y=String.valueOf(x);
	       //System.out.println(l.size());
	       driver.findElement(By.id("t1")).sendKeys(y);
	       Thread.sleep(5000);
	       driver.quit();
	       

	}

	
}
