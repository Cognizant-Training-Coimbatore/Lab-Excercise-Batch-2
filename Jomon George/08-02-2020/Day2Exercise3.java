package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2Exercise3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver.exe", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://examples.codecharge.com/Store/Default.php");
		
		System.out.println("Title: " + driver.getTitle());	
		Select product = new Select(driver.findElement(By.name("category_id")));
		int size = product.getOptions().size();
		int i;
		for(i=0;i<size;i++)
		{
			product.selectByIndex(i);
			Thread.sleep(500);
			String S = product.getFirstSelectedOption().getText();
			System.out.println(S);
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
