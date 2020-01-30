package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prog6 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Select prod=new Select(driver.findElement(By.name("category_id")));
		int total=prod.getOptions().size();
		
		System.out.println(total);
		Thread.sleep(3000);
		driver.quit();
	}

} 
