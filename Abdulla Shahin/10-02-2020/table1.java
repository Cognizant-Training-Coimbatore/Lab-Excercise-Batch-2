import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Shaheen/table1.html");
		WebElement table = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> rows = table.findElements(By.tagName("td"));
		System.out.println(rows.size());
		
		driver.quit();
	}

}
