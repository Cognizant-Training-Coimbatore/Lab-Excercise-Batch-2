import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/table1.html");
		
		//for finding the number of columns
		//Use xpath for table properties
		WebElement table = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));		
		
		//list collection : for finding multiple columns
		List<WebElement> columns = table.findElements(By.tagName("td"));
		System.out.println(columns.size());
		 
		driver.quit(); 

	}

}
