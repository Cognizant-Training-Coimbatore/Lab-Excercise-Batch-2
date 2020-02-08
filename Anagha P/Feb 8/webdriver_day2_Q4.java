package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webdriver_day2_Q4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );		
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		String s=driver.getTitle();
		System.out.println(s);
		Select product=new Select(driver.findElement(By.name("category_id")));
		product.selectByVisibleText("Databases");
		Thread.sleep(1000);
		WebElement search=driver.findElement(By.name("DoSearch"));
		search.click();
		WebElement link1=driver.findElement(By.linkText("Web Database Development"));
		link1.click();
		WebElement quantity=driver.findElement(By.name("quantity"));
		String v=quantity.getAttribute("value");
		System.out.println("Default value:"+v);
		Thread.sleep(5000);
		driver.quit();

	}

}
