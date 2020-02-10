import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableVerification {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/table1.html");
		
		//for finding the number of rows
		//Use xpath for table properties
		
		WebElement table = driver.findElement(By.xpath("/html/body/table/tbody"));		
		
		//list collection : for finding multiple rows
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		driver.quit();

	}

}
