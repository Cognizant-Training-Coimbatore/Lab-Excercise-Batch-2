package java_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class qn_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		Select count= new Select(driver.findElement(By.name("category_id")));
		int  total=count.getOptions().size();
		System.out.println(total);
		driver.quit();
	}

}
