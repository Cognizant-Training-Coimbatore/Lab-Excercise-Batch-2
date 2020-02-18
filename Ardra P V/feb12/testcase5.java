package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("file:///C:/Users/Admin/Downloads/testcase5.html");
	       WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			System.out.println("rows : " +rows.size());
			Thread.sleep(5000);
			
			WebElement table1=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
			List<WebElement> coloums=table.findElements(By.tagName("td"));
			System.out.println("coloums : " +rows.size());
			Thread.sleep(5000);
			driver.quit();
	}

}
